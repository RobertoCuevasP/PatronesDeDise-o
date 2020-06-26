package decorator;

public class FuncionalidadSeguro extends Decorator{

    public FuncionalidadSeguro(CuentaBancoBasica cuenta) {
        super(cuenta);
    }

    public void descontar(int x){
        System.out.println("Se tiene " + getMonto());
        this.setMonto(getMonto() * x / 100);
        System.out.println("Se descontó el " + x + "% del total. Ahora se tiene " + getMonto());
    }
}
