package godObject.ejemploBienImplementado;

public class Perfil {
    private String nombre;
    private String direccion;
    private Saldo saldo;
    private EstadisticasUsuario estadisticasUsuario;
    private String contrasena;

    public Perfil(String nombre, String direccion, String contrasena) {
        this.nombre = nombre;
        this.direccion = direccion;
        saldo = new Saldo(0);
        estadisticasUsuario = new EstadisticasUsuario();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

