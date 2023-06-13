import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private boolean carga;
    private static int cantCargar;
    public Lavadora() {
    }

    public Lavadora(double precio, Colores color, char consumoEnergetico, int peso, boolean carga,int cantCargar) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
        Lavadora.cantCargar = cantCargar;
    }
    public static Lavadora crearLavadora() {
        Electrodomestico electrodomestico = crearElectrodomestico();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Carga de Arriba S/N: ");
        boolean carga =  false;


        if(scanner.next().equalsIgnoreCase("S")){
            System.out.print("cantidad de carga");
            cantCargar = scanner.nextInt();
            carga =  true;
        }


        return new Lavadora(electrodomestico.getPrecio(), electrodomestico.getColor(),
                electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso(), carga, cantCargar);
    }
    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public int getCantCargar() {
        return cantCargar;
    }

    public void setCantCargar(int cantCargar) {
        Lavadora.cantCargar = cantCargar;
    }
    public int comprobarCarga(){
        int precio = 0;
        if(cantCargar > 30){
            precio = 500;
        }
        return precio;
    }

    @Override
    public double precioFinal(){
        return  getPrecio() + comprobarPeso(getPeso()) + comprobarCarga() + comprobarConsumoEnergetico(getConsumoEnergetico()) ;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "color= " + getColor() +
                ", peso= " + getPeso() +
                ", consumoEnergetico="+ getConsumoEnergetico()+
                ", carga= " + carga +
                ", cantCarga=" + cantCargar+
                ", plusCarga= " + comprobarCarga()+
                ", precio=" + getPrecio()+
                ", PrecioConsumo = "+comprobarConsumoEnergetico(getConsumoEnergetico())+
                ", precio Final="+ precioFinal()+
                '}';
    }
}
