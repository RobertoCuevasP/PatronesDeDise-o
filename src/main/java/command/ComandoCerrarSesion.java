package command;

import java.time.LocalDateTime;

public class ComandoCerrarSesion implements IComando {
    private Receiver receiver;
    private Usuario usuario;
    private LocalDateTime horaRegistro;

    public ComandoCerrarSesion(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void ejecutar(){
        receiver.ejecucionCerrarSesion(usuario, horaRegistro);
    }

    @Override
    public void guardarUsuarioYHora(Usuario usuario){
        horaRegistro = LocalDateTime.now();
        this.usuario = usuario;

    }
}
