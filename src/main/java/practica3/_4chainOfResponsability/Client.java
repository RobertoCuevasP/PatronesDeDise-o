package practica3._4chainOfResponsability;

public class Client {

    public enum orden{
        Entrevistas,Disciplina,Desbloqueos, Manifestaciones,Limpiezas
    }

    public static void main(String[] args) {
        Organizador organizador = new Organizador();
        organizador.criterioHandler(orden.Entrevistas);
        organizador.criterioHandler(orden.Disciplina);
        organizador.criterioHandler(orden.Desbloqueos);
        organizador.criterioHandler(orden.Manifestaciones);
        organizador.criterioHandler(orden.Limpiezas);
    }
}
