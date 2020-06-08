package practica3._2chainOfResponsability;

public class HandlerResponsableCarnetizacion implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler){
        this.next = handler;
    }

    @Override
    public IHandler next(){
        return next;
    }

    @Override
    public void criterioHandler(Persona persona) {
        if (persona.getCertificadoNacimiento() != null && persona.isPagoBanco() && persona.getFicha() > 0){
            System.out.println("Persona atentida por el responsable de carnetización.");
            System.out.println(persona.getNombre() + " tiene todos los requisitos necesarios");
        } else {
            this.next().criterioHandler(persona);
        }
    }

}
