package command;

public class Usuario {

    private Computadora computadora;
    private String nombre;

    public Usuario(String nombre, Computadora computadora){
        this.nombre = nombre;
        this.computadora = computadora;
    }

    public String getNombre(){
        return nombre;
    }

    public void escribirComando(IComando comando){
        comando.guardarUsuarioYHora(this);
        computadora.setCommand(comando);
    }

}
