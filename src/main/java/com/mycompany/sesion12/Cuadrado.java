package com.mycompany.sesion12;

public class Cuadrado extends FiguraGeometrica{

    private float lado;
    
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    float calcularArea() {
        return lado * lado;
    }
    
}
