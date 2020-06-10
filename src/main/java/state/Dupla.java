package state;

public class Dupla {

    private Producto producto;
    private int cambio;

    public Dupla(Producto producto, int cambio) {
        this.producto = producto;
        this.cambio = cambio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
}
