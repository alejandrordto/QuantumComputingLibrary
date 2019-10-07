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
    public  double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
    public NumeroComplejo redondear(){
        this.imaginario=redondearDecimales(this.imaginario,3);
        this.real=redondearDecimales(this.real,3);
        return this;
    }
    public double modulus() {
		return  Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginario, 2));
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
     @Override
    public int hashCode(){
        int hash=3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.real) ^ (Double.doubleToLongBits(this.real) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.imaginario) ^ (Double.doubleToLongBits(this.imaginario) >>> 32));
        return hash;
    }
    
}
