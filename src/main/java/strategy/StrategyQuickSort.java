package strategy;

public class StrategyQuickSort implements IStrategy {

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        Estudiante[] estudiantesOrdenados = sort(estudiantes, 0, estudiantes.length);
        return estudiantesOrdenados;
    }

    private Estudiante[] sort(Estudiante[] arr, int from, int to) {
        if (to - from > 1) {
            int p = from;
            int i = to - 1;
            boolean izquierda = true;
            while (p != i) {
                if (izquierda) {
                    if (arr[p].getPromedio() <= arr[i].getPromedio()) {
                        i--;
                    } else {
                        Estudiante temp = arr[p];
                        arr[p] = arr[i];
                        arr[i] = temp;
                        int tempIndice = p;
                        p = i;
                        i = tempIndice + 1;
                        izquierda = false;
                    }
                } else {
                    if (arr[p].getPromedio() >= arr[i].getPromedio()) {
                        i++;
                    } else {
                        Estudiante temp = arr[p];
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
