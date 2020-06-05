package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectCanalYoutube implements ISubject {

    private List<Video> videosSubidos;
    private List<IObservador> personasSuscritas;

    public SubjectCanalYoutube() {
        videosSubidos = new ArrayList<>();
        personasSuscritas = new ArrayList<>();
    }

    public void subirVideo(Video video){
        videosSubidos.add(video);
        notifyObserver(video);
    }

    @Override
    public void attach(IObservador observer){
        //Suscribirse
        personasSuscritas.add(observer);
    }

    @Override
    public void deAttach(IObservador observer){
        //Desuscribirse
        personasSuscritas.remove(observer);
    }

    @Override
    public void notifyObserver(Video video){
        for(IObservador i: personasSuscritas){
            if(i.getCategoriaFavorita().equals(video.getCategoria()) || i.getCategoriaFavorita().equals("anyCategory")){
                i.update("Nuevo Video! de " + video.getCategoria() +". Haz click para verlo");
            }
        }
    }
}
