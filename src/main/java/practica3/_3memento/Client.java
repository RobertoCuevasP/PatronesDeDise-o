package practica3._3memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        Tesis tesis = new Tesis("Un video en blanco", "Discriminación", "Hola");
        originator.setEstado(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis = new Tesis("Un video en blanco", "Obesidad", "Hola");
        originator.setEstado(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis = new Tesis("Un video en blanco", "Publicidad engañosa", "Hola");
        originator.setEstado(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis = new Tesis("Un video en blanco", "Economía", "Hola");
        originator.setEstado(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis = new Tesis("Un video en blanco", "Matemáticas", "Hola");
        originator.setEstado(tesis);
        caretaker.addMemento(originator.createMemento());
        originator.restoreFromMemento(caretaker.getMemento(1));


    }
}
