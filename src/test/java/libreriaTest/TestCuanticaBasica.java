/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaTest;

import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.NumeroComplejo;
import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AsusPC
 */
public class TestCuanticaBasica {

    private operaciones operador = new operaciones();

    public TestCuanticaBasica() {
    }
    
    @Test
    public void meanValueTest() throws Exception {
        NumeroComplejo[] ket = new NumeroComplejo[2];
        ket[0] = new NumeroComplejo(Math.sqrt(2) / 2, 0);
        ket[1] = new NumeroComplejo(0, Math.sqrt(2) / 2);
        NumeroComplejo[][] observable = new  NumeroComplejo[2][2];
        observable[0][0] = new  NumeroComplejo(1, 0);
        observable[0][1] = new NumeroComplejo(0, -1);
        observable[1][0] = new  NumeroComplejo(0, 1);
        observable[1][1] = new  NumeroComplejo(2, 0);
         NumeroComplejo expected = new  NumeroComplejo(2.5, 0);
        NumeroComplejo actual = operador.meanValue(ket, observable);
        assertEquals(expected.redondear(), actual.redondear());
    }

    @Test
    public void varianceTest() throws Exception {
         NumeroComplejo[] ket = new  NumeroComplejo[2];
        ket[0] = new NumeroComplejo(Math.sqrt(2) / 2, 0);
        ket[1] = new NumeroComplejo(0, Math.sqrt(2) / 2);
        NumeroComplejo[][] observable = new NumeroComplejo[2][2];
        observable[0][0] = new NumeroComplejo(1, 0);
        observable[0][1] = new NumeroComplejo(0, -1);
        observable[1][0] = new NumeroComplejo(0, 1);
        observable[1][1] = new NumeroComplejo(2, 0);
        NumeroComplejo expected = new NumeroComplejo(0.25, 0);
        NumeroComplejo actual = operador.variance(ket, observable);
        assertEquals(expected, actual);
    }
    @Test
	public void dynamicsTest() throws Exception{
		NumeroComplejo[] initialState = new NumeroComplejo[2];
		initialState[0] = new NumeroComplejo(1, 0);
		initialState[1] = new NumeroComplejo(0,0);
		NumeroComplejo[][][] matrixArray = new NumeroComplejo[4][2][2];
		NumeroComplejo[][] m1 = new  NumeroComplejo[2][2];
		m1[0][0] = new NumeroComplejo(0,0);
		m1[0][1] = new NumeroComplejo(1/Math.sqrt(2), 0);
		m1[1][0] = new NumeroComplejo(1/Math.sqrt(2), 0);
		m1[1][1] = new NumeroComplejo(0,0);
		NumeroComplejo[][] m2 = new  NumeroComplejo[2][2];
		m2[0][0] = new NumeroComplejo(0, 1/Math.sqrt(2));
		m2[0][1] = new NumeroComplejo(0,0);
		m2[1][0] = new NumeroComplejo(0,0);
		m2[1][1] = new NumeroComplejo(1/Math.sqrt(2), 0);
		NumeroComplejo[][] m3 = new NumeroComplejo[2][2];
		m3[0][0] = new NumeroComplejo(1/Math.sqrt(2), 0);
		m3[0][1] = new NumeroComplejo(0,0);
		m3[1][0] = new NumeroComplejo(0,0);
		m3[1][1] = new NumeroComplejo(0, 1/Math.sqrt(2));
		NumeroComplejo[][] m4 = new NumeroComplejo[2][2];
		m4[0][0] = new NumeroComplejo(0,0);
		m4[0][1] = new NumeroComplejo(1/Math.sqrt(2), 0);
		m4[1][0] = new NumeroComplejo(-1/Math.sqrt(2), 0);
		m4[1][1] = new NumeroComplejo(0,0);
		matrixArray[0] = m1;
		matrixArray[1] = m2;
		matrixArray[2] = m3;
		matrixArray[3] = m4;
		NumeroComplejo[] expected = new NumeroComplejo[2];
		expected[0] = new NumeroComplejo(0, 0);
		expected[1] = new NumeroComplejo(0.24999999999999992,0);
		NumeroComplejo[] actual = operador.dynamics(matrixArray, initialState);
		assertEquals(expected, actual);

	}
    @Test
    public void hermitianTest() throws Exception{
        
    }
}
