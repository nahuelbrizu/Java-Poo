import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private int pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(double precio, Colores color, char consumoEnergetico, int peso, int pulgadas, boolean sintonizador) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public static Televisor crearTelevisor() {
        Electrodomestico electrodomestico = crearElectrodomestico();
        Scanner scanner = new Scanner(System.in);
        System.out.println("cantidad de pulgadas");
        int pulgadas = scanner.nextInt();
        System.out.println("tiene sintonizador S/N: ");
        boolean sintonizador =  false;
        if(scanner.next().equalsIgnoreCase("S")){
            sintonizador =  true;
        }

        return new Televisor(electrodomestico.getPrecio(), electrodomestico.getColor(),
                electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso(), pulgadas , sintonizador);
    }
    @Override
    public double precioFinal(){
        return  getPrecio() + comprobarPeso(getPeso()) + comprobarConsumoEnergetico(getConsumoEnergetico());
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "pulgadas=" + pulgadas +
                ", sintonizador=" + sintonizador +
                '}';
    }
}
