package practica5.visitor;

import java.time.LocalDateTime;

public class VisitorVeterinario implements IVisitor {

    public enum tipoEnfermedades{
        enfermedad1, enfermedad2
    }


    @Override
    public void curar(Perro perro) {
        if(perro.getEnfermedad().equals(tipoEnfermedades.enfermedad1)){
            System.out.println("Se está tratando la enfermedad 1 al perro "+ perro.getNombre());
            perro.setCurado(true);
            System.out.println("El perrito se curó a horas:  " + LocalDateTime.now());
        } else if(perro.getEnfermedad().equals(tipoEnfermedades.enfermedad2)){
            System.out.println("Se está tratando la enfermedad 2 al perro " + perro.getNombre());
            perro.setCurado(true);
            System.out.println("El perrito se curó a horas: " + LocalDateTime.now());
        }
    }

    @Override
    public void curar(Gato gato) {
        if(gato.getEnfermedad().equals(tipoEnfermedades.enfermedad1)){
            System.out.println("Se está tratando la enfermedad 1 al gato " + gato.getNombre());
            gato.setCurado(true);
            System.out.println("El gato se curó a horas " + LocalDateTime.now());
        } else if(gato.getEnfermedad().equals(tipoEnfermedades.enfermedad2)){
            System.out.println("Se está tratando la enfermedad 2 al gato " + gato.getNombre());
            gato.setCurado(true);
            System.out.println("El gato se curó a horas " + LocalDateTime.now());
        }
    }

    @Override
    public void curar(Caballo caballo) {
        if(caballo.getEnfermedad().equals(tipoEnfermedades.enfermedad1)){
            System.out.println("Se está tratando la enfermedad 1 al Caballo "+ caballo.getNombre());
            caballo.setCurado(true);
            System.out.println("El caballo se curó a horas " + LocalDateTime.now());
        } else if(caballo.getEnfermedad().equals(tipoEnfermedades.enfermedad2)){
            System.out.println("Se está tratando la enfermedad 2 al Caballo " + caballo.getNombre());
            caballo.setCurado(true);
            System.out.println("El caballo se curó a horas " + LocalDateTime.now());
        }
    }
}
