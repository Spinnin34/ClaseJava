package org.example;

import org.example.utilideades.Dificultad;

public class Clase_1 {

    public static void main(String[] args) {

        //Tipos primitivos
        byte Byte = 2; //8 bits en memoria numero enteros del -128/127
        byte Byte2 = 32;
        short Short = 100; //16 bits en memoria numero enteros del -32768/32767
        int Int = 4756; //Numero entero Simepre se usa este es el favorito
        long Long = 384762347L; //Numero muy grande pero muy grande y es numero entero y tienes que ponerle una L al final
        float Float = 3.14f; //Numero decimal y tienes que ponerle una f al final es comun hasta cierto punto el mismo rango que int 32 bits
        double Double = 3.7843571836457; //Numero decimal con mas precision que el float 64 bits es el mas comun de los decimanles
        char Char = 'A'; //Aqui puedes meter un solo caracter
        boolean Boolean = true; //Solo puede ser true o false



        String String2 = "Hola Mundo"; //Aqui puedes meter una cadena de texto
        String saludo = String2 + ".";

        int a = 1, b = 2, c = 3, d = 4, e = 5;

        System.out.println(a + b); //Suma
        System.out.println(b - c); //Resta
        System.out.println(d * b); //Multiplicacion

        // == Igual
        // != Distinto
        // > Mayor que
        // < Menor que
        // >= Mayor o igual que
        // <= Menor o igual que

        // && Ambas deben ser true
        // || Al menos una debe ser true
        // !true invierte


        // Cuando se afirma una condicion se ignora el resto
        // else si es false el if/else if de arriba pues el se ejecuta se pueden hacer tantos como quieras
        if ((a == 2 || b == 3) && c == 3) { // false
            System.out.println("Osama tus muertos");
        } else if (d == 4) { // false
            System.out.println("Osama te quiero");
        } else { //No requiere de condicion ose siempre true
            System.out.println("Osama te odio");
        }

        boolean modo = false; //Acabo de usar el commando /fly

        if (!modo) {
            modo = true;
        } else {
            modo = false;
        }

        String dificultad;

        dificultad = "MEDIA";

        //Switch lo que hace es que tu le das un caso y el actua de un modo dependiendo de la respuesta que quieres que de a ese caso
        //Por ejemplo si yo quiero dificitudad dificil pues le mando DIFICIL y el me va enviar "Has elegido la dificultad dificil."
        Dificultad.setDificultad(dificultad);

        System.out.println(Dificultad.getDificultad());

        System.out.println(10 / b); //division
    }
}