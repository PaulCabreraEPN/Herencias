package org.example;

public class Cuadrilateros extends FigurasGeometricas{
    double base;
    double altura;
    public Cuadrilateros(double base, double altura) {
    }
    public Cuadrilateros() {}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base*altura;
    }
}
