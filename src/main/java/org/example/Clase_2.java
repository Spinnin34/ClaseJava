package org.example;

import org.example.utilideades.Dinero;

import java.util.HashMap;

public class Clase_2 {

    //Ahora las variables las vamos intentar siempre poner fuera de los metodos
    //es para poder gestionarlas como queramos a lo largo de la clase.


    public static void main(String[] args) {
        String tellega = "Bueno pues te llega para un ";

        //Le vamos a dar a remu unos 10 euros para el kebab
        Dinero.setDinero(10);

        //El de la tienda le dice cuanto dinero tienes
        System.out.println("Yo tengo " + Dinero.getDinero() + " euros");

        //El del kebab ta va a dar el menu
        switch (Dinero.getDinero()) {
            case 5:
                System.out.println(tellega + "Durum");
                break;
            case 10:
                System.out.println(tellega + "Durum mas patatas");
                break;
            case 15:
                System.out.println(tellega + "Menu completo");
                break;
            default:
                System.out.println("No tienes suficiente dinero para comprar un menu");
        }

        //Remu le acaba de dar al del kebab 5 euros para el durum
        Dinero.removeDinero(5);

        //Oye cuanto dienro tengo
        System.out.println("Yo tengo " + Dinero.getDinero() + " euros");

        HashMap<String, Integer> precios = new HashMap<>();

        precios.put("Durum", 5);
        precios.put("Durum mas patatas", 10);
        precios.put("Menu completo", 15);




    }
}
