package practica5.adapter;

public class Refrigerador implements ArtefactosElectronicosGrandes {

    private int monto;
    private int tiempo;

    public Refrigerador(int monto, int tiempo) {
        this.monto = monto;
        this.tiempo = tiempo;
    }

    @Override
    public int costo() {
        System.out.println("El costo del refrigerador es de " + monto);
        return monto;
    }

    @Override
    public int tiempoGarantia() {
        System.out.println("El tiempo de garantía es de " + tiempo + " años");
        return tiempo;
    }
}
