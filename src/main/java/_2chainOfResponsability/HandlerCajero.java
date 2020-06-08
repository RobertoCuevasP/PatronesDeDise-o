package practica3._2chainOfResponsability;

public class HandlerCajero implements IHandler{

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
        if(persona.getFicha() > 0 && persona.getCertificadoNacimiento() != null){
            System.out.println("Persona atendida por cajero");
            System.out.println("A " + persona.getNombre() + " le falta realizar su pago");
            persona.pagar();
            this.next = new HandlerResponsableCarnetizacion();
        }
        this.next().criterioHandler(persona);
    }
}
