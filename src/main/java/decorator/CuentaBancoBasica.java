package decorator;

public class CuentaBancoBasica implements ICuentaBanco{
    private String nombrePropietario;
    private int monto;

    public CuentaBancoBasica(String nombrePropietario){
        this.nombrePropietario = nombrePropietario;
        monto = 0;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void addMonto(int monto){
        this.monto += monto;
    }

    @Override
    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int getMonto() {
        return monto;
    }
}
