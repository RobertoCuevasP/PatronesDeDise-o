package command;

import java.time.LocalDateTime;

public class ComandoSuspender implements IComando {
    private Receiver receiver;
    private Usuario usuario;
    private LocalDateTime horaRegistro;

    public ComandoSuspender(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void ejecutar(){
        receiver.ejecucionSuspender(usuario, horaRegistro);
    }

    @Override
    public void guardarUsuarioYHora(Usuario usuario){
        horaRegistro = LocalDateTime.now();
        this.usuario = usuario;

    }
}
