package org.example.utilideades;

import java.util.HashMap;

public class Dinero {

    private static int dineroClase;

    HashMap<String, Integer> precios = new HashMap<>();

    //Fuerza el valor que yo le ponga al construtor si o si
    public static void setDinero(int CantidadDeDinero) {
        //dinero es la variable local y dineroClase es la variable de la clase
        if (CantidadDeDinero > 0){
            dineroClase = CantidadDeDinero;
        } else {
            System.out.println("Cantidad de dinero no valida");
        }
    }

    //llamar a la varibale de la clase
    public static int getDinero() {
        return dineroClase;
    }

    //Esto sirve para agregar dinero a la variable esto se hace para sumar CantidadDeDineroSumar + dineroClase
    public static void addDinero(int CantidadDeDineroSumar) {
        dineroClase = dineroClase + CantidadDeDineroSumar;
    }

    //Esto sirve para poder quitarle el dinero a un jugador
    public static void removeDinero(int CantidadDeDineroQuitar) {
        if (dineroClase > CantidadDeDineroQuitar) {
            dineroClase = dineroClase - CantidadDeDineroQuitar;
        } else {
            System.out.println("No tienes suficiente dinero para quitar esa cantidad");
        }
    }
}
