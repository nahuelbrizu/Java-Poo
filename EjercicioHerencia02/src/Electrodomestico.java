import java.util.Scanner;

public class Electrodomestico {
    private double precio;
    private Colores color;
    private char consumoEnergetico;
    private int valorLetra;

    private int peso;



    public Electrodomestico() {

    }
    public Electrodomestico(double precio, Colores color, char consumoEnergetico) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }


    public Electrodomestico(double precio, Colores color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }



    public int comprobarConsumoEnergetico(char opcion) {
        opcion = Character.toUpperCase(opcion);
        switch (opcion) {
            case 'A':

                return 1000;
            case 'B':

                return 800;
            case 'C':

                return 600;
            case 'D':

                return 500;
            case 'E':

                return 300;
            default:

                return 100;
        }
    }


    public int comprobarPeso(int peso) {
       int pesoComprobado = 0;
        if(peso >= 80){
            pesoComprobado = 1000;
        } if (peso <= 79){
            pesoComprobado = 800;
        }  if (peso < 50){
            pesoComprobado = 500;
        }  if (peso < 10){
            pesoComprobado= 100;
        }
        return pesoComprobado;
    }



    public static Colores comprobarColor(String col){
        String opcion = col.toLowerCase();
        switch (opcion) {
            case "negro":
                return Colores.NEGRO;
            case "rojo":
                return Colores.ROJO;
            case "azul":
                return Colores.AZUL;
            default:
                return Colores.BLANCO;
        }
    }


    protected void crearElectrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
    }
    public static Electrodomestico crearElectrodomestico(){
        //• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
        //electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
        //precio se le da un valor base de $1000.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el color del electrodoméstico (BLANCO, NEGRO, AZUL, ROJO): ");
        Colores colores = comprobarColor(scanner.nextLine());


        System.out.println("Ingrese el consumo del electrodoméstico (A, B, C, D, E o F): ");
        char consumo = scanner.next().charAt(0);

        System.out.println("Ingrese el peso del electrodoméstico : ");
        int peso = scanner.nextInt();

        return new Electrodomestico(1000,colores,consumo,peso);
    }


    public double precioFinal(){
        return  precio + comprobarPeso(getPeso()) + comprobarConsumoEnergetico(getConsumoEnergetico());

    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }



}
