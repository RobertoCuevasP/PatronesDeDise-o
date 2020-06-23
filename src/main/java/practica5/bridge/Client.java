package practica5.bridge;

public class Client {
    public static void main(String[] args) {
        MonedaDolar dolar = new MonedaDolar();
        MonedaEuro euro = new MonedaEuro();
        CuentaAhorro cuentaAhorro = new CuentaAhorro();
        CuentaCredito cuentaCredito = new CuentaCredito();
        CuentaPlazoFijo cuentaPlazoFijo = new CuentaPlazoFijo();

        System.out.println("**********************************");
        cuentaAhorro.agregarDinero(100, dolar);

        System.out.println("**********************************");
        cuentaPlazoFijo.agregarDinero(100, euro);

        System.out.println("**********************************");
        cuentaCredito.agregarDinero(100, dolar);
    }
}
