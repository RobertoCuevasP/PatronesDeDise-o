package decorator;

public class Client {
    public static void main(String[] args) {
        CuentaBancoBasica cuenta1 = new CuentaBancoBasica("Roberto");
        cuenta1.addMonto(100);
        FuncionalidadPromocion promocion = new FuncionalidadPromocion(cuenta1);
        promocion.promocion();


        System.out.println("***************************************");
        CuentaBancoBasica cuenta2 = new CuentaBancoBasica("Raisa");
        cuenta2.addMonto(200);
        FuncionalidadPromocion promocion1 = new FuncionalidadPromocion(cuenta2);
        promocion1.promocion();
        FuncionalidadBancaInternet bancaInternet = new FuncionalidadBancaInternet(cuenta2);
        bancaInternet.bancaPorInternet();
        FuncionalidadSeguro seguro = new FuncionalidadSeguro(cuenta2);
        seguro.descontar(50);
    }
}
