package command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ComandoApagar c1 = new ComandoApagar(receiver);
        ComandoReiniciar c2 = new ComandoReiniciar(receiver);
        ComandoCerrarSesion c3 = new ComandoCerrarSesion(receiver);
        ComandoSuspender c4 = new ComandoSuspender(receiver);

        Computadora computadora = new Computadora();

        Usuario usuario = new Usuario("Roberto", computadora);
        usuario.escribirComando(c1);
        usuario.escribirComando(c2);
        usuario.escribirComando(c3);
        usuario.escribirComando(c4);

        computadora.runCommand();
    }
}
