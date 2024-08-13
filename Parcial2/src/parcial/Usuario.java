/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.pkg2;

/**
 *
 * @author Enrique
 */
/**
 *
 * @author Enrique
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String ID;
    private String correo;


    public Usuario(String nombre, String apellido, String nick, int edad, String ID, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ID = ID;
        this.correo = correo;
    }





    public boolean autenticar( String ID) {
        return this.ID.equals(ID);
    }

    public String obtenerInfo() {
        return "Nombre: " + nombre + " " + apellido  + ", Edad: " + edad + ", Correo: " + correo;
    }
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nameOfTheAnimal) {
        this.nombre = nameOfTheAnimal;
    }
}