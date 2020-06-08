package practica3._1memento;

import java.util.ArrayList;
import java.util.List;

public class Backup {

    //Esta clase es mi concrete object
    private String alias;
    private List<Persona> personasAlmacenadas;

    public Backup(String alias){
        this.alias = alias;
        personasAlmacenadas = new ArrayList<>();
    }

    public void addPersona(Persona persona) {
        personasAlmacenadas.add(persona);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<Persona> getPersonasAlmacenadas() {
        return personasAlmacenadas;
    }

    public void setPersonasAlmacenadas(List<Persona> personasAlmacenadas) {
        this.personasAlmacenadas = personasAlmacenadas;
    }

    public void showData(){
        System.out.println("*************************");
        System.out.println("Alias: " + alias);
        int j = 0;
        for (Persona i : personasAlmacenadas){
            System.out.println("Persona " + j + ". Nombre: " + i.getNombre());
        }
    }
}
