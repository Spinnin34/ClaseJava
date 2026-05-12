package org.example;

public class Clase_3 {

    public static void main(String[] args) {

        //Lista de nombre esto es un Array y se usa para que una misma variable pueda almacenar varios cosas del mismo tipo
        //Como partimos de el 0 pues siempre que conteis las cosas restarle -1
        //Ojo con la sintaxis
        String[] jugadores = {
                "Remu",
                "Pablo",
                "Sergio",
                "Jorge",
                "Alvaro",
                "Spinnin"
        };

        //for(inicializacion; condicion; actualizacion)
        for(int repeticiones = 0; repeticiones < 7; repeticiones++) {

            //El try lo que hace es que en el caso de que falle algo del codigo dentro del try pues ejecuta otra cosa para que el codigo no se corte
            try {
                //Aqui imprimimos la lista de jugadores de nuestra varibale de arriba para ello nos aprobecamos de repeticiones que va incrementando
                //Para usar el array de arriba se tiene que poner el nombre de la varibale y [numero] de la posicion
                System.out.println(jugadores[repeticiones]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No hay mas jugadores en la lista");
            }
        }
    }
}
