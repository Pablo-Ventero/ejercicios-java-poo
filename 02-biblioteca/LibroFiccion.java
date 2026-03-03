package EjercicioBiblioteca1aN;

public class LibroFiccion extends Libro {
    
    private String Genero;
 
    public LibroFiccion(String titulo, Autor autor, int anioPublicacion, String genero) {
    super(titulo, autor, añoPublicacion);
    this.Genero = genero;
    }

    // Getter específico
    public String getGenero() {
        return Genero;
    }
    
    @Override
    public void visualizarLibro() {
        super.visualizarLibro(); 
        System.out.println("Género: " + this.Genero);
    }
}
