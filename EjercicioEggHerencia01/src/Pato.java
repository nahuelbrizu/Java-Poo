public class Pato extends Animal{
    public Pato() {
    }

    public Pato(String nombre) {
        super(nombre);
    }
    public Pato(String cosas, int num){

    }
    @Override
    public String hacerRuido(){
        return "cuack";
    }
}
