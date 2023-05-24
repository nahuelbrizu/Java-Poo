package tienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {
    private static Scanner scanner = new Scanner(System.in);
    private static final HashMap<String,Double> productos = new HashMap<>();

    static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea después de leer el número
        System.out.println("Producto agregado correctamente.");

       Producto producto = new Producto(nombre, precio);
       productos.put(producto.getNombre(), producto.getPrecio());
    }

    static void modificarPrecio() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea después de leer el número

            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    static void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    static void mostrarProductos() {
        System.out.println("----- PRODUCTOS -----");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            double precio = entry.getValue();
            System.out.println(nombre + " - Precio: " + precio);
        }
    }

}
