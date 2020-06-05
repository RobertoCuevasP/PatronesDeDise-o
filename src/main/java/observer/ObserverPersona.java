package observer;

public class ObserverPersona implements IObservador {

    private String nombre;
    private String categoriaFavorita;

    public ObserverPersona(String nombre, String categoriaFavorita) {
        this.nombre = nombre;
        this.categoriaFavorita = categoriaFavorita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCategoriaFavorita() {
        return categoriaFavorita;
    }

    @Override
    public void setCategoriaFavorita(String categoriaFavorita) {
        this.categoriaFavorita = categoriaFavorita;
    }

    @Override
    public void update(String msg){
        System.out.println(nombre + " recibió la notificación: " + msg);
    }
}
