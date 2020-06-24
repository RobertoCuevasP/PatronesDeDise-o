package composite;


public class Client {
    public static void main (String [] args){
        Computadora computadora1 = new Computadora();
        Computadora computadora2 = new Computadora();
        Computadora computadora3 = new Computadora();

        Laboratorio laboratorio1 =new Laboratorio();
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);

        Laboratorio laboratorio2 =new Laboratorio();
        laboratorio2.add(computadora3);

        Contenedor contenedor = new Contenedor();
        contenedor.add(laboratorio1);
        contenedor.add(laboratorio2);
        contenedor.add(computadora1);

        computadora1.precioTotal();
        laboratorio1.precioTotal();
        contenedor.precioTotal();
    }

}
