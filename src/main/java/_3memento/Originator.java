package practica3._3memento;

public class Originator {
    private Tesis estado;
    private int estados = 1;

    public Tesis getEstado(){
        return estado;
    }

    public void setEstado(Tesis estado) {
        System.out.println("****************Cambiando estado*****************");
        this.estado = estado;
    }

    public Memento createMemento(){
        estados++;
        System.out.println("*****************Creando nuevo Backup*****************");
        System.out.println("Tesis Nro " + estados);
        return new Memento(this.estado);
    }

    public void restoreFromMemento(Memento n){
        this.estado = n.getEstadoActual();
        System.out.println("****************Retornando Estado******************");
    }
}
