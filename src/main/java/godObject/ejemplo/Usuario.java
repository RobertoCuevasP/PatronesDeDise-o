package godObject.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {


    private String nombre;
    private int saldo;
    private String contrasena;
    private String direccion;
    private List<String> facturas = new ArrayList<>();
    private int nroVecesPago = 0;

    public void registro(String nombre, int saldo, String contrasena, String direccion){
        this.nombre = nombre;
        this.saldo = saldo;
        this.contrasena = contrasena;
        this.direccion = direccion;
    }

    public void login(String nombre, String contrasena){
        if(this.nombre.equals(nombre) && this.contrasena.equals(contrasena)){
            System.out.println("El usuario " + nombre + " se encuentra registrado");
        } else {
            System.out.println("Datos inválidos");
        }

    }


    public void restaurarContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public String getDireccion(){
        return direccion;
    }

    public String getNombre(){
        return nombre;
    }

    public void anadirSaldo(int saldo){
        this.saldo += saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void anadirFactura(String factura){
        this.facturas.add(factura);
        nroVecesPago++;
    }

    public void estadisticasManufacturacion(){
        System.out.println("El total de las facturas es de " + facturas.size());
    }

    public void estadisticasPago(){
        System.out.println("Las veces realizadas de pago es de " + nroVecesPago);
    }


}
