package chainOfResponsability;

public class HandlerCreditoNacional implements IHandler {
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
    public int criterioHandler(int amount){
        int dinero = 0;
        System.out.println("Proceso atentido por Crédito Nacional");
        dinero = Caja.getInstance().cobrarPrestamo(amount);
        return dinero;
    }
}
