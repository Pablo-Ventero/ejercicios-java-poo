package EjercicioBiblioteca1aN;

public class Principal {
    public static void main(String[] args) {
        
    Biblioteca b1 = new Biblioteca("Biblioteca Pública Municipal Gloria Fuertes", "Av. de Logroño, 179");
    // formulario de alta de libros
    b1.add("Mortadelo y Filemón", "Ibáñez", 1998);
    Libro l1 = new Libro("Los juegos del hambre", "Suzanne Collins", 2008);
    b1.add(l1);
        
    // Mostrar en el formulario todos los libros
    System.out.println(b1);        
    }
}
