package practica5.adapter;

public class Client {
    public static void main(String[] args) {
        AdaptadorArtefactosGrandes adaptador = new AdaptadorArtefactosGrandes();
        Lavadora lavadora = new Lavadora(2000, 10);
        Televisor televisor = new Televisor(3500, 5);
        Refrigerador refrigerador = new Refrigerador(5000, 25);
        Celular celular = new Celular(1500, 2);
        Computadora computadora = new Computadora(3500, 5);
        Tablet tablet = new Tablet(2100, 3);

        System.out.println("***************************");
        celular.precio();
        celular.tiempoDeVida();
        System.out.println("***************************");
        tablet.precio();
        tablet.tiempoDeVida();
        System.out.println("***************************");
        computadora.precio();
        computadora.tiempoDeVida();
        System.out.println("***************************");
        adaptador.setArtefacto(televisor);
        adaptador.precio();
        adaptador.tiempoDeVida();
        System.out.println("***************************");
        adaptador.setArtefacto(refrigerador);
        adaptador.precio();
        adaptador.tiempoDeVida();
        System.out.println("***************************");
        adaptador.setArtefacto(lavadora);
        adaptador.precio();
        adaptador.tiempoDeVida();
    }
}
