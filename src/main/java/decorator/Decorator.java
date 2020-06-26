package decorator;

public class Decorator implements ICuentaBanco {

    private CuentaBancoBasica cuenta;

    public Decorator(CuentaBancoBasica cuenta){
        this.cuenta = cuenta;
    }

    @Override
    public int getMonto() {
        return cuenta.getMonto();
    }

    @Override
    public void setMonto(int monto) {
        cuenta.setMonto(monto);
    }
}
