package EjercicioBiblioteca1aN;

import java.util.ArrayList;

public class Biblioteca {
    // Atributos
    private String nombre;
    private String ubicacion;
    private ArrayList<Libro> libros;
    
    // Constructores (Sobrecarga)
    public Biblioteca(){
        libros = new ArrayList<>();
    }
    
    public Biblioteca(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        libros = new ArrayList<>();
    }
    
    // Getters y Setters.. básicos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    // Trabajar con el ArrayList, add (remove/equals)

    public boolean add(Libro e) {
        return libros.add(e);
    }
    
    // En mi caso, Autor no lo tengo como Clase, es un String
    public boolean add(String titulo, String autor, int year) {
        return libros.add( new Libro(titulo, autor, year));
    }
    
    // Listado: sobrecarga de toString()
    // hacer una sobrecarga del método toString() 
    // de todas las clases implicadas: Libro, Autor

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + 
                ", ubicacion=" + ubicacion + 
                ", libros=" + libros + '}';
    }
 
}
