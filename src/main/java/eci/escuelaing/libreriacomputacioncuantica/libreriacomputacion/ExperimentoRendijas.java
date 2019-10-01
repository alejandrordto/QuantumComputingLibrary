/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion;

/**
 *
 * @author AsusPC
 */
public class ExperimentoRendijas {
    private operaciones app;
    
      public MatrizCompleja multipleSlitsExperiment(int slits,  MatrizCompleja adjacencyMatrix,  MatrizCompleja initialState, int timeClicks) throws Exception {
        MatrizCompleja newState = initialState;
        for (int i = 0; i < slits; i++) {
              adjacencyMatrix.setMatriz( app.matrixMultiplication(adjacencyMatrix.getMatriz(), adjacencyMatrix.getMatriz()));
        }
        for (int i = 0; i < timeClicks; i++) {
            newState.setMatriz(app.matrixMultiplication(adjacencyMatrix.getMatriz(),  newState.getMatriz()));
        }
        return newState;
    }
}
