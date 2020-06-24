package composite;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Component {

    private List<Laboratorio> list = new ArrayList<>();
    private int totalEstimacion=0;


    @Override
    public int precioTotal() {

        for (Component componente : list ) {
            totalEstimacion += componente.precioTotal();
        }
        System.out.println("Existe un total de " + list.size() + " laboratorios. Su precio total es de " + totalEstimacion);
        return totalEstimacion;
    }

    @Override
    public void add(Component component) {
        if(component instanceof Laboratorio) {
            list.add((Laboratorio) component);
        } else {
            System.out.println("El elemento no es una laboratorio");
        }

    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

}
