package org.example;

public class Main {
    public static void main(String[] args) {
        FigurasGeometricas miFigura = new FigurasGeometricas();
        Circulos miFigura2 = new Circulos();
        Triangulos miFigura3 = new Triangulos();
        Cuadrilateros miFigura4 = new Cuadrilateros();

        Circulos miFigura5 = new Circulos(3.00);
        Triangulos miFigura6= new Triangulos(6.00,8.00);
        Cuadrilateros miFigura7= new Cuadrilateros(5.00,5.00);
        Cuadrilateros miFigura8= new Cuadrilateros(5.00,10.00);


        miFigura2.setNombre("La pileta del cec");
        System.out.println(miFigura2.getNombre());
        System.out.println("La nueva pileta tendrá:");
        miFigura2.setRadio(4.00);
        System.out.println(miFigura2.getRadio());
        System.out.println("El area de la pileta del cec es:"+ miFigura2.calcularArea());
        System.out.println(" ");

        miFigura3.setBase(2.0);
        miFigura3.setAltura(5.0);
        miFigura3.setNombre("La piramide del cec");
        System.out.println(miFigura3.getNombre());
        System.out.println("Base es:"+miFigura3.getBase());
        System.out.println("Altura es:"+miFigura3.getAltura());
        System.out.println("El area del triangulo es:"+ miFigura3.calcularArea());
        System.out.println(" ");

        miFigura4.setBase(5.0);
        miFigura4.setAltura(10.00);
        miFigura4.setNombre("El cudrado del cec");
        System.out.println(miFigura4.getNombre());
        System.out.println("Base es:"+miFigura4.getBase());
        System.out.println("Altura es:"+miFigura4.getAltura());
        System.out.println("El area del cuadrilatero es:"+ miFigura4.calcularArea());

        Endecagono miEndecagono = new Endecagono();

        System.out.println(miEndecagono.getNlados());


        //Mi primer cambio

    }
}