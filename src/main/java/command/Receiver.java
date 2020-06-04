package command;

import java.time.LocalDateTime;

public class Receiver {

    public void ejecucionApagar(Usuario usuario, LocalDateTime hora){
        System.out.println("Apagando equipo, solicitada por " + usuario.getNombre() + " a las horas " + hora);
    }

    public void ejecucionReiniciar(Usuario usuario, LocalDateTime hora){
        System.out.println("Reiniciando equipo, solicitada por " + usuario.getNombre()  + " a las horas " + hora);
    }
    public void ejecucionSuspender(Usuario usuario, LocalDateTime hora){
        System.out.println("Suspendiendo equipo, solicitada por " + usuario.getNombre()  + " a las horas " + hora);
    }
    public void ejecucionCerrarSesion(Usuario usuario, LocalDateTime hora){
        System.out.println("Cerrando sesion, solicitada por " + usuario.getNombre()  + " a las horas " + hora);
    }
}
