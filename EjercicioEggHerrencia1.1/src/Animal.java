public class Animal {
    private String nombre;
    private String baseAlimenticia;
    private  int edad;
    private String raza;

    public Animal() {
    }

    public Animal(String nombre, String baseAlimenticia, int edad, String raza) {
        this.nombre = nombre;
        this.baseAlimenticia = baseAlimenticia;
        this.edad = edad;
        this.raza = raza;
    }

    public String getBaseAlimenticia() {
        return nombre + " " + baseAlimenticia;
    }

    public String alimentarse() {
        return getBaseAlimenticia();
    }
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", baseAlimenticia='" + baseAlimenticia + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
