package libreriaTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.MarbleSimulator;
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
public class TestMarbleSimulator {

    MarbleSimulator simulador;

    public TestMarbleSimulator() {
        simulador = new MarbleSimulator();
    }

    @Test
    // Example 3.1.3 - Quantum Computing for Computer Scientists
    public void SistemaDeterministicoClasico() {
        double[][] matrizBool = {{0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 1},
        {0, 0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0, 0},
        {1, 0, 0, 0, 1, 0}};
        double[] estadoInicial = {6, 2, 1, 5, 3, 10};
        simulador.setEstado(estadoInicial);
        simulador.setSistema(matrizBool);
        double[] respuesta= simulador.TerministicoClasico(0);
        double[] esperado = {0, 0, 12, 5, 1, 9};
         for(int i=0;i<esperado.length;i++){
            assertTrue(esperado[i]==respuesta[i]);
        }
    }
     @Test
    public void  programmingDrill321Test(){
        double[][] matrizBool = {{0,0,0,0},
                                 {0,0,0,2.3},
                                 {0,2.3,0,0},
                                 {2.3,0,0,0}};
        double[] estadoInicial = {6,2,5,3};
        simulador.setEstado(estadoInicial);
        simulador.setSistema(matrizBool);
        double[] solucion = simulador.TerministicoClasico(2);
        double[] respuesta = {0,31.739999999999995,15.869999999999997,0};
        for(int i=0;i<respuesta.length;i++){
            assertTrue(respuesta[i]==solucion[i]);
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
