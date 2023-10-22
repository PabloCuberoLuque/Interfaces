package controller;

import modelo.Genero;
import modelo.Usuario;
import modelo.ConexionBBDD;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioController {
    private final static ConexionBBDD con = new ConexionBBDD();
    
    public static void createUsuario(Usuario usuario){
        try{
            con.connection();
            String sql="INSERT INTO usuarios VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = con.con1.prepareStatement(sql);
            
            stmt.setInt(1,0);
            stmt.setString(2,usuario.getUsuario());
            stmt.setString(3, usuario.getContraseña());
            stmt.setString(4, usuario.getNombre());
            stmt.setString(5, usuario.getApellidos());
            stmt.setString(6,usuario.getGenero().toString());
      
            stmt.execute();
            con.cerrarConexion();
}       catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    public static void deleteUsuario(String usuario){
        try{
            con.connection();
            String sql="DELETE FROM usuarios WHERE usuario = ?";
            PreparedStatement stmt = con.con1.prepareStatement(sql);
            
            stmt.setString(1, usuario);
           
      
            stmt.execute();
            con.cerrarConexion();
}       catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
    public static void findByUsuario(String usuario){
        try{
            con.connection();
            String sql= "SELECT * FROM usuarios WHERE usuario = ?";
            
            PreparedStatement stmt = con.con1.prepareStatement(sql);
            
            stmt.setString(1, usuario);
            stmt.execute();
            con.cerrarConexion();
        }catch(SQLException e){
            e.printStackTrace();
        }      
    }
    
    
    public static void nombreUsuario(String usuario){
        try{
            con.connection();
            String sql= "SELECT usuario FROM usuarios WHERE usuario = ?";
            
            PreparedStatement stmt = con.con1.prepareStatement(sql);
            
            stmt.setString(1, usuario);
            stmt.execute();
            con.cerrarConexion();
            
        }catch(SQLException e){
            e.printStackTrace();
        }      
    }
    
    public static void updateContraseña(String contraseñaNueva,String usuario){
         try{
            con.connection();
             String sql = "UPDATE usuarios SET contraseña = ? WHERE usuario = ?";
            
            PreparedStatement stmt = con.con1.prepareStatement(sql);
            
            stmt.setString(1, contraseñaNueva);
            stmt.setString(2, usuario);
            
            stmt.execute();
            con.cerrarConexion();
        }catch(SQLException e){
            e.printStackTrace();
        }      
    }
    
 
    
    
    
    
    
    
    
    
    
}
