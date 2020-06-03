package chainOfResponsability;

public class HandlerCreditoDept implements IHandler {
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
        if (amount >= 20000 && amount <= 50000){
            System.out.println("Proceso atentido por Crédito del Departamento");
            dinero = Caja.getInstance().cobrarPrestamo(amount);
        } else {
            dinero = next.criterioHandler(amount);
        }
        return dinero;
    }
}
