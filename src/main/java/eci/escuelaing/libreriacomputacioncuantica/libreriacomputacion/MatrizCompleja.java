/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion;

/**
 *
 * @author Alejandro Rodriguez
 */
import java.lang.reflect.Array;

/**
 *
 * @author ardt1997
 */
public class MatrizCompleja {

    private NumeroComplejo[][] matriz;
    private NumeroComplejo[] vector;
    private boolean esvector;

    public MatrizCompleja(NumeroComplejo[][] matriz) {
        this.matriz = matriz;
        this.esvector = false;
    }

    public MatrizCompleja(NumeroComplejo[] vector) {
        this.vector = vector;
        this.esvector = true;
    }

    public Integer tamaño() {
        if (esvector) {
            return vector.length;
        } else {
            return matriz.length;
        }

    }

    public NumeroComplejo[][] getMatriz() {
        return matriz;
    }

    public NumeroComplejo[] getVector() {
        return vector;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        MatrizCompleja mc = (MatrizCompleja) obj;
        if (this.tamaño() != mc.tamaño()) {
            return false;
        }
        boolean flag = false;
        if (this.esvector) {
            NumeroComplejo[] v1= mc.getVector();
            for (int i = 0; i < vector.length; i++) {
                //boolean=vector[i].equals(v1[i]);
            }
        } else {
            for (int i = 0; i < matriz.length; i++) {
                NumeroComplejo[] numeroComplejos = matriz[i];

            }
        }
        return true;
    }
    
    
}
