package org.example;

public class Endecagono extends FigurasGeometricas {
    double med_lado;
    double med_area;
    int nlados=11;

    public Endecagono() {
        super("21", 11);
    }

    @Override
    public int getNlados() {
        return nlados;
    }

    @Override

    public void setNlados(int nlados) {
        super.setNlados(nlados);
    }

    public double getMed_lado() {
        return med_lado;
    }

    public void setMed_lado(double med_lado) {
        this.med_lado = med_lado;
    }

    public double getMed_area() {
        return med_area;
    }

    public void setMed_area(double med_area) {
        this.med_area = med_area;
    }

    public void mostrar() {
        System.out.println("El nombre es: " + this.getNombre());

    }
}
