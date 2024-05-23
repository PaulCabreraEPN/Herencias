package org.example;

public class Circulos extends FigurasGeometricas{
    double radio;
    public Circulos(Double radio){}
    public Circulos(){}

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //metodo personalizado

    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
