package composite;

abstract class Component {

    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract int precioTotal();

    public abstract  void add(Component component);

    public abstract  void remove(Component component);

}
