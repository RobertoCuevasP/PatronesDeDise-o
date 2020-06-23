package practica5.bridge;

public class MonedaDolar implements Moneda {
    @Override
    public double tipoCambio(double monto, String moneda) {
        double aux = monto;
        if(moneda.equals("Boliviano")){
            aux = aux * 6.96;
        } else if(moneda.equals("Euro")) {
            aux  = aux * 0.89;
        }

        return aux;
    }
}
