package practica3._3memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private Originator originator;
    private int mementos;
    private List<Memento> tesisGuardadas;

    public Caretaker(Originator originator){
        tesisGuardadas = new ArrayList<>();
        mementos = 0;
        this.originator = originator;
    }

    public Memento getMemento(int index){
        return  tesisGuardadas.get(index);
    }

    public void addMemento(Memento memento){
        tesisGuardadas.add(memento);
        mementos++;
        if (mementos == 5){
            originator.restoreFromMemento(tesisGuardadas.get(2));
            tesisGuardadas.get(2).getEstadoActual().showData();
        }
    }
}
