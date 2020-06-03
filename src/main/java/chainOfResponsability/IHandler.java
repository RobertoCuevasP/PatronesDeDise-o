package chainOfResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    int criterioHandler(int amount);
}
