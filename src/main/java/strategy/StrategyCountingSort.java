package strategy;

public class StrategyCountingSort implements IStrategy {

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        insertionSort(estudiantes);
        return estudiantes;
    }


    public void insertionSort(Estudiante array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            Estudiante key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i].getPromedio() > key.getPromedio())) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}