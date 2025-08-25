package Practica1;

import java.util.Scanner;

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números (use punto para decimales):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        Estadistica estadistica = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f%n", estadistica.promedio());
        System.out.printf("La desviación estándar es %.5f%n", estadistica.desviacion());

        scanner.close();
    }
}
