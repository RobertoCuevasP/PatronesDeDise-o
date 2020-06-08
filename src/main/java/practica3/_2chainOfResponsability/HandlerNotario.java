package practica3._2chainOfResponsability;

public class HandlerNotario implements IHandler{
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
        if(persona.getFicha() > 0 && persona.isPagoBanco()) {
            System.out.println("Persona atendida por Notario");
            System.out.println(persona.getNombre() + ", le falta su Certificado de Nacimiento. Se le entragará su Certificado correspondiente");
            persona.recibirCertificado(new CertificadoNacimiento());
            this.next = new HandlerResponsableCarnetizacion();

        }
        this.next().criterioHandler(persona);

    }
}
