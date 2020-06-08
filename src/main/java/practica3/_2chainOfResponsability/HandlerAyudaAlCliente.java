package practica3._2chainOfResponsability;

public class HandlerAyudaAlCliente implements IHandler{

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
        System.out.println("Persona atendida por Ayuda al Cliente");
        System.out.println("A " + persona.getNombre() + " le faltan varios requisitos, los requisitos son su Certificado de Nacimiento y su pago al banco");
    }

}
