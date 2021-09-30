package org.una.bridge;

public class Rojo implements Color {

    @Override
    public void pintar() {
        System.out.println("pintando color de rojo");
    }
}
//De esta manera cada vez que se agrega un nuevo color
//se crea una nueva clase que herede de Color y que eimplemente este metodo, no es necesario modificar nada, simplemnete va a agregando una nueva clase
// es asi como el patron Bridge separa la implementacion de la abstraccion