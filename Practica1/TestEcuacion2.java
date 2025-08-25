package Practica1;

import java.util.Scanner;
import java.util.Locale;

public class TestEcuacion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.print("Ingrese a, b, c, d, e, f (decimales con punto, o 'salir' para terminar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            input = input.replace(',', '.');

            try {
                String[] valores = input.split("\\s+");
                if (valores.length != 6) {
                    System.out.println("Debe ingresar exactamente 6 valores.");
                    continue;
                }

                double a = Double.parseDouble(valores[0]);
                double b = Double.parseDouble(valores[1]);
                double c = Double.parseDouble(valores[2]);
                double d = Double.parseDouble(valores[3]);
                double e = Double.parseDouble(valores[4]);
                double f = Double.parseDouble(valores[5]);

                EcuacionLineal2 ecuacion = new EcuacionLineal2(a, b, c, d, e, f);

                if (ecuacion.tieneSolucion()) {
                    System.out.printf("x = %.1f, y = %.1f%n", ecuacion.getX(), ecuacion.getY());
                } else {
                    System.out.println("La ecuación no tiene solución.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Error: ingrese solo números válidos.");
            }
        }

        scanner.close();
        System.out.println("Programa terminado.");
    }
}
