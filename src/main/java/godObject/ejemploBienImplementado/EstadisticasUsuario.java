package godObject.ejemploBienImplementado;

import java.util.ArrayList;
import java.util.List;

public class EstadisticasUsuario {
    private List<String> facturas = new ArrayList<>();
    private int nroVecesPago = 0;

    public void anadirFactura(String factura){
        this.facturas.add(factura);
        nroVecesPago++;
    }

    public void estadisticasManufacturacion(){
        System.out.println("El total de las facturas es de " + facturas.size());
    }

    public void estadisticasPago(){
        System.out.println("Las veces realizadas de pago es de " + nroVecesPago);
    }
}
