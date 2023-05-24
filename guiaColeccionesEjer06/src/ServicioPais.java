import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ServicioPais {
    private Set<Pais> conjunto= new HashSet<>();
    private Scanner inp = new Scanner(System.in).useDelimiter("\n");



    private void ingresarPaises(Pais pais){
        conjunto.add(pais);
    }

    public void menuAgregarPais(){
        boolean menu = false;

        while (!menu) {
            String op;
            System.out.println("------Menu-------");
            System.out.println( "ingrese la opcion");
            System.out.println("1 ingresar pais");
            System.out.println("2 salir");
            System.out.print("elija una opcion");
            op = inp.nextLine();
            switch (op) {
                case "1":
                    System.out.print("ingrese un pais :");
                    Pais pais = new Pais(inp.nextLine());
                    ingresarPaises(pais);
                    break;
                case "2":
                    System.out.println("esta seguro que deseasalir )=  S/N ?  ");
                    String exitMenu = inp.nextLine();
                    if (exitMenu.equalsIgnoreCase("s")) {
                        menu = true;
                        break;
                    }
                default:
                    System.out.println("la opcion no es valida");
            }
        }
    }

    public void mostrarPaises(){
        conjunto.stream().sorted();
        Iterator  iterator = conjunto.iterator();
        System.out.print(" ingrese  el pais que desea borrar : ");
        String p = inp.nextLine();


        while (iterator.hasNext()){
            if(iterator.next() == p){
                iterator.remove();
            }

            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */