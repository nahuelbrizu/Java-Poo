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
        boolean sintonizador = scanner.next().equalsIgnoreCase("S");

        return new Televisor(electrodomestico.getPrecio(), electrodomestico.getColor(),
                electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso(), pulgadas , sintonizador);
    }
    public int comprobarSintonizador(){
        int precio=0;
        if(sintonizador){
            precio = 500;
        }
        return precio;
    }
    public double comprobarPulgadas(){
        double precio= 0;
        if(pulgadas > 40){
            precio =  (getPrecio() * 0.30);
        }
        return precio;
    }

    @Override
    public double precioFinal(){/*
            Método precioFinal(): este método será heredado y se le sumará la siguiente
        funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
        incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
        $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
        también deben afectar al precio.
        */
        return  getPrecio() + comprobarPeso(getPeso()) + comprobarConsumoEnergetico(getConsumoEnergetico())+ comprobarPulgadas()+comprobarSintonizador();
    }


    @Override
    public String toString() {
        return "Televisor{" +
                "color= " + getColor() +
                ", peso= " + getPeso() +
                ", pulgadas=" + pulgadas +
                ", PlusPulgadas=" + comprobarPulgadas() +
                ", sintonizador=" + sintonizador +
                ", plusSintonizador=" + comprobarSintonizador()+
                ", consumoEnergetico="+ getConsumoEnergetico()+
                ", precio=" + getPrecio()+
                ", PrecioConsumo = "+comprobarConsumoEnergetico(getConsumoEnergetico())+
                ", precio Final="+ precioFinal()+
                '}';
    }
}
