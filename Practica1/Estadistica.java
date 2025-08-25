// Archivo: Practica1/Estadistica.java
package Practica1;

public class Estadistica {
    private double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;
        for (double num : numeros) suma += num;
        return suma / numeros.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (double num : numeros) sumaCuadrados += (num - prom) * (num - prom);
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}

