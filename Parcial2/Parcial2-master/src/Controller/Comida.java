package Controller;

import Model.Basededatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Comida {

    private final String tabla_pedidos = "pedidos";
    private String Comida;
    private String Bebida;
    
    public Comida() {
        
    }
    
    public String getComida() {
        return Comida;
    }

    public void setComida(String Comida) {
        this.Comida = Comida;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }
    
    public void GuardarComida(String Comida, String Bebida){
        Basededatos database = new Basededatos();
        Connection con = database.conectar();
        try{
            PreparedStatement consulta;
            
            consulta = con.prepareStatement("INSERT INTO " + this.tabla_pedidos + "(Comida, Bebida) VALUES(?, ?)");
            consulta.setString(1, Comida);
            consulta.setString(2, Bebida);
            consulta.executeUpdate();
            
            System.out.println("Se guardaron los datos correctamente. ");
            
        } 
        catch (SQLException ex){
            System.out.println("Hubo un error al momento de guardar los datos: " + ex.getMessage());
        }
    }
    
    public boolean ProbarPedido(String Comida, String Bebida) {
        Basededatos database = new Basededatos();
        Connection con = database.conectar();
        try {
            PreparedStatement consulta = con.prepareStatement("SELECT Bebida FROM " + this.tabla_pedidos + " WHERE Comida = ?");
            consulta.setString(1, Comida);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                String Pedido1 = resultado.getString("Bebida");
                return Bebida.equals(Pedido1);
            }
        } catch (SQLException ex) {
            // Manejo de excepciones opcionalmente
            System.out.println("Error en la verificación del login: " + ex.getMessage());
        }
        return false;
    }
}
