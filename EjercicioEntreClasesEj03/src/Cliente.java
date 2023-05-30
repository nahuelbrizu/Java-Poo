import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cliente extends Poliza {
    private String nombre;
    private String apellido;
    private String dni;
    private String mail;
    private  String domicilio;
    private String telefono;
    private Poliza poliza;

    private List<Vehiculo> vehiculos;
    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String dni, String mail, String domicilio, String telefono, Poliza poliza, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.poliza = poliza;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo vehiculos) {
        this.vehiculos = new ArrayList<>();
    }

    public void mostarVehiculo(){
        for (Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo.toString() + " ");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", mail='" + mail + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                ", poliza=" + poliza +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
/*
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 */