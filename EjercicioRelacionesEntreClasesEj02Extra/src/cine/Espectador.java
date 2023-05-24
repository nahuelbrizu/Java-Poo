package cine;

import java.util.Random;

public class Espectador {
    private String nombre;
    private int edad;
    private double dineroDisponible;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public void crearEspec(){
        Random random = new Random(60);
        for(int i = 40; i >= 0; i--){
            int edad = random.nextInt();
            double dinero = random.nextDouble();
            new Espectador("nombre", edad, dinero);

        }
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dinero disponible=" + dineroDisponible +
                '}';
    }
}
