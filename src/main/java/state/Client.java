package state;

public class Client {
    public static void main(String[] args) {
        MaquinaDispensadora maquinaDispensadora = new MaquinaDispensadora(new Producto(50));
       int dinero = (int) (Math.random() * 100 +1);
       if (dinero > 50){
           maquinaDispensadora.setMonto(new MontoSuperior());
       } else if (dinero == 50){
           maquinaDispensadora.setMonto(new MontoExacto());
       } else {
           maquinaDispensadora.setMonto(new MontoInsuficiente());
       }
        maquinaDispensadora.comprar(dinero);
    }
}
