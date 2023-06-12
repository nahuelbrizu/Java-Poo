public class Perro extends Animal{
    public Perro() {
    }

    public Perro(String nombre) {
        super(nombre);
    }


    @Override
    public String hacerRuido(){
        return "Guau";
    }

}
