package practica3._2chainOfResponsability;

public class Persona {

    private String nombre;
    private CertificadoNacimiento certificadoNacimiento;
    private int ficha;
    private int monto;
    private boolean pagoBanco;

    public Persona(String nombre){
        this.nombre = nombre;
        this.monto = 1000;
        this.pagoBanco = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CertificadoNacimiento getCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(CertificadoNacimiento certificadoNacimiento){
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public void recibirCertificado(CertificadoNacimiento certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isPagoBanco() {
        return pagoBanco;
    }

    public void pagar() {
        monto -= monto;
        this.pagoBanco = true;
    }
}
