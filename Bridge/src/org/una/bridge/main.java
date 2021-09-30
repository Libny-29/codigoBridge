package org.una.bridge;

public class main {
    public static void main(String[] args){
        Figura[] figura = new Figura[4];
        figura[0] = new Cuadrado(new Azul());
        figura[1] = new Cuadrado(new Rojo());
        figura[2] = new Circulo(new Azul());
        figura[3] = new Circulo(new Rojo());
        for (Figura f : figura){
            System.out.println("------------Figura----------");
            f.dibujar();
        }
    }
}
