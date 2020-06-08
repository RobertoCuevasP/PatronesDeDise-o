package practica3._1memento;

import java.util.ArrayList;
import java.util.List;


public class BaseDeDatos {
    //Esta clase es el CareTaker
    private Originator originator;
    private int mementos;
    private List<Memento> backupsGuardados;

    public BaseDeDatos(Originator originator){
        backupsGuardados = new ArrayList<>();
        mementos = 0;
        this.originator = originator;
    }

    public Memento getMemento(int index){
        return  backupsGuardados.get(index);
    }

    public void addMemento(Memento memento){
        backupsGuardados.add(memento);
        mementos++;
        if (mementos == 5){
            originator.restoreFromMemento(backupsGuardados.get(1));
            backupsGuardados.get(1).getEstadoActual().showData();
        }
    }
}
