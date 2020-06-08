package practica3._2chainOfResponsability;

public class Organizador implements IHandler{

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
    public void criterioHandler(Persona persona){
        HandlerAyudaAlCliente handlerAyudaAlCliente = new HandlerAyudaAlCliente();
        HandlerCajero handlerCajero = new HandlerCajero();
        HandlerNotario handlerNotario = new HandlerNotario();
        HandlerResponsableCarnetizacion handlerResponsableCarnetizacion = new HandlerResponsableCarnetizacion();
        this.setNext(handlerResponsableCarnetizacion);
        if (!persona.isPagoBanco()){
            handlerResponsableCarnetizacion.setNext(handlerCajero);
        }
        if (persona.getCertificadoNacimiento() == null){
            handlerResponsableCarnetizacion.setNext(handlerNotario);
        }
        handlerNotario.setNext(handlerAyudaAlCliente);
        handlerCajero.setNext(handlerAyudaAlCliente);

        this.next.criterioHandler(persona);


    }
}
