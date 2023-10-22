package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBBDD {
    public Connection con1 = null;
    
    public void connection (){
        try {
            String url = "jdbc:mysql://localhost:3306/exploramundoingles";
            String user = "PabloCL";
            String pasword = "pablito7777777";
            con1 = DriverManager.getConnection(url, user, pasword);
            if (con1 != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
                System.out.println("ERROR:La dirección no es válida o el usuario y clave");
            ex.printStackTrace();
        }
    }
    
    
    
    
    
    public void cerrarConexion (){
                try {
                con1.close();
        } catch (SQLException ex) {
                System.out.println("ERROR:al cerrar la conexión");
            ex.printStackTrace();
        }
    }
}
