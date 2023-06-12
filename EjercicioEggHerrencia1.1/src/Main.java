public class Main {
    public static void main(String[] args) {

        Animal perro = new Perro("stich", "carnivoro",15, "doberman");
        Animal perro1 = new Perro("sandman", "croquetas",5, "petit");
        Animal gato = new Gato("frodo", "pajarito",12, "elfo");
        Animal caballo = new Caballo("El que llega 2do", "pasto",11, "PURA SANGRE");

        System.out.println(perro.alimentarse());
        System.out.println(perro1.alimentarse());
        System.out.println(gato.alimentarse());
        System.out.println(caballo.alimentarse());
    }
}


/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */