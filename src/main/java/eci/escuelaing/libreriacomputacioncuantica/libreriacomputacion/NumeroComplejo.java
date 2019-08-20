/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion;

/**
 *
 * @author 2112107
 */
public class NumeroComplejo {
    private double real;
    private double imaginario;

    public NumeroComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        String simbolo = "";
        if(imaginario >= 0){
            simbolo="+";
        }
        return   real + simbolo + imaginario + 'i';
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    @Override
    public boolean equals(Object obj) { 
        if (this == obj){
            return true;
        } else if (this.getClass()!= obj.getClass()){
            return false;
        }
        NumeroComplejo nc=(NumeroComplejo) obj;
        Boolean flag = this.real == nc.getReal() && this.imaginario == nc.getImaginario();
        return flag;
    }
    
}
