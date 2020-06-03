package chainOfResponsability;

public class Persona {
    private String nombre;
    private int CI;
    private int saldoActual;
    private Organizador organizador;

    public Persona(String nombre, int CI, int saldoActual, Organizador organizador) {
        this.nombre = nombre;
        this.CI = CI;
        this.saldoActual = saldoActual;
        this.organizador = organizador;
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

    public int getSaldoActual() {
        return saldoActual;
    }

    public void pedirPrestamo(int montoPrestamo) {
        int montoRecibido = organizador.criterioHandler(montoPrestamo);
        this.saldoActual = montoRecibido;
        if(montoRecibido > 0) {
            System.out.println("El monto actual " + getNombre() + " es de " + saldoActual);
        }
    }
}
