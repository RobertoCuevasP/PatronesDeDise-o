package observer;

public interface ISubject {
    void attach(IObservador observer);
    void deAttach(IObservador observer);
    void notifyObserver(Video video);
}
