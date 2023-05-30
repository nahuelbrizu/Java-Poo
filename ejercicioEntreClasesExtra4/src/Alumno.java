
import java.util.HashSet;
import java.util.Set;

public class Alumno implements Votacion{
    private String nombre;
    private String dni;
    private int cantVotos = 3;

    private Set<Alumno> candidatos = new HashSet<>();
    private Voto voto;

    public Voto getVoto() {
        return voto;
    }

    public void setVoto(Alumno voto) {
        this.voto = voto.getVoto();
    }

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.candidatos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
     return cantVotos;
    }

    public void setCantVotos(int cantVotos, int voto) {
        this.cantVotos -= voto;
    }
    public void setCandidatos(Alumno alumno){
        this.candidatos.add(alumno);
    }
    public Set<Alumno> getCandidatos() {
        return candidatos;
    }

    public int voto(Alumno alumno){
        int cont = 0;
      for (Alumno candi: candidatos) {
          if(candi.getCantVotos() > cantVotos)
              voto.candidato(candi.getCandidatos());
                candi.setCandidatos(candi);
          cont++;
      }
      return cont;
    }
    public Alumno candidato(Set<Alumno> alumno){
        for (Alumno alum: alumno) {
            if (alumno.contains(alum)) {
                alumno.add(alum);
                return alum;
            }
            System.out.println("el candidato no se encuentra en lalista");
        }
        return (Alumno) alumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", cantVotos=" + cantVotos +
                ", candidatos=" + candidatos +
                ", voto=" + voto +
                '}';
    }
}
/*
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
 */