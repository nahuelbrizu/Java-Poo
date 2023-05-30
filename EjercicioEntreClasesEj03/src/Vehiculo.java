import java.util.Arrays;
import java.util.Date;

public class Vehiculo  extends Cliente{
    private Cliente cliente;
    private String marca;
    private String modelo;
    private String numMotor;
    private String chasis;
    private String color;
    private int ano;
    private String[] tipo = new String[]{};

    public Vehiculo() {
    }

    public Vehiculo(Cliente cliente, String marca, String modelo, String numMotor, String chasis, String color, int ano, String[] tipo) {
        this.cliente = cliente;
        this.marca = marca;
        this.modelo = modelo;
        this.numMotor = numMotor;
        this.chasis = chasis;
        this.color = color;
        this.ano = ano;
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = new String[]{tipo};
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "cliente=" + cliente +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", chasis='" + chasis + '\'' +
                ", color='" + color + '\'' +
                ", ano=" + ano +
                ", tipo=" + Arrays.toString(tipo) +
                '}';
    }
}

/*
Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */