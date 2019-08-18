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

    public MatrizCompleja( NumeroComplejo[][] matriz) {
        this.matriz = matriz;
        this.esvector= false;
    }
     public MatrizCompleja( NumeroComplejo[]vector) {
        this.vector = vector;
        this.esvector=true;
    }
    @Override
    public String toString() {
        String cadena="";
        if (this.esvector){
            cadena="MatrizCompleja{" + "vector=" + vector + '}';
        }else{
            cadena="MatrizCompleja{" + "matriz=" + matriz + '}';
        }
        return cadena;
    }
    
    
}

