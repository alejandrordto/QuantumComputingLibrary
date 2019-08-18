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
public class operaciones {
    LibreriaComputacion app ;

    public operaciones() {
        app= new LibreriaComputacion(); 
    }
    
    public NumeroComplejo[] sumaVectorial(NumeroComplejo[] v1,NumeroComplejo[] v2){
        NumeroComplejo[] vector= new NumeroComplejo[v2.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=app.suma(v1[i], v2[i]);
            
        }
        return vector;
    }
    public NumeroComplejo[] inversaVectorial (NumeroComplejo[] v1){
        NumeroComplejo[] vector= new NumeroComplejo[v1.length];
        for (int i = 0; i < vector.length; i++) {
            
           vector[i] = new NumeroComplejo(-v1[i].getReal(),-v1[i].getImaginario());
            
        }
        return vector;
    }
    public NumeroComplejo[] multiplicacionEscalarVectorial(NumeroComplejo[] v1, NumeroComplejo nc){
        NumeroComplejo[] vector= new NumeroComplejo[v1.length];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=app.producto(v1[i], nc);
            
        }
        return vector;
    }
    
}