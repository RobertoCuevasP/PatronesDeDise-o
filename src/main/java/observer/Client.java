package observer;

public class Client {
    public static void main(String[] args) {
        SubjectCanalYoutube canal1 = new SubjectCanalYoutube();
        ObserverPersona p1 = new ObserverPersona("Roberto", "Suspenso");
        ObserverPersona p2 = new ObserverPersona("Raisa", "Comedia");
        ObserverPersona p3 = new ObserverPersona("Cesar", "anyCategory");

        canal1.attach(p1);
        canal1.attach(p2);
        canal1.attach(p3);

        canal1.subirVideo(new Video("Suspenso", "Un video en gris", 360, "Suspenso"));

    }
}
