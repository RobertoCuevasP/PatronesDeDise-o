package practica5.adapter;

public class Lavadora implements ArtefactosElectronicosGrandes {

    private int monto;
    private int tiempo;

    public Lavadora(int monto, int tiempo) {
        this.monto = monto;
        this.tiempo = tiempo;
    }

    @Override
    public int costo() {
        System.out.println("El costo de la lavadora es de " + monto);
        return monto;
    }

    @Override
    public int tiempoGarantia() {
        System.out.println("El tiempo de garantía es de " + tiempo + " años");
        return tiempo;
    }
}
