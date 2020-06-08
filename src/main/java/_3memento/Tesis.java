package practica3._3memento;

public class Tesis {
    private String titulo;
    private String tema;
    private String contenido;

    public Tesis(String titulo, String tema, String contenido) {
        this.titulo = titulo;
        this.tema = tema;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void showData(){
        System.out.println("Título " + titulo);
        System.out.println("Tema " + tema);
        System.out.println("Contenido " + contenido);
    }
}
