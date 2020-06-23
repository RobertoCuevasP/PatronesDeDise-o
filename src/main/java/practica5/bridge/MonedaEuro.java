package practica5.bridge;

public class MonedaEuro implements Moneda {
    @Override
    public double tipoCambio(double monto, String moneda) {
        double aux = monto;
        if(moneda.equals("Boliviano")){
            aux = aux * 7.76;
        } else if (moneda.equals("Dolar")){
            aux = aux * 1.12;
        }
        return aux;
    }
}
