package command;

import java.time.LocalDateTime;

public class ComandoReiniciar implements IComando {
    private Receiver receiver;
    private Usuario usuario;
    private LocalDateTime horaRegistro;

    public ComandoReiniciar(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void ejecutar(){
        receiver.ejecucionReiniciar(usuario, horaRegistro);
    }

    @Override
    public void guardarUsuarioYHora(Usuario usuario){
        horaRegistro = LocalDateTime.now();
        this.usuario = usuario;

    }
}
