package eci.escuelaing.libreriacomputacioncuantica.libreriacomputacion;

/**
 *
 * @author Alejandro Rodriguez
 */
public class MarbleSimulator {

    private double[][] sistema;
    private double[] estado;
    private NumeroComplejo[] estadoC;
    private NumeroComplejo[][] sistemaC;
    private LibreriaComputacion app;

    public MarbleSimulator() {
        app = new LibreriaComputacion();
    }
    public double[] TerministicoClasico(int Nclick) {
        double[] answer = new double[estado.length];
        double[] estadoX =estado;
        while (Nclick > 0) {
            for (int i = 0; i < sistema.length; i++) {
                double value;
                value = 0.0;
                for (int j = 0; j < answer.length; j++) {
                    value = value + (sistema[i][j] * estadoX[j]);
                }
                answer[i] = value;

            }
            Nclick = Nclick - 1;
            estadoX=answer;
        }
        return answer;
    }

    public void setSistema(double[][] sistema) {
        this.sistema = sistema;
    }

    public void setEstado(double[] estado) {
        this.estado = estado;
    }

    public double[] getEstado() {
        return estado;
    }

    public double[][] getSistema() {
        return sistema;
    }
    
    public NumeroComplejo[] Cuanticosyrendija(int Nclick) {
        NumeroComplejo[] answer = new NumeroComplejo[sistema.length];
        NumeroComplejo[] estadoX = estadoC;
        while (Nclick > 0) {
            for (int i = 0; i < sistema.length; i++) {
                NumeroComplejo value;
                value = new NumeroComplejo(0, 0);
                for (int j = 0; j < answer.length; j++) {
                    value = app.suma(value, app.producto(sistemaC[i][j], estadoX[j]));
                }
                answer[i] = value;

            }
            Nclick = Nclick - 1;
            estadoX = answer;
        }
        return answer;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        NumeroComplejo[] estado = (NumeroComplejo[]) obj;
        if (this.estado.length != estado.length) {
            return false;
        }
        boolean flag = false;
        for (int i = 0; i < estado.length; i++) {
            //boolean=this.estado[i].equals(estado[i]);
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;

        hash = 70 * hash + (int) (Double.doubleToLongBits(this.estado.hashCode()) ^ (Double.doubleToLongBits(this.estado.hashCode()) >>> 32));

        return hash;
    }
}
