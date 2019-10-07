/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaTest;

import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.NumeroComplejo;
import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.operaciones;
import java.util.HashMap;
import java.util.Map;
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
public class TestMarble {
    
    private operaciones operador = new operaciones();
    public TestMarble() {
    }
    public NumeroComplejo[] redondear(NumeroComplejo[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i]=v[i].redondear();
            
        }
        return v;
    }
    @Test
	public void marblesExperimentTest() throws Exception {
		NumeroComplejo[][] A = new NumeroComplejo[3][3];
		A[0][0] = new NumeroComplejo(1.0/Math.sqrt(2), 0);
		A[0][1] = new NumeroComplejo(1.0/Math.sqrt(2), 0);
		A[0][2] = new NumeroComplejo(0, 0);
		A[1][0] = new NumeroComplejo(0, -1.0/Math.sqrt(2));
		A[1][1] = new NumeroComplejo(0, 1.0/Math.sqrt(2));
		A[1][2] = new NumeroComplejo(0, 0);
		A[2][0] = new NumeroComplejo(0, 0);
		A[2][1] = new NumeroComplejo(0, 0);
		A[2][2] = new NumeroComplejo(0, 1);
		NumeroComplejo[] X = new NumeroComplejo[3];
		X[0] = new NumeroComplejo(1.0/Math.sqrt(3), 0);
		X[1] = new NumeroComplejo(0, 2.0/Math.sqrt(15));
		X[2] = new NumeroComplejo (Math.sqrt(2.0/5.0), 0);
		NumeroComplejo[] expected = new NumeroComplejo[3];
		expected[0] = new NumeroComplejo(1.0/Math.sqrt(6), 2.0/Math.sqrt(30));
		expected[1] = new NumeroComplejo(-2.0/Math.sqrt(30), -Math.sqrt(5)/Math.sqrt(30));
		expected[2] = new NumeroComplejo(0, Math.sqrt(2.0/5.0));
		NumeroComplejo[] actual = operador.marblesExperiment(A, X, 1);
                expected=redondear(expected);
                actual=redondear(actual);
		assertEquals(expected, actual);
	}
        @Test
	public void multiSlitExperimentTest() throws Exception {
		int slits = 2;
		int targets = 5;
		Map<String, NumeroComplejo> p = new HashMap<>();
		p.put("0 1", new NumeroComplejo(1.0/Math.sqrt(2), 0));
		p.put("0 2", new NumeroComplejo(1.0/Math.sqrt(2), 0));
		p.put("1 3", new NumeroComplejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6)));
		p.put("1 4", new NumeroComplejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
		p.put("1 5", new NumeroComplejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
		p.put("2 5", new NumeroComplejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6)));
		p.put("2 6", new NumeroComplejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
		p.put("2 7", new NumeroComplejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6)));
		NumeroComplejo[][] expectedMatrix = new NumeroComplejo[8][8];
		expectedMatrix[0][0] = new NumeroComplejo(0, 0);
		expectedMatrix[0][1] = new NumeroComplejo(0, 0);
		expectedMatrix[0][2] = new NumeroComplejo(0, 0);
		expectedMatrix[0][3] = new NumeroComplejo(0, 0);
		expectedMatrix[0][4] = new NumeroComplejo(0, 0);
		expectedMatrix[0][5] = new NumeroComplejo(0, 0);
		expectedMatrix[0][6] = new NumeroComplejo(0, 0);
		expectedMatrix[0][7] = new NumeroComplejo(0, 0);
		expectedMatrix[1][0] = new NumeroComplejo(0, 0);
		expectedMatrix[1][1] = new NumeroComplejo(0, 0);
		expectedMatrix[1][2] = new NumeroComplejo(0, 0);
		expectedMatrix[1][3] = new NumeroComplejo(0, 0);
		expectedMatrix[1][4] = new NumeroComplejo(0, 0);
		expectedMatrix[1][5] = new NumeroComplejo(0, 0);
		expectedMatrix[1][6] = new NumeroComplejo(0, 0);
		expectedMatrix[1][7] = new NumeroComplejo(0, 0);
		expectedMatrix[2][0] = new NumeroComplejo(0, 0);
		expectedMatrix[2][1] = new NumeroComplejo(0, 0);
		expectedMatrix[2][2] = new NumeroComplejo(0, 0);
		expectedMatrix[2][3] = new NumeroComplejo(0, 0);
		expectedMatrix[2][4] = new NumeroComplejo(0, 0);
		expectedMatrix[2][5] = new NumeroComplejo(0, 0);
		expectedMatrix[2][6] = new NumeroComplejo(0, 0);
		expectedMatrix[2][7] = new NumeroComplejo(0, 0);
		expectedMatrix[3][0] = new NumeroComplejo(-1.0/Math.sqrt(12), 1.0/Math.sqrt(12));
		expectedMatrix[3][1] = new NumeroComplejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6));
		expectedMatrix[3][2] = new NumeroComplejo(0, 0);
		expectedMatrix[3][3] = new NumeroComplejo(1, 0);
		expectedMatrix[3][4] = new NumeroComplejo(0, 0);
		expectedMatrix[3][5] = new NumeroComplejo(0, 0);
		expectedMatrix[3][6] = new NumeroComplejo(0, 0);
		expectedMatrix[3][7] = new NumeroComplejo(0, 0);
		expectedMatrix[4][0] = new NumeroComplejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
		expectedMatrix[4][1] = new NumeroComplejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
		expectedMatrix[4][2] = new NumeroComplejo(0, 0);
		expectedMatrix[4][3] = new NumeroComplejo(0, 0);
		expectedMatrix[4][4] = new NumeroComplejo(1, 0);
		expectedMatrix[4][5] = new NumeroComplejo(0, 0);
		expectedMatrix[4][6] = new NumeroComplejo(0, 0);
		expectedMatrix[4][7] = new NumeroComplejo(0, 0);
		expectedMatrix[5][0] = new NumeroComplejo(0, 0);
		expectedMatrix[5][1] = new NumeroComplejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
		expectedMatrix[5][2] = new NumeroComplejo(-1.0/Math.sqrt(6), 1.0/Math.sqrt(6));
		expectedMatrix[5][3] = new NumeroComplejo(0, 0);
		expectedMatrix[5][4] = new NumeroComplejo(0, 0);
		expectedMatrix[5][5] = new NumeroComplejo(1, 0);
		expectedMatrix[5][6] = new NumeroComplejo(0, 0);
		expectedMatrix[5][7] = new NumeroComplejo(0, 0);
		expectedMatrix[6][0] = new NumeroComplejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
		expectedMatrix[6][1] = new NumeroComplejo(0, 0);
		expectedMatrix[6][2] = new NumeroComplejo(-1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
		expectedMatrix[6][3] = new NumeroComplejo(0, 0);
		expectedMatrix[6][4] = new NumeroComplejo(0, 0);
		expectedMatrix[6][5] = new NumeroComplejo(0, 0);
		expectedMatrix[6][6] = new NumeroComplejo(1, 0);
		expectedMatrix[6][7] = new NumeroComplejo(0, 0);
		expectedMatrix[7][0] = new NumeroComplejo(1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
		expectedMatrix[7][1] = new NumeroComplejo(0, 0);
		expectedMatrix[7][2] = new NumeroComplejo(1.0/Math.sqrt(6), -1.0/Math.sqrt(6));
		expectedMatrix[7][3] = new NumeroComplejo(0, 0);
		expectedMatrix[7][4] = new NumeroComplejo(0, 0);
		expectedMatrix[7][5] = new NumeroComplejo(0, 0);
		expectedMatrix[7][6] = new NumeroComplejo(0, 0);
		expectedMatrix[7][7] = new NumeroComplejo(1, 0);
		NumeroComplejo[][] actualMatrix = (NumeroComplejo[][]) operador.multiSlitExperiment(slits, targets, p).get(0);
		NumeroComplejo[] expectedVector = new NumeroComplejo[8];
		expectedVector[0] = new NumeroComplejo(0,0);
		expectedVector[1] = new NumeroComplejo(0,0);
		expectedVector[2] = new NumeroComplejo(0,0);
		expectedVector[3] = new NumeroComplejo(-1.0/Math.sqrt(12), 1.0/Math.sqrt(12));
		expectedVector[4] = new NumeroComplejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
		expectedVector[5] = new NumeroComplejo(0,0);
		expectedVector[6] = new NumeroComplejo(-1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
		expectedVector[7] = new NumeroComplejo(1.0/Math.sqrt(12), -1.0/Math.sqrt(12));
		NumeroComplejo[] actualVector = (NumeroComplejo[]) operador.multiSlitExperiment(slits, targets, p).get(1);
		assertEquals(expectedMatrix, actualMatrix);
		assertEquals(expectedVector, actualVector);
	}
}
    
  
