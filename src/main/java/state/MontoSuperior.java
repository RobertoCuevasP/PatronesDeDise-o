package state;

public class MontoSuperior implements IState {
    @Override
    public Object comprar(Producto producto, int monto) {
        int cambio = monto - producto.getPrecio();
        System.out.println("Compra exitosa, su cambio es de " + cambio);
        return new Dupla(new Producto(producto.getPrecio()), cambio);
    }
}
