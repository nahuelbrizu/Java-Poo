import java.util.ArrayList;

public class CentroEducativo {
    private ArrayList<Alumno> alumnos;


    public CentroEducativo(){
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumnos(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public int cantAprovados(){
        int cant = 0;
        for (Alumno alumno: alumnos) {
            if(alumno.aprobo()){
                cant++;
            }
        }
        return cant;
    }
}
