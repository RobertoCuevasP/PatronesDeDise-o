package composite;

import java.util.ArrayList;
import java.util.List;


public class Laboratorio extends Component {

    private List<Computadora> list = new ArrayList<>();
    private int totalEstimacion=0;


    @Override
    public int precioTotal() {

        for (Component componente:list ) {
            totalEstimacion=totalEstimacion+componente.precioTotal();
        }
        System.out.println("Existe un total de " + list.size() + " computadoras. Su precio total es de " + totalEstimacion);
        return totalEstimacion;
    }

    @Override
    public void add(Component component) {
        if(component instanceof Computadora) {
            list.add((Computadora) component);
        } else {
            System.out.println("El elemento no es una computadora");
        }

    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

}
