package cine;

public class Pelicula {
    private String titulo;
    private int edadMinima;
    private double duracion;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int edadMinima, double duracion, String director) {
        this.titulo = titulo;
        this.edadMinima = edadMinima;
        this.duracion = duracion;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        if(edadMinima >= 18) {
            this.edadMinima = edadMinima;
        } else {
            System.out.println("es menor de edad");
        }
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", edad minima='" + edadMinima + '\'' +
                ", duracion=" + duracion +
                ", director='" + director + '\'' +
                '}';
    }
}

  //  películas nos interesa saber el título, duración, edad mínima y director.