import java.util.*;

public class Simulador {
    private static List<Alumno> alumnoList = new ArrayList<>();
    private static List<String> nombresCompletos;
    private static List<String> dniCompleto;
    private HashSet<Alumno> votados = new HashSet<>();

    public Simulador() {
    }




    public static List<String> crearNombres(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        List<String> apellidos = new ArrayList<>();
        apellidos.add("Gómez");
        apellidos.add("López");
        apellidos.add("Rodríguez");

        Random random = new Random();


        String nombreAleatorio = nombres.get(random.nextInt(nombres.size()));
        String apellidoAleatorio = apellidos.get(random.nextInt(apellidos.size()));
        String nombreMezclado = nombreAleatorio +" "+ apellidoAleatorio;
        List<String> nombresCompletos = new ArrayList<>();
        nombresCompletos.add(nombreMezclado);

        return nombresCompletos;
    }

    public static List<String> crearDni(){
        String dniAleatorio = "";
        List<String> dni = new ArrayList<>();
        dni.add("1");
        dni.add("2");
        dni.add("3");
        dni.add("4");
        dni.add("5");
        dni.add("6");
        dni.add("7");
        dni.add("8");
        dni.add("9");
        dni.add("0");

        Random random = new Random();
        for(int i = 8; i > 0; i--) {
            if(dniAleatorio.length() < 8) {
                dniAleatorio += dni.get(random.nextInt(9));
            }
        }
        List<String> dniCompleto = new ArrayList<>();
        dniCompleto.add(dniAleatorio);
        return dniCompleto;

    }



    public static List<Alumno> crearAlumno(List<String> nombresCompletos,List<String> dniCompleto){

        Alumno alumno = new Alumno("pepe campos" ,"32415163");
        String nombre = "";
        String dni = "";
            for (String nombres : nombresCompletos) {
                nombre = nombres;
            }
            for (String doc : dniCompleto) {
                if(!(Objects.equals(dni, doc))){
                    dni = doc;
                }
            }
            alumno = new Alumno(nombre, dni);
            alumnoList.add(alumno);
        return alumnoList;

    }


    public void votacion(List<Alumno> alumnoList) {
        Random random = new Random();
        int votosGenerados = 0;
        int voto_max = 3;
        for (Alumno votante : alumnoList) {

            while (votosGenerados <= voto_max) {
                int indiceVotado = random.nextInt(alumnoList.size());
                  Alumno votado = alumnoList.get(indiceVotado);
                    votados.add(votado);
                    votado.setCandidatos(votado);
                    votante.setCantVotos(voto_max, votosGenerados++);
            }
        }
    }



    public void recuentoVotos() {
        // Ordenar la lista de alumnos por cantidad de votos en orden descendente

        // Obtener los 5 facilitadores
        List<Alumno> facilitadores = alumnoList.subList(0, 5);

        // Obtener los 5 facilitadores suplentes
        List<Alumno> facilitadoresSuplentes = alumnoList.subList(5, 10);

        // Mostrar los 5 facilitadores
        System.out.println("Facilitadores:");
        for (Alumno facilitador : facilitadores) {
            System.out.println("- " + facilitador.getNombre());
        }

        // Mostrar los 5 facilitadores suplentes
        System.out.println("Facilitadores Suplentes:");
        for (Alumno facilitadorSuplente : facilitadoresSuplentes) {
            System.out.println("- " + facilitadorSuplente.getNombre());
        }
    }
    public void mostrarResultados() {

        for (Alumno alumno : alumnoList) {
            System.out.println("Alumno: " + alumno.getNombre());
            System.out.println("Cantidad de votos: " + alumno.getCantVotos());

            System.out.println("Votos recibidos:");
            for (Alumno votado : alumnoList)  {
                System.out.println("- " + votado.getVoto());
            }
            System.out.println("---------------------");
        }
    }

}
/*


• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.

• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */