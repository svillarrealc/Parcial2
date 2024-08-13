package parcial.pkg2;

import java.util.ArrayList;
import java.util.List;

public class Comida {
    private String nombre;
    private List<Usuario> cuenta;

    public Comida(String nombre) {
        this.nombre = nombre;
        this.cuenta = new ArrayList<>();
    }

    public void agregarComida(Usuario usuario) {
        cuenta.add(usuario);
    }

    public List<Usuario> obtenerComida() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }
}
