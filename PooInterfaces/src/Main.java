public class Main {
    public static void main(String[] args) {
    CentroEducativo centroEducativo = new CentroEducativo();

    Alumno pepe = new Alumno("123","rio", "robert");
    Alumno pepe1 = new Alumno("324","rio", "robedddart");
    Alumno pepe2 = new Alumno("123123","rio", "reeobert");
    Alumno pepe3 = new Alumno("421","rio", "pepe");

    pepe.agregarExamen(new ExamenEscrito(40, 8, "02/06/1992"));
    pepe.agregarExamen(new ExamenOral("02/03/23", NivelSatisfaccion.SATISFACTORIO));

    pepe1.agregarExamen(new ExamenEscrito(60, 8, "02/06/1992"));
    pepe1.agregarExamen(new ExamenOral("02/03/23", NivelSatisfaccion.EXCELENTE));

    pepe2.agregarExamen(new ExamenEscrito(90, 6, "02/06/1992"));
    pepe2.agregarExamen(new ExamenOral("02/03/23", NivelSatisfaccion.EXCELENTE));

    pepe3.agregarExamen(new ExamenEscrito(78, 9, "02/06/1992"));
    pepe3.agregarExamen(new ExamenOral("02/03/23", NivelSatisfaccion.EXCELENTE));

    centroEducativo.agregarAlumnos(pepe);
    centroEducativo.agregarAlumnos(pepe1);
    centroEducativo.agregarAlumnos(pepe2);
    centroEducativo.agregarAlumnos(pepe3);
    }
}