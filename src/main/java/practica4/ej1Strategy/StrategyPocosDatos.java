package practica4.ej1Strategy;

import java.util.List;

public class StrategyPocosDatos implements IStrategy{

    @Override
    public Celular buscar(int precio, List<Celular> celulares) {
        int i = 0;
        boolean seEncontro = false;
        Celular celular = new Celular("", "", "", 0);
        while (!seEncontro && i < celulares.size()){
            if (celulares.get(i).getPrecio() == precio){
                celular = celulares.get(i);
                seEncontro = true;
            }
            i++;
        }
        if(seEncontro){
            celular.showData();
        } else {
            System.out.println("No se encontró modelo con las especificaciones dadas");
        }
        return celular;
    }

    @Override
    public Celular buscar(String modelo, List<Celular> celulares) {
        int i = 0;
        boolean seEncontro = false;
        Celular celular = new Celular("", "", "", 0);
        while (!seEncontro && i < celulares.size()){
            if (celulares.get(i).getModelo().equals(modelo)){
                celular = celulares.get(i);
                seEncontro = true;
            }
            i++;
        }
        if(seEncontro){
            celular.showData();
        } else {
            System.out.println("No se encontró modelo con las especificaciones dadas");
        }
        return celular;    }

    @Override
    public Celular buscar(int precio, String modelo, List<Celular> celulares) {
        int i = 0;
        boolean seEncontro = false;
        Celular celular = new Celular("", "", "", 0);
        while (!seEncontro && i < celulares.size()){
            if (celulares.get(i).getPrecio() == precio && celulares.get(i).getModelo().equals(modelo)){
                celular = celulares.get(i);
                seEncontro = true;
            }
            i++;
        }
        if(seEncontro){
            celular.showData();
        } else {
            System.out.println("No se encontró modelo con las especificaciones dadas");
        }
        return celular;
    }
}
