import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private boolean carga;

    public Lavadora() {
    }

    public Lavadora(double precio, Colores color, char consumoEnergetico, int peso, boolean carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    public static Lavadora crearLavadora() {
        Electrodomestico electrodomestico = crearElectrodomestico();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Carga de Arriba S/N: ");
        boolean carga =  false;
        if(scanner.next().equalsIgnoreCase("S")){
             carga =  true;
        }


        return new Lavadora(electrodomestico.getPrecio(), electrodomestico.getColor(),
                electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso(), carga);
    }
    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal(){
        return  getPrecio() + comprobarPeso(getPeso()) + comprobarConsumoEnergetico(getConsumoEnergetico());
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                '}';
    }
}
