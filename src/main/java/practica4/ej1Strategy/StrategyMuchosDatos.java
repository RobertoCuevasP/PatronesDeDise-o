package practica4.ej1Strategy;

import java.util.List;

public class StrategyMuchosDatos implements IStrategy {

    @Override
    public Celular buscar(int precio, List<Celular> celulares) {
        Celular[] celulars = (Celular[]) celulares.toArray();
        celulars = sort(celulars, 0, celulars.length);

        int i = 0;
        boolean seEncontro = false;
        Celular celular = new Celular("", "", "", 0);
        while (!seEncontro && i < celulars.length){
            if (celulars[i].getPrecio() == precio){
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
        Celular[] celulars = (Celular[]) celulares.toArray();
        celulars = sort(celulars, 0, celulars.length);

        int i = 0;
        boolean seEncontro = false;
        Celular celular = new Celular("", "", "", 0);
        while (!seEncontro && i < celulars.length){
            if (celulars[i].getModelo().equals(modelo)){
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
    public Celular buscar(int precio, String modelo, List<Celular> celulares) {
        Celular[] celulars = (Celular[]) celulares.toArray();
        celulars = sort(celulars, 0, celulars.length);

        int i = 0;
        boolean seEncontro = false;
        Celular celular = new Celular("", "", "", 0);
        while (!seEncontro && i < celulars.length){
            if (celulars[i].getPrecio() == precio && celulars[i].getModelo().equals(modelo)){
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

    private Celular[] sort(Celular[] arr, int from, int to) {
        if (to - from > 1) {
            int p = from;
            int i = to - 1;
            boolean izquierda = true;
            while (p != i) {
                if (izquierda) {
                    if (arr[p].getPrecio() <= arr[i].getPrecio()) {
                        i--;
                    } else {
                        Celular temp = arr[p];
                        arr[p] = arr[i];
                        arr[i] = temp;
                        int tempIndice = p;
                        p = i;
                        i = tempIndice + 1;
                        izquierda = false;
                    }
                } else {
                    if (arr[p].getPrecio() >= arr[i].getPrecio()) {
                        i++;
                    } else {
                        Celular temp = arr[p];
                        arr[p] = arr[i];
                        arr[i] = temp;
                        int tempIndice = p;
                        p = i;
                        i = tempIndice - 1;
                        izquierda = true;
                    }
                }
            }
            sort(arr, from, p);
            sort(arr, p + 1, to);
        }
        return arr;
    }
}
