package libreriaTest;



import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.LibreriaComputacion;
import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.NumeroComplejo;
import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.NumeroPolar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authorAlejandro
 */
public class libreriaTest {
    
     @Test
    public void sumaTest() {
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(6,5);
        NumeroComplejo nc2 = new NumeroComplejo(1,-5);
        NumeroComplejo respuesta = app.suma(nc1, nc2);
        NumeroComplejo esperado = new NumeroComplejo(7,0);
        assertEquals(respuesta, esperado);
    }
     @Test
    public void restaTest() {
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(6,5);
        NumeroComplejo nc2 = new NumeroComplejo(1,-5);
        NumeroComplejo respuesta = app.resta(nc1, nc2);
        NumeroComplejo esperado = new NumeroComplejo(5,10);
        assertEquals(respuesta, esperado);
        
    }
     @Test
    public void multiplicacionTest() {
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(2,1);
        NumeroComplejo nc2 = new NumeroComplejo(2,2);
        NumeroComplejo respuesta = app.producto(nc1, nc2);
        NumeroComplejo esperado = new NumeroComplejo(2,6);
        assertEquals(respuesta, esperado);
    }
     @Test
    public void divicionTest() {
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(4,2);
        NumeroComplejo nc2 = new NumeroComplejo(0,1);
        NumeroComplejo respuesta = app.division(nc1, nc2);
        NumeroComplejo esperado = new NumeroComplejo(2,-4);
        assertEquals(respuesta, esperado);
    }
    @Test
    public void pruebaconjugado(){
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(67,4);
        NumeroComplejo respuesta = app.conjugado(nc1);
        NumeroComplejo esperado = new NumeroComplejo(67,-4);
        assertEquals(respuesta, esperado);
    }
    
    @Test
    public void puebaFase(){
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(0,1);
        double esperado = 90;
        double respuesta =app.fase(nc1);
        assertEquals(respuesta, esperado,0);
    }
     @Test
    public void pruebaModulo(){
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(0,1);
        double esperado = 1;
        double respuesta = app.modulo(nc1);
        assertEquals(respuesta, esperado,0);
    }
    @Test
    public void pruebaACartesiano(){
        LibreriaComputacion app = new LibreriaComputacion();
       NumeroPolar nc1 = new NumeroPolar(36.86989764584402,5);
        NumeroComplejo respuesta = app.aCartesiano(nc1);
        NumeroComplejo esperado = new NumeroComplejo(4,3);
        assertEquals(respuesta, esperado);
    }
     @Test
    public void pruebaiTest() {
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo nc1 = new NumeroComplejo(0,1);
        NumeroComplejo nc2 = new NumeroComplejo(0,1);
        NumeroComplejo respuesta = app.producto(nc1, nc2);
        NumeroComplejo esperado = new NumeroComplejo(-1,0);
        assertEquals(respuesta, esperado);
    }
    
}
