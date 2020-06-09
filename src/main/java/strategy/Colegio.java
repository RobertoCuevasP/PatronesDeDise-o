package strategy;

public class Colegio {

    private int index;
    private Estudiante[] estudiantes;
    private IStrategy strategy;

    public Colegio(int nroEstudiantes){
        estudiantes = new Estudiante[nroEstudiantes];
        index = 0;
    }

    public Colegio(Estudiante[] estudiantes){
        this.estudiantes = estudiantes;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public Estudiante[] ordenar(){
        return strategy.ordenar(estudiantes);
    }

    public void addEstudiante(Estudiante estudiante){
        if(index < estudiantes.length){
            estudiantes[index] = estudiante;
            index++;
        } else {
            System.out.println("No se puede añadir al estudiante");
        }
    }
}
