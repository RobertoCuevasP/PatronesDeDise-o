package practica5.adapter;

public class Celular implements ArtefactosElectronicosPequenos {

    private int precio;
    private int tiempo;

    public Celular(int precio, int tiempo) {
        this.precio = precio;
        this.tiempo = tiempo;
    }

    @Override
    public int precio() {
        System.out.println("El precio del celular es de " + precio);
        return precio;
    }

    @Override
    public int tiempoDeVida() {
        System.out.println("El tiempo de vida del celular es de " + tiempo + " años.");
        return tiempo;
    }
}
