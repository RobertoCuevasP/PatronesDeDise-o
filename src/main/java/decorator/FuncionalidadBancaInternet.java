package decorator;

public class FuncionalidadBancaInternet extends Decorator {

    private boolean enable;

    public FuncionalidadBancaInternet(CuentaBancoBasica cuenta) {
        super(cuenta);
    }

    public void bancaPorInternet(){
        this.enable = true;
        System.out.println("Se tiene habilitado la banca por internet");
    }
}
