package entidades;

import java.util.Scanner;

public class ServicioCadena {

    private  Scanner inp = new Scanner(System.in).useDelimiter("\n");

    public ServicioCadena() {
    }

    public String mostrarVocales(String frase){
        int cont = 1;
        for(int i = 0; i < frase.length(); i++){
          char letra = frase.charAt(i);
          if (esVocal(letra)){
              System.out.printf("la cantidad de vocales que tiene la frase es : " + cont);
              cont++;
          }
        }
        System.out.println();
        return frase;
    }

    public boolean esVocal(char letra){
        letra = Character.toLowerCase(letra);
        return letra == 'a' ||letra == 'i' || letra == 'e'|| letra == 'o' || letra == 'u';
    }


    public String invertirFrase(String frase) {
        //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        String fraseInvertida= "";
        for(int i = frase.length() -1; i >= 0; i--) {
            char letra = frase.charAt(i);
            fraseInvertida += letra;
        }
        System.out.println();
        return fraseInvertida;
    }
    public int vecesRepetido(String frase){
        //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
        //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        int cont = 1;
        System.out.printf("ingrese un caracter para descubrir cuantas veces se repite");
        String caract = inp.next();
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if (caract.equalsIgnoreCase(String.valueOf(letra))){
                System.out.println("El carácter " + caract + " se repite " + cont +  "veces ");
                cont++;
            }
        }
        System.out.println();
        return cont;
    }

    public int compararLong(String frase){
        //Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.

        System.out.print("ingrese una frase para comparar : ");
        String frase2 = inp.nextLine();
        if (frase2.length() > frase.length()){
            System.out.println("la segunda frase ingresada por el usuario es mas grande ");
            return frase2.length();
        } else {
            System.out.println("la primer frase ingresada por el usuario es mas grande ");
            return frase.length();

        }

    }
    public String unirFrases(String frase){
        //Método unirFrases(String frase), deberá unir la frase contenida en la clase entidades.Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        System.out.print("ingrese una frase para unir : ");
        String frase2 = inp.nextLine();
        frase += " " + frase2;
        System.out.println();

        return frase;
    }


    public String remplazar(String frase, String reemplazo){
        //Método reemplazar(String letra),
        // deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
        String mix = "";
        String frase2 = reemplazo;
        for (int i =0; i < frase.length();i++){
            char letra = frase.charAt(i);
            if (!String.valueOf(letra).equalsIgnoreCase("a")){
                mix += letra;
                System.out.println(letra);
            } else {
                mix += frase2;
                System.out.println(frase2);
            }
        }
        System.out.println();

        return mix;
    }

    public boolean contiene(String frase){
        //Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

        System.out.print("ingrese una frase para comparar : ");
        String frase2 = inp.nextLine();
        for (int i = 0; i < frase.length();i++){
            char letra = frase.charAt(i);
            if (!frase2.equalsIgnoreCase(String.valueOf(letra))){
                return true;
            } else {
                return false;
            }
        }
        System.out.println();

        return true;
    }

}




/*
que tenga como atributos una frase (String) y su longitud.
 Agregar constructor vacío y conatributo frase solamente. Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
  Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase entidades.Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
