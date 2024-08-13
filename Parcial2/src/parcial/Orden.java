package parcial.pkg2;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<Usuario> usuarios;
    private List<Comida> comidas;

    public Orden() {
        usuarios = new ArrayList<>();
        comidas = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarComidas() {
        for (Comida comida : comidas) {
            System.out.println("Comida: " + comida.getNombre());
        }
    }

    public Comida obtenerComida(String nombre) {
        for (Comida comida : comidas) {
            if (comida.getNombre().equals(nombre)) {
                return comida;
            }
        }
        return null;
    }

    public void agregarCuentaaUsuario(Usuario usuario, Comida comida) {
        comida.agregarComida(usuario);
    }

    public void crearGrupo(String nombre) {
        comidas.add(new Comida(nombre));
    }

    public void agregarUsuarioAGrupo(Usuario usuario, Comida comida) {
        comida.agregarComida(usuario);
    }
}
//esto es una prueba