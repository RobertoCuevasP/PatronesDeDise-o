package practica3._3memento;

public class Memento {
    private Tesis estadoActual;

    public Memento(Tesis estado){
        this.estadoActual = estado;
    }

    public Tesis getEstadoActual(){
        return estadoActual;
    }

    public void setEstadoActual(Tesis estadoNuevo){
        this.estadoActual = estadoNuevo;
    }
}
