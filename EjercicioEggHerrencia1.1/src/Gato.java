public class Gato extends Animal {
    public Gato() {
    }

    public Gato(String nombre, String baseAlimenticia, int edad, String raza) {
        super(nombre, baseAlimenticia, edad, raza);
    }
    @Override
    public String alimentarse() {
        return super.alimentarse();
    }

}
