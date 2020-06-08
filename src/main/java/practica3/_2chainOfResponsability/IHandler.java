package practica3._2chainOfResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void criterioHandler(Persona persona);

}
