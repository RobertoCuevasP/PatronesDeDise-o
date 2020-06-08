package practica3._4chainOfResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void criterioHandler(Client.orden msg);
}
