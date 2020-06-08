package practica3._1memento;


public class Originator {

    private Backup estado;
    private int estados = 0;
    public Backup getEstado(){
        return estado;
    }

    public void setEstado(Backup estado) {
        //System.out.println("****************Cambiando estado*****************");
        this.estado = estado;
    }

    public Memento createMemento(){
        estados++;
        System.out.println("*****************Creando nuevo Backup*****************");
        System.out.println("Backup Nro " + estados);
        return new Memento(this.estado);
    }

    public void restoreFromMemento(Memento n){
        this.estado = n.getEstadoActual();
        System.out.println("****************Retornando Estado******************");
    }
}
