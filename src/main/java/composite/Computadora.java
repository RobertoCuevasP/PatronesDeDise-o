package composite;


public class Computadora extends Component {

    public Computadora (){
        this.setPrecio(100);
    }

    @Override
    public int precioTotal() {
        System.out.println("El precio de una computadora es de " + this.getPrecio());
        return this.getPrecio();
    }

    @Override
    public void add(Component component) {
        System.out.println("No se puede añadir componentes");
    }

    @Override
    public void remove(Component component) {
        System.out.println("No se puede quitar componentes");
    }
}
