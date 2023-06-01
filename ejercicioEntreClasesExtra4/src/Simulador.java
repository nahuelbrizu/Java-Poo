import java.util.*;

public class Simulador {
    public List<String> generarNombresAleatorios() {
        List<String> nombres = Arrays.asList("Juan", "María", "Nahuel", "Laura", "Carlos");
        List<String> apellidos = Arrays.asList("Gómez", "López", "Rodríguez", "Fernández", "Martínez");
        List<String> nombresCompletos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String nombreAleatorio = nombres.get(random.nextInt(nombres.size()));
            String apellidoAleatorio = apellidos.get(random.nextInt(apellidos.size()));
            String nombreCompleto = nombreAleatorio + " " + apellidoAleatorio;
            nombresCompletos.add(nombreCompleto);
        }

        return nombresCompletos;
    }

    public List<String> generarDNIAleatorios() {
        List<String> dnis = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String dni = String.format("%08d", random.nextInt(100000000));
            dnis.add(dni);
        }

        return dnis;
    }

    public List<Alumno> generarAlumnos(int cantidad) {
        List<String> nombresCompletos = generarNombresAleatorios();
        List<String> dnis = generarDNIAleatorios();
        List<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombresCompletos.get(i % nombresCompletos.size());
            String dni = dnis.get(i % dnis.size());
            Alumno alumno = new Alumno(nombre, dni);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    public void imprimirListadoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + ", DNI: " + alumno.getDni());
        }
    }
    public Set<Alumno> votacion(List<Alumno> alumnos) {
        Set<Alumno> votados = new HashSet<>();
        Random random = new Random();

        for (Alumno votante : alumnos) {
            Voto voto = new Voto(votante);

            while (voto.getAlumnosVotados().size() < 3) {
                int indiceVotado = random.nextInt(alumnos.size());
                Alumno votado = alumnos.get(indiceVotado);

                if (votado != votante) {
                    voto.getAlumnosVotados().add(votado);
                    votado.setCantidadVotos(votado.getCantidadVotos() + 1);
                }
            }

            votados.add(votante);
        }

        return votados;
    }

    public void mostrarResultadosVotacion(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos recibidos:");

            for (Alumno votante : alumnos) {
                if (votante.getCantidadVotos() > 0 && votante != alumno) {
                    System.out.println("- " + votante.getNombreCompleto());
                }
            }

            System.out.println();
        }
    }

    public void recuentoVotos(List<Alumno> alumnos) {
        List<Alumno> facilitadores = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();

        // Ordenar alumnos por cantidad de votos en orden descendente
        Collections.sort(alumnos, (a, b) -> b.getCantidadVotos() - a.getCantidadVotos());

        for (int i = 0; i < 5; i++) {
            facilitadores.add(alumnos.get(i));
            facilitadoresSuplentes.add(alumnos.get(i + 5));
        }

        System.out.println("Facilitadores:");
        imprimirListadoAlumnos(facilitadores);
        System.out.println("Facilitadores Suplentes:");
        imprimirListadoAlumnos(facilitadoresSuplentes);
    }

}