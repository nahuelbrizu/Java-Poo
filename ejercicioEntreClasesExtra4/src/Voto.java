import java.util.List;
import java.util.Set;

public class Voto implements Votacion {
    private Alumno alumno;
    private List<Alumno> candidatos;
    private int voto ;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Alumno> candidatos) {
        this.candidatos = candidatos;
    }

    public Voto(){

    }

    public int getVoto() {
        return voto;
    }

    public Voto(Alumno alumno) {
        this.candidatos.add(alumno);
    }

    public int voto(Alumno alumno){
        int i = 0;
        while (i < getVoto()){
            i++;
            votado(alumno);
        }
        return i;
    }

    public int votado(Alumno alumno){
        int i = 0;
        while (i < getVoto()){
            alumno.setVoto(i);
            i++;
        }
        return i;    }

    @Override
    public Alumno candidato(Set<Alumno> candidate) {
        if (!alumno.getNombre().equals(alumno.getNombre())){
            this.candidatos.add(alumno);
            candidate.add(getAlumno());
            voto(getAlumno());
            return alumno;
        }
        return alumno;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumno=" + alumno +
                ", candidatos=" + candidatos +
                ", voto=" + voto +
                '}';
    }
}
/*
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.

• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.

13
• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */