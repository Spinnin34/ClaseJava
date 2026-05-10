package org.example.utilideades;

public class Dificultad {

    //Esta variable da sentido y estructura a nuestro codigo lo que hace es marcar
    //la dificultad que se ha elegido y asi poder usarla en cualquier parte de nuestro
    //codigo sin tener que volver a escribir el mismo codigo una y otra vez
    private static String dificultadClase;

    public static void setDificultad(String dificultad) {
        switch (dificultad) {
            case "FACIL":
                System.out.println("Has elegido la dificultad facil");
                dificultadClase = "FACIL";
                break;
            case "MEDIA":
                System.out.println("Has elegido la dificultad media");
                dificultadClase = "MEDIA";
                break;
            case "DIFICIL":
                System.out.println("Has elegido la dificultad dificil");
                dificultadClase = "DIFICIL";
                break;
            default:
                System.out.println("Dificultad no reconocida");
        }
    }

    //Getter llamar una variable
    public static String getDificultad() {
        return "La dificultad es " + dificultadClase;
    }


}
