package practica5.visitor;

public interface Animal {
    void definirEnfermedad(VisitorVeterinario.tipoEnfermedades enfermedad);
    void accept(IVisitor visitor);
}
