package practica3._1memento;

public class Persona {

    private String nombre;
    private int CI;
    private int edad;

    public Persona(String nombre, int CI, int edad) {
        this.nombre = nombre;
        this.CI = CI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
