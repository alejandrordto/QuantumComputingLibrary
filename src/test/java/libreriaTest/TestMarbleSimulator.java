package libreriaTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.MarbleSimulator;
import eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion.NumeroComplejo;
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
        NumeroComplejo uno=new NumeroComplejo(1, 0);
        NumeroComplejo cero=new NumeroComplejo(0, 0);
        NumeroComplejo[][] matrizBool = {{cero, cero,cero, cero, cero,cero},
        {cero, cero,cero, cero, cero,cero},
        {cero, uno, cero, cero, cero, uno},
        {cero, cero, cero, uno, cero, cero},
        {cero, cero, uno, cero, cero, cero},
        {uno, cero, cero, cero, uno, cero}};
        NumeroComplejo [] estadoInicial = {new NumeroComplejo(6, 0),
            new NumeroComplejo(2, 0), uno, new NumeroComplejo(5, 0), 
            new NumeroComplejo(3, 0), new NumeroComplejo(10, 0)};
        simulador.setEstado(estadoInicial);
        simulador.setSistema(matrizBool);
        NumeroComplejo[] respuesta= simulador.TerministicoClasico(0);
        NumeroComplejo[] esperado = {cero, cero, new NumeroComplejo(12, 0), 
            new NumeroComplejo(5, 0), uno, new NumeroComplejo(9, 0)};
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
