    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Rodriguez
 */
public class LibreriaComputacion {


    public LibreriaComputacion() {
    }

    public NumeroComplejo suma(NumeroComplejo a, NumeroComplejo b) {
        double real = a.getReal() + b.getReal();
        double imaginario = a.getImaginario() + b.getImaginario();
        NumeroComplejo nc = new NumeroComplejo(real, imaginario);
        return nc;
    }

    public NumeroComplejo resta(NumeroComplejo a, NumeroComplejo b) {
        double real = a.getReal() - b.getReal();
        double imaginario = a.getImaginario() - b.getImaginario();
        NumeroComplejo nc = new NumeroComplejo(real, imaginario);
        return nc;
    }

    public NumeroComplejo producto(NumeroComplejo a, NumeroComplejo b) {
        double real = a.getReal()*b.getReal()-a.getImaginario()*b.getImaginario();
        double imaginario= a.getReal()*b.getImaginario()+b.getReal()*a.getImaginario();
        NumeroComplejo nc = new NumeroComplejo(real, imaginario);
        return nc;
    }

    public NumeroComplejo division(NumeroComplejo a, NumeroComplejo b) {
        double real= (a.getReal()*b.getReal()+a.getImaginario()*b.getImaginario())/(Math.pow(b.getReal(),2)+ Math.pow(b.getImaginario(),2));
        double imaginario= (a.getImaginario()*b.getReal() - a.getReal()*b.getImaginario())/(Math.pow(b.getReal(),2)+ Math.pow(b.getImaginario(),2));
        NumeroComplejo nc = new NumeroComplejo(real, imaginario);
        return nc;
    }

    public double modulo(NumeroComplejo a) {
        double real = Math.sqrt(Math.pow(a.getReal(), 2) + Math.pow(a.getImaginario(), 2));
        return real;
    }

    public NumeroComplejo conjugado(NumeroComplejo a) {
        NumeroComplejo nc = new NumeroComplejo(a.getReal(),-a.getImaginario());
        return nc;
    }
    public NumeroPolar aPolar(NumeroComplejo a){
        double radio = modulo(a);
        double rads = Math.atan(a.getImaginario()/a.getReal());
        NumeroPolar np= new NumeroPolar(Math.toDegrees(rads),radio); 
        return np;
    }
    public NumeroComplejo aCartesiano (NumeroPolar a){
         double radio = a.getRadio();
        double radian = Math.toRadians(a.getAngulo()); 
        NumeroComplejo nc= new NumeroComplejo(radio*Math.cos(radian),radio*Math.sin(radian));
        return nc;
    }
    public double fase(NumeroComplejo a){
        double rads = Math.atan(a.getImaginario()/a.getReal());
        double angulo = Math.toDegrees(rads);
        return angulo;
    }
    public static void main(String[] args) {
        LibreriaComputacion app = new LibreriaComputacion();
        NumeroComplejo a = new NumeroComplejo(4,2);
        NumeroComplejo b = new NumeroComplejo(0,1);
        NumeroPolar c = new NumeroPolar(36.86989764584402,5);
        System.out.println("suma :" + app.suma(a, b));
        System.out.println("resta :" + app.resta(a, b));
        System.out.println("Producto :" + app.producto(a, b));
        System.out.println("division :"+app.division(a, b));
        System.out.println("Modulo :" + app.modulo(a));
        System.out.println("Conjugado :" + app.conjugado(a));
        System.out.println("Cartesiano a Polar :" + app.aPolar(a));
        System.out.println("Polar a Cartesiano :" + app.aCartesiano(c));
         System.out.println("Fase :" + app.fase(a));
    }

}
