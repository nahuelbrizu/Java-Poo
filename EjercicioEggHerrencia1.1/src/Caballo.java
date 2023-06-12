public class Caballo extends Animal{
    public Caballo() {
    }

    public Caballo(String nombre, String baseAlimenticia, int edad, String raza) {
        super(nombre, baseAlimenticia, edad, raza);
    }
    @Override
    public String alimentarse() {
        return super.alimentarse();
    }
}
