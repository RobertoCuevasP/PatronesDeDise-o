package practica3._4chainOfResponsability;


public class Organizador implements IHandler {
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
    public void criterioHandler(Client.orden msg){
        HandlerCabo handlerCabo = new HandlerCabo();
        HandlerCoronel handlerCoronel = new HandlerCoronel();
        HandlerGeneral handlerGeneral = new HandlerGeneral();
        HandlerTeniente handlerTeniente = new HandlerTeniente();
        this.next = handlerGeneral;
        handlerGeneral.setNext(handlerTeniente);
        handlerTeniente.setNext(handlerCoronel);
        handlerCoronel.setNext(handlerCabo);
        next().criterioHandler(msg);

    }
}
