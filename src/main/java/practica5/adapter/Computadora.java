package practica5.adapter;

public class Computadora implements ArtefactosElectronicosPequenos {

    private int precio;
    private int tiempo;

    public Computadora(int precio, int tiempo) {
        this.precio = precio;
        this.tiempo = tiempo;
    }

    @Override
    public int precio() {
        System.out.println("El precio de la computadora es de " + precio);
        return precio;
    }

    @Override
    public int tiempoDeVida() {
        System.out.println("El tiempo de vida de la computadora es de " + tiempo + " años.");
        return tiempo;
    }
}
