package practica3._2chainOfResponsability;

public class Client {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();
        Persona persona = new Persona("Roberto");

        persona.setFicha(1);
        //persona.pagar();
        persona.setCertificadoNacimiento(new CertificadoNacimiento());

        organizador.criterioHandler(persona);
    }
}
