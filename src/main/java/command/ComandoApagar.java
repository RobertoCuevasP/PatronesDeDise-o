package command;

import java.time.LocalDateTime;

public class ComandoApagar implements IComando {
    private Receiver receiver;
    private Usuario usuario;
    private LocalDateTime horaRegistro;

    public ComandoApagar(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void ejecutar(){
        receiver.ejecucionApagar(usuario, horaRegistro);
    }

    @Override
    public void guardarUsuarioYHora(Usuario usuario){
        horaRegistro = LocalDateTime.now();
        this.usuario = usuario;

    }
}
