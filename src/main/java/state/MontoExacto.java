package state;

public class MontoExacto implements IState {
    @Override
    public Object comprar(Producto producto, int monto) {
        System.out.println("Compra exitosa, monto justo");
        return new Producto(monto);
    }
}
