import java.util.ArrayList;
import java.util.Date;

public class Cuotas extends Cliente {

    private String cantCoutas;
    private int nunDeCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private Date fechaVencimiento;
    private Cliente cliente;
    private  Poliza poliza;
    public Cuotas() {
    }

    public Cuotas(String cantCoutas, int nunDeCuota, double montoTotalCuota, boolean pagada, Date fechaVencimiento, Cliente cliente, Poliza poliza) {
        this.cantCoutas = cantCoutas;
        this.nunDeCuota = nunDeCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.poliza = poliza;
    }

    @Override
    public String getCantCoutas() {
        return cantCoutas;
    }

    @Override
    public void setCantCoutas(String cantCoutas) {
        this.cantCoutas = cantCoutas;
    }

    public int getNunDeCuota() {
        return nunDeCuota;
    }

    public void setNunDeCuota(int nunDeCuota) {
        this.nunDeCuota = nunDeCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public Poliza getPoliza() {
        return poliza;
    }

    @Override
    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }
}


/*
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */