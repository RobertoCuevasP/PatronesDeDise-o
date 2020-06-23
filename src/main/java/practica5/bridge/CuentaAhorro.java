package practica5.bridge;

public class CuentaAhorro implements Cuenta {

    private MonedaBoliviano tipoMoneda = new MonedaBoliviano();
    private float monto = 0;

    @Override
    public void agregarDinero(double cantidad, Moneda moneda) {
        if(!(moneda instanceof MonedaBoliviano)){
            cantidad = moneda.tipoCambio(cantidad, "Boliviano");
        }
        System.out.println("Agregando cantidad " + cantidad + "Bs");
        monto += cantidad;
        monto = monto + (monto * 2 / 100); //Interés 2%
        System.out.println("El monto acumulado es de " + monto);
    }
}
