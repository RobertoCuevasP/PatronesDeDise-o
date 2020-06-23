package practica4.ej1Strategy;

public class Client {
    public static void main(String[] args) {
        int value = 5;
        TiendaCelulares tienda = new TiendaCelulares();
        for(int i = 0; i < 11; i++){
            tienda.addCelular(new Celular("Samsung X" + i, "Xperia", "Alta", i * 100));
        }
        if(value > 10){
            System.out.println("Utilizando algoritmo para muchos datos");
            tienda.setStrategy(new StrategyMuchosDatos());
        } else {
            System.out.println("Utilizando algoritmo para pocos datos");
            tienda.setStrategy(new StrategyPocosDatos());
        }
        tienda.buscar(700);
        tienda.buscar("Samsung X1");
        tienda.buscar( 300, "Samsung X3");
    }
}
