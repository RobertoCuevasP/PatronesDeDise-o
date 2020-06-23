package practica5.visitor;

public class Client {
    public static void main(String[] args) {
        Perro perro = new Perro("Lulú");
        Gato gato = new Gato("Tommy");
        Caballo caballo = new Caballo("Tiro al Blanco");

        perro.definirEnfermedad(VisitorVeterinario.tipoEnfermedades.enfermedad1);
        gato.definirEnfermedad(VisitorVeterinario.tipoEnfermedades.enfermedad2);
        caballo.definirEnfermedad(VisitorVeterinario.tipoEnfermedades.enfermedad1);

        VisitorVeterinario veterinario = new VisitorVeterinario();

        System.out.println("************************************");
        perro.accept(veterinario);
        System.out.println("************************************");
        gato.accept(veterinario);
        System.out.println("************************************");
        caballo.accept(veterinario);
    }
}
