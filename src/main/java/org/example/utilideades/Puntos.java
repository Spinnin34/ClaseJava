package org.example.utilideades;

public class Puntos {

    public static int puntosClase;

    public static int getPuntos() {
        return puntosClase;
    }

    public static void setPuntos(int CantidadDePuntos) {
        if(CantidadDePuntos >= 0) {
            puntosClase = CantidadDePuntos;
        } else {
            System.out.println("Cantidad de puntos no valida");
        }
    }

    public static void removePuntos(int CantidadDePuntos) {
        if(puntosClase > CantidadDePuntos) {
            puntosClase = puntosClase - CantidadDePuntos;
        } else {
            System.out.println("No tienes suficiente puntos para poder quitarte");
        }
    }

    public static void addPuntos(int CantidadDePuntos) {
        if(CantidadDePuntos > 0) {
            puntosClase = puntosClase + CantidadDePuntos;
        } else {
            System.out.println("Cantidad de puntos no valida");
        }
    }
}