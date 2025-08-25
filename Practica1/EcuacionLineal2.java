package Practica1;

public class EcuacionLineal2 {
    private double a, b, c, d, e, f;

    public EcuacionLineal2(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        if (!tieneSolucion()) throw new ArithmeticException("Sistema sin solución única.");
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        if (!tieneSolucion()) throw new ArithmeticException("Sistema sin solución única.");
        return (a * f - e * c) / (a * d - b * c);
    }
}
