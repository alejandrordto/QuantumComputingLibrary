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
    public NumeroComplejo[][] sumaMatriz( NumeroComplejo[][] m1,  NumeroComplejo[][] m2){
         NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
         for (int i = 0; i < m1.length; i++) {
            for (int j=0; i< m1[0].length;i++){
                matriz[i][j]= app.suma(m1[i][j],m2[i][j]);
            }
            
        }
        return matriz;
    }
    public  NumeroComplejo[][] inversaMatriz(NumeroComplejo[][] m1){
        NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j=0; i< m1[0].length;i++){
                matriz[i][j]= new NumeroComplejo(-m1[i][j].getReal(),-m1[i][j].getImaginario());
            }
        }
            
        return matriz;
    }
     public  NumeroComplejo[][] multiplicacionEscalarMatriz(NumeroComplejo[][] m1,NumeroComplejo c1){
        NumeroComplejo[][] matriz = new NumeroComplejo[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j=0; i< m1[0].length;i++){
                matriz[i][j]= app.producto(m1[i][j], c1);
            }
        }
        return matriz;
    }
}