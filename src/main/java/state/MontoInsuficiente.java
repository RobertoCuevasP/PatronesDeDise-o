package state;

public class MontoInsuficiente implements IState {

    @Override
    public Object comprar(Producto producto, int monto) {
        System.out.println("No se tiene dinero suficiente para realizar la compra, se le devuelve " + monto + "Bs");
        return monto;
    }
}
