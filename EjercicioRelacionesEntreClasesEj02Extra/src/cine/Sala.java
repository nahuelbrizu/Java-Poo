package cine;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sala {
    String[][] asientos = new String[8][6];

    public Sala() {
    }

    public Sala(String[][] asientos) {
        this.asientos = asientos;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public String[][] crearAsientos(){
        String[] fila = {"A","B","C","D","E","F"};
        for (int i = asientos.length - 1; i >= 0;i--){
            for (int x = 0; x < 6; x++){
                asientos[i][x] = asientos.length - i + " " + fila[x] + " ";
            }
        }
        return asientos;
    }

    public String[][] ocupados(String[][] asientos){

        for (int i = asientos.length - 1; i >= 0;i--){
            for (int x = 0; x < 6; x++){
                asientos[i][x] = "x";
            }
        }
        return asientos;
    }

    public void mostarAsientos(String[][] asientos){
        for (String[] asiento:asientos) {
            System.out.println(asiento.toString());
        }
    }
}

/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas).

Para representar la sala con los espectadores vamos a utilizar una matriz.
Los asientos son etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla.
También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
 */