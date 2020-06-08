package practica3._1memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        BaseDeDatos dataBase = new BaseDeDatos(originator);

        Backup b1 = new Backup("BackUp Marzo");
        b1.addPersona(new Persona("Roberto", 1234, 15));
        originator.setEstado(b1);
        dataBase.addMemento(originator.createMemento());

        Backup b2 = new Backup("BackUp Abril");
        b2.addPersona(new Persona("Raisa", 2345, 20));
        originator.setEstado(b2);
        dataBase.addMemento(originator.createMemento());

        Backup b3 = new Backup("BackUp Mayo");
        originator.setEstado(b3);
        dataBase.addMemento(originator.createMemento());

        Backup b4 = new Backup("BackUp Junio");
        originator.setEstado(b4);
        dataBase.addMemento(originator.createMemento());

        Backup b5 = new Backup("BackUp Julio");
        originator.setEstado(b5);
        dataBase.addMemento(originator.createMemento());

    }

}
