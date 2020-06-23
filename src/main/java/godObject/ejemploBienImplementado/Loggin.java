package godObject.ejemploBienImplementado;

import java.util.HashMap;
import java.util.Map;

public class Loggin {

    private Map<String, Perfil> usuarios = new HashMap<>();

    public void registro(String nombre, String contrasena, String direccion){
        Perfil perfil = new Perfil(nombre, direccion, contrasena);
        usuarios.put(nombre, perfil);

    }

    public Perfil login(String nombre, String contrasena){
        if(usuarios.get(nombre) != null && usuarios.get(nombre).getContrasena().equals(contrasena)){
            Perfil perfil = usuarios.get(nombre);
            System.out.println("El usuario " + nombre + " se encuentra registrado");
            return perfil;
        } else {
            System.out.println("Datos inválidos");
            return null;
        }

    }
}
