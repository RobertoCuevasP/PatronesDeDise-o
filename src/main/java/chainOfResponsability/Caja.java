package chainOfResponsability;

public class Caja implements Cloneable {
    private static Caja instance= null;
    private int monto;

    private Caja(){
        monto = 70000;
    }

    private synchronized static void makeInstance(){
        if (instance == null) {
            instance = new Caja();
        }
    }

    public static Caja getInstance(){
        if (instance == null) {
            makeInstance();
        }
        return instance;
    }


    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public int cobrarPrestamo(int monto){
        if(monto < this.monto && this.monto > 0){
            this.monto -= monto;
            return monto;
        } else {
            System.out.println("No se pudo realizar el préstamo debido");
            return 0;
        }
    }

}
