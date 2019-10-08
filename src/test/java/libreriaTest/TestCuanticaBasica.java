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

}
