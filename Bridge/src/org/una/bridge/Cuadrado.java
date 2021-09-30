package org.una.bridge;

public class Cuadrado extends Figura{
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando cuadadrado...");
        color.pintar();
    }
}
