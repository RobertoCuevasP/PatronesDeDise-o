package decorator;

public class FuncionalidadPromocion extends Decorator{

    public FuncionalidadPromocion(CuentaBancoBasica cuenta) {
        super(cuenta);
    }

    public void promocion(){
        int value = (int) (Math.random() * 100 + 1);
        if(value % 2 == 0){
            System.out.println("Se consiguió la promoción!!! Se duplicará su monto en la cuenta. Usted tenía " + getMonto());
            setMonto(getMonto() * 2);
            System.out.println("Ahora tiene " + getMonto());
        } else {
            System.out.println("Lastima, no consiguió la promoción");
        }

    }
}
