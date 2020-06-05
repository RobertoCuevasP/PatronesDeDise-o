package observer;

public class Video {

    private String tipo;
    private String titulo;
    private int tiempo;
    private String categoria;

    public Video(String tipo, String titulo, int tiempo, String categoria) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.tiempo = tiempo;
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
