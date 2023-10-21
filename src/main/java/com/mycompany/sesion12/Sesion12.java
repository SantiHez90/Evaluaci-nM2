package com.mycompany.sesion12;

public class Sesion12 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        System.out.println("El area del circulo 1 es; "+ circulo1.calcularArea());
        
        Cuadrado cuadrado1 = new Cuadrado(10);
        System.out.println("El area del cuadrado 1 es; "+ cuadrado1.calcularArea());
    }
}
