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
public class TestParticula {

    private operaciones operador = new operaciones();

    public TestParticula() {
    }
    @Test
    public void probabilityTest() {
        NumeroComplejo[] state = new  NumeroComplejo[4];
        state[0] = new NumeroComplejo(-3, -1);
        state[1] = new  NumeroComplejo(0, -2);
        state[2] = new  NumeroComplejo(0, 1);
        state[3] = new  NumeroComplejo(2, 0);
        int position = 2;
        Double expected = 0.052624;
        Double actual = operador.AmplitudeProbability(state, position);
        assertEquals(expected, actual, 0.0001);
    }
    @Test
	public void transitionAmplitudeTest() throws Exception {
		NumeroComplejo[] startState =new NumeroComplejo[2];
		startState[0] = new NumeroComplejo(Math.sqrt(2) / 2, 0);
		startState[1] = new NumeroComplejo(0, Math.sqrt(2) / 2);
		NumeroComplejo[] endState =new NumeroComplejo[2];
		endState[0] = new NumeroComplejo(0,Math.sqrt(2) / 2);
		endState[1] = new NumeroComplejo(-Math.sqrt(2) / 2, 0);
		NumeroComplejo expected = new NumeroComplejo(0, -1);
		NumeroComplejo actual = operador.transitionAmplitude(startState, endState);
		assertEquals(expected.redondear(), actual.redondear());
	}
}
