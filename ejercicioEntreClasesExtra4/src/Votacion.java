import java.util.Set;

public interface Votacion {
    public abstract int voto(Alumno alumno);
    public abstract Alumno candidato(Set<Alumno> alumno);


}
