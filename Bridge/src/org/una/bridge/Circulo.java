package org.una.bridge;

public class Circulo extends Figura{
    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo...");
        color.pintar();
    }
}
