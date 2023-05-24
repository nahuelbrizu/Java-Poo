import entidades.Cadena;
import entidades.ServicioCadena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase:");
        String fraseIngresada = scanner.nextLine();
        System.out.println();

        Cadena frase = new Cadena();
        frase.setFrase(fraseIngresada);
        ServicioCadena cadenaServicio = new ServicioCadena();
        System.out.println();

        // Mostrar vocales
        System.out.print("Cantidad de vocales: " + cadenaServicio.mostrarVocales(fraseIngresada));

        // Invertir frase
        System.out.print("Frase invertida: " + cadenaServicio.invertirFrase(fraseIngresada));

        // Contar repeticiones de un carácter
        System.out.print("Ingrese un carácter:");
        String letra = scanner.nextLine();
        int repeticiones = cadenaServicio.vecesRepetido(letra);
        System.out.println();
        System.out.println("El carácter '" + letra + "' se repite " + repeticiones + " veces.");
        System.out.println();

        // Comparar longitud de frases
        System.out.print("Ingrese una nueva frase:");
        String nuevaFrase = scanner.nextLine();
         cadenaServicio.compararLong(nuevaFrase);
        System.out.println();

        // Unir frases
        System.out.print("Ingrese una nueva frase:");
        nuevaFrase = scanner.nextLine();
        String fraseUnida = cadenaServicio.unirFrases(nuevaFrase);
        System.out.println("Frase resultante: " + fraseUnida);

        // Reemplazar letra
        System.out.print("Ingrese una letra a reemplazar:");
        letra = scanner.nextLine();
        System.out.print("Ingrese el carácter de reemplazo:");
        String reemplazo = scanner.nextLine();
        String fraseReemplazada = cadenaServicio.remplazar(letra, reemplazo);
        System.out.println("Frase resultante: " + fraseReemplazada);

        // Comprobar si contiene letra
        System.out.print("Ingrese una letra:");
        letra = scanner.nextLine();
        boolean contieneLetra = cadenaServicio.contiene(letra);
        System.out.println("La frase contiene la letra '" + letra + "': " + contieneLetra);
    }
}


/*
Realizar una clase llamada entidades.Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
 Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
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