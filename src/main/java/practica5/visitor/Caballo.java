package practica5.visitor;

public class Caballo implements Animal {

    private String nombre;
    private VisitorVeterinario.tipoEnfermedades enfermedad;
    private boolean curado;

    public Caballo(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public VisitorVeterinario.tipoEnfermedades getEnfermedad() {
        return enfermedad;
    }

    public boolean isCurado() {
        return curado;
    }

    public void setCurado(boolean curado) {
        this.curado = curado;
    }

    @Override
    public void definirEnfermedad(VisitorVeterinario.tipoEnfermedades enfermedad) {
        this.enfermedad = enfermedad;
        curado = false;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.curar(this);
    }
}
