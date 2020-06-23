package practica4.ej1Strategy;

import java.util.List;

public interface IStrategy {
    Celular buscar(String modelo, List<Celular> celulares);
    Celular buscar(int precio, List<Celular> celulares);
    Celular buscar(int precio, String modelo, List<Celular> celulares);
}
