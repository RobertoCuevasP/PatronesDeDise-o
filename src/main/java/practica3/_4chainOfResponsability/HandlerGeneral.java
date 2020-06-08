package practica3._4chainOfResponsability;

public class HandlerGeneral implements IHandler{
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
        if(msg.equals(Client.orden.Desbloqueos) || msg.equals(Client.orden.Manifestaciones)){
            System.out.println("Orden manejada por General");
        } else {
            next.criterioHandler(msg);
        }

    }
}
