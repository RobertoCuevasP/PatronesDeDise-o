package strategy;

public class Client {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[10];

        System.out.println("****************Quick Sort******************");
        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Estudiante("X", (int) (Math.random() * 100) + 1);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getPromedio());
        }

        Colegio colegio = new Colegio(estudiantes);
        colegio.setStrategy(new StrategyQuickSort());
        colegio.ordenar();

        System.out.println("******************************************************");

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getPromedio());
        }

        System.out.println("**********Selection Sort*************");

        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Estudiante("X", (int) (Math.random() * 100) + 1);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getPromedio());
        }

        colegio.setStrategy(new StrategySelectionSort());
        colegio.ordenar();

        System.out.println("******************************************************");

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getPromedio());
        }

        System.out.println("**********Counting Sort*************");

        for (int i = 0; i < 10; i++) {
            estudiantes[i] = new Estudiante("X", (int) (Math.random() * 100) + 1);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getPromedio());
        }

        colegio.setStrategy(new StrategyCountingSort());
        colegio.ordenar();

        System.out.println("******************************************************");

        for(int i = 0; i < 10; i++){
            System.out.println(estudiantes[i].getPromedio());
        }


    }
}
