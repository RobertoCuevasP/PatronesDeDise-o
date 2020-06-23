package practica5.visitor;

public interface IVisitor {
    void curar(Perro perro);
    void curar(Gato gato);
    void curar(Caballo caballo);
}
