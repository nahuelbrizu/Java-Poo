import java.util.*;

public class Voto {
    private Alumno alumnoVotante;
    private Set<Alumno> alumnosVotados;

    public Voto(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = new HashSet<>();
    }

    // Getters y Setters

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public Set<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(Set<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
}

