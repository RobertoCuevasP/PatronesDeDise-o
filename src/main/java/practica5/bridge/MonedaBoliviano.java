package practica5.bridge;

public class MonedaBoliviano implements Moneda {
    @Override
    public double tipoCambio(double monto, String moneda) {
        double aux = monto;

        if(moneda.equals("Dolar")){
            aux = aux * 0.14;
        } else if(moneda.equals("Euro")){
            aux = aux * 0.13;
        }

        return aux;
    }
}
