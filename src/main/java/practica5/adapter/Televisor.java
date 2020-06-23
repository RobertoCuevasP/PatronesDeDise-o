package practica5.adapter;

public class Televisor implements ArtefactosElectronicosGrandes {

    private int monto;
    private int tiempo;

    public Televisor(int monto, int tiempo) {
        this.monto = monto;
        this.tiempo = tiempo;
    }

    @Override
    public int costo() {
        System.out.println("El costo del televisor es de " + monto);
        return monto;
    }

    @Override
    public int tiempoGarantia() {
        System.out.println("El tiempo de garantía es de " + tiempo + " años");
        return tiempo;
    }
}
