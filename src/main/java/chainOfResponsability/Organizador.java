package chainOfResponsability;

public class Organizador implements IHandler {
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public int criterioHandler(int amount) {
        int dinero = 0;

        HandlerCreditoLocal handlerConcrete1 = new HandlerCreditoLocal(); // < 10000
        HandlerCreditoSucursal handlerConcrete2 = new HandlerCreditoSucursal(); //  10000- 20000
        HandlerCreditoDept handlerConcrete3 = new HandlerCreditoDept();
        HandlerCreditoNacional handlerConcrete4 = new HandlerCreditoNacional();//   20000 -50000

        this.setNext(handlerConcrete1);
        handlerConcrete1.setNext(handlerConcrete2);
        handlerConcrete2.setNext(handlerConcrete3);
        handlerConcrete3.setNext(handlerConcrete4);
        dinero = this.next.criterioHandler(amount);

        return dinero;
    }
}
