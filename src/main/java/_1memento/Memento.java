package practica3._1memento;

public class Memento {

    private Backup estadoActual;

    public Memento(Backup estado){
        this.estadoActual = estado;
    }

    public Backup getEstadoActual(){
        return estadoActual;
    }

    public void setEstadoActual(Backup estadoNuevo){
        this.estadoActual = estadoNuevo;
    }
}
