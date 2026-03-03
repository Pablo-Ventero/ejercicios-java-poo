package EjercicioBiblioteca1aN;

public class Autor {
   //Atributos
   private String Nombre;
   private String Nacionalidad;
   private String fechaNacimiento;
   
   //Constructor

    public Autor() {
    }

    public Autor(String Nombre, String Nacionalidad, String fechaNacimiento) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }
   
    //Getters y setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Metodos
    public void visualizarAutor(){
        System.out.println("Autor: " + this.Nombre);
    }
    
    public void mostrarAutor(){
        System.out.println(this.Nombre + ", " + this.Nacionalidad + ", "+ this.fechaNacimiento);
    }
}
