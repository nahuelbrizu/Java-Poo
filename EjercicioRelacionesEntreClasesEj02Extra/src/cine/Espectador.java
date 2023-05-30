package cine;

import java.util.ArrayList;
import java.util.Random;

public class Espectador {
    private String nombre;
    private int edad;
    private static ArrayList<Espectador> espectadores = new ArrayList<>();

    private double dineroDisponible;

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }


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

    public static  ArrayList<Espectador> crearEspec(){
        Random random = new Random(60);
        for(int i = 40; i >= 0; i--){
            int edad = random.nextInt();
            double dinero = random.nextDouble();
            Espectador  espectador =  new Espectador("nombre", edad, dinero);
            espectadores.add(espectador);
        }
        return espectadores;
    }


    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dineroDisponible=" + dineroDisponible +
                '}';
    }
}
