package observer;

public interface IObservador {
    void update(String msg);
    String getCategoriaFavorita();
    void setCategoriaFavorita(String categoriaFavorita);
}
