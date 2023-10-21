package com.mycompany.sesion12;

public class Circulo extends FiguraGeometrica{

    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    float calcularArea() {
        float Area = 3.1416f * (radio*radio);
        return Area;
    }
    
}
