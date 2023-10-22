package modelo;

import modelo.Genero;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {

    private int id;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellidos;
    private Genero genero;
 
    
    public Usuario(ResultSet rs){
        try{
            this.id=rs.getInt("id");
            this.usuario=rs.getString("usuario");
            this.contraseña=rs.getString("contraseña");
            this.nombre=rs.getString("nombre");
            this.apellidos=rs.getString("Nacionalidad");
            this.genero=(Genero) rs.getObject("genero");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
            
    }
    
    public Usuario() {
    }
    
    public Usuario(int id, String usuario, String contraseña, String nombre, String apellidos, Genero genero) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

   
    
    
}
