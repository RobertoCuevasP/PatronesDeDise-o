package practica3._4chainOfResponsability;

public class HandlerCabo implements IHandler {
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
        if(msg.equals(Client.orden.Limpiezas)){
            System.out.println("Orden manejada por Cabo");
        }
    }
}
