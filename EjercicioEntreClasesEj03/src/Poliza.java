import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Poliza {

    private String[] formaDePago;
    private Cuotas cuotas;
    private Date fechaInicio;
    private Date finPoliza;
    private int numPoliza;
    private String cantCoutas;

    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaximoAsegurado;
    private double montoMaximoGranizo;
    private String[] tipocobertura = new String[]{"total","contra terceros", "etc"};

   private List <Cliente> clientes;
   private Vehiculo vehiculo;
   private  Cliente cliente;
    public Poliza() {
    }

    public Poliza(String[] formaDePago, Cuotas cuotas, Date fechaInicio, Date finPoliza, int numPoliza, String cantCoutas, double montoTotalAsegurado, boolean incluyeGranizo, double montoMaximoAsegurado, double montoMaximoGranizo, String[] tipocobertura, List<Cliente> clientes, Vehiculo vehiculo, Cliente cliente) {
        this.formaDePago = formaDePago;
        this.cuotas = cuotas;
        this.fechaInicio = fechaInicio;
        this.finPoliza = finPoliza;
        this.numPoliza = numPoliza;
        this.cantCoutas = cantCoutas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoAsegurado = montoMaximoAsegurado;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipocobertura = tipocobertura;
        this.clientes = clientes;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String[] getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = new String[]{formaDePago};
    }

    public Cuotas getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuotas cuotas) {
        this.cuotas = cuotas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFinPoliza() {
        return finPoliza;
    }

    public void setFinPoliza(Date finPoliza) {
        this.finPoliza = finPoliza;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getCantCoutas() {
        return cantCoutas;
    }

    public void setCantCoutas(String cantCoutas) {
        this.cantCoutas = cantCoutas;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaximoAsegurado() {
        return montoMaximoAsegurado;
    }

    public void setMontoMaximoAsegurado(double montoMaximoAsegurado) {
        this.montoMaximoAsegurado = montoMaximoAsegurado;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String[] getTipocobertura() {
        return tipocobertura;
    }

    public void setTipocobertura(String[] tipocobertura) {
        this.tipocobertura = tipocobertura;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }


}





/*
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */