package state;

public class MaquinaDispensadora {
    Producto producto;
    IState monto;

    public MaquinaDispensadora(Producto producto){
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public IState getMonto() {
        return monto;
    }

    public void setMonto(IState monto) {
        this.monto = monto;
    }

    public Object comprar(int precio){
        return this.monto.comprar(producto, precio);
    }

}
