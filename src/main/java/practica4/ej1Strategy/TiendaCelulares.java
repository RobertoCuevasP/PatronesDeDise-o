package practica4.ej1Strategy;

import java.util.ArrayList;
import java.util.List;

public class TiendaCelulares {

    private List<Celular> celulares;
    private IStrategy strategy;

    public TiendaCelulares(){
        celulares = new ArrayList<>();
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(List<Celular> celulares) {
        this.celulares = celulares;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void buscar(int precio){
        strategy.buscar(precio, celulares);
    }

    public void buscar(String modelo){
        strategy.buscar(modelo, celulares);
    }

    public void buscar(int precio, String modelo){
        strategy.buscar(precio, modelo, celulares);
    }

    public void addCelular(Celular celular){
        celulares.add(celular);
    }
}
