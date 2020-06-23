package godObject.ejemploBienImplementado;

public class Saldo {

    private int saldo;

    public Saldo(int saldo) {
        this.saldo = saldo;
    }

    public void anadirSaldo(int saldo){
        this.saldo += saldo;
    }

    public int getSaldo(){
        return saldo;
    }
}
