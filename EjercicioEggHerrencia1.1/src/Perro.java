public class Perro extends Animal{
    public Perro() {
    }

    public Perro(String nombre, String baseAlimenticia, int edad, String raza) {
        super(nombre, baseAlimenticia, edad, raza);
    }
    @Override
    public String alimentarse() {
        return super.alimentarse();
    }
}
