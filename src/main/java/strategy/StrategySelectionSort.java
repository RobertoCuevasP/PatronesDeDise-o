package strategy;

public class StrategySelectionSort implements IStrategy {

    @Override
    public Estudiante[] ordenar(Estudiante[] estudiantes) {
        Estudiante[] arr = estudiantes;
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j =  i+1; j < arr.length ;j++) {
                if (arr[j].getPromedio() < arr[min].getPromedio()) {
                    min = j;
                }
            }
            Estudiante temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
