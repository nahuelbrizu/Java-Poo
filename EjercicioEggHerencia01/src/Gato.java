public class Gato extends Animal{


    public Gato() {
    }
    public Gato(String nombre) {
        super(nombre);
    }


    @Override
    public String hacerRuido(){
        return "Miau";
    }
}
