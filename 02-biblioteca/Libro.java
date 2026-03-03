package EjercicioBiblioteca1aN;

public class Libro {
    
    //Atributos
    private String Titulo;
    private String Autor;
    private int añoPublicacion;
    
    //Constructores

    public Libro() {
    }

    public Libro(String Titulo, String Autor, int añoPublicacion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    //Getters y setters

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    //Metodos
    public void visualizarLibro() {
        System.out.println("--- Libro ---");
        System.out.println("Título: " + this.Titulo);
        System.out.println("Año: " + this.añoPublicacion);
        this.mostrarAutor();
    }

    public void mostrarAutor() {
    System.out.println("Autor: " + this.Autor);
  }
}
