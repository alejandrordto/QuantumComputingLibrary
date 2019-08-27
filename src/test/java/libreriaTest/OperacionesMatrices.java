/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaTest;

import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.NumeroComplejo;
import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.operaciones;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Alejandro rodriguez 
 */
public class OperacionesMatrices {
    
    private operaciones operador = new operaciones();
    
    @Test
    public void adicionVectorial(){
        
        NumeroComplejo[] lista = new NumeroComplejo[2];
        NumeroComplejo[] listaDos = new NumeroComplejo[2];
        NumeroComplejo[] esperado = new NumeroComplejo[2];
        lista[0] =new NumeroComplejo(0,1);
        lista[1] = new NumeroComplejo(1,0);
        listaDos[0] = new NumeroComplejo(1,0);
        listaDos[1]= new NumeroComplejo(0,1);
        esperado[0] = new NumeroComplejo(1,1);
        esperado[1] = new NumeroComplejo(1,1);
        NumeroComplejo[] respuesta = operador.sumaVectorial(lista, listaDos);
        assertEquals(respuesta,esperado);
    }
    @Test
    public void inversaVectorial(){
        
        NumeroComplejo[] lista = new NumeroComplejo[2];
        NumeroComplejo[] esperado = new NumeroComplejo[2];
        lista[0] =new NumeroComplejo(1,-1);
        lista[1] = new NumeroComplejo(-1,1);
        esperado[0] = new NumeroComplejo(-1,1);
        esperado[1] = new NumeroComplejo(1,-1);
        NumeroComplejo[] respuesta = operador.inversaVectorial(lista);
        assertEquals(respuesta,esperado);
    }
    @Test
    public void EscalarVectorial(){
        
        NumeroComplejo[] lista = new NumeroComplejo[2];
        NumeroComplejo[] esperado = new NumeroComplejo[2];
        lista[0] =new NumeroComplejo(1,2);
        lista[1] = new NumeroComplejo(3,4);
        esperado[0] = new NumeroComplejo(3,6);
        esperado[1] = new NumeroComplejo(9,12);
        NumeroComplejo nc = new NumeroComplejo(3,0);
        NumeroComplejo[] respuesta = operador.multiplicacionEscalarVectorial(lista, nc);
        assertEquals(respuesta,esperado);
    }
    @Test
    public void adicionMatriz(){
        
        NumeroComplejo[] lista = new NumeroComplejo[2];
        NumeroComplejo[] listaDos = new NumeroComplejo[2];
        NumeroComplejo[] esperado = new NumeroComplejo[2];
        lista[0] =new NumeroComplejo(0,1);
        lista[1] = new NumeroComplejo(1,0);
        listaDos[0] = new NumeroComplejo(1,0);
        listaDos[1]= new NumeroComplejo(0,1);
        esperado[0] = new NumeroComplejo(1,1);
        esperado[1] = new NumeroComplejo(1,1);
        NumeroComplejo[] respuesta = operador.sumaVectorial(lista, listaDos);
        assertEquals(respuesta,esperado);
    }
}
