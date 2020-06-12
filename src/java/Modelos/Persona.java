
package Modelos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author JHONATAN CORTEZ
 */
public class Persona extends Conexion{
    String dui_persona;
    String apellidos_persona;
    String nombres_persona;

        
    Statement state;
    ResultSet resutl;

    public String getDui_persona() {
        return dui_persona;
    }

    public void setDui_persona(String dui_persona) {
        this.dui_persona = dui_persona;
    }

    public String getApellidos_persona() {
        return apellidos_persona;
    }

    public void setApellidos_persona(String apellidos_persona) {
        this.apellidos_persona = apellidos_persona;
    }

    public String getNombres_persona() {
        return nombres_persona;
    }

    public void setNombres_persona(String nombres_persona) {
        this.nombres_persona = nombres_persona;
    }
    
    
    //contructor vacio
    public Persona(){
        
    }
    
    public Persona(String dui_persona, String apellidos_persona, String nombres_persona) {
        this.dui_persona = dui_persona;
        this.apellidos_persona = apellidos_persona;
        this.nombres_persona = nombres_persona;
    }
    
    //inicia metodo para insertar datos 
    public boolean insertarDatos(){
        try {
            String miQuery = "insert into tb_persona values ('" + dui_persona + "', '" + apellidos_persona + "', '" + nombres_persona + "');";
            int estado = 0;
            state = obtenerConexion().createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //metodo para consultar datos
    public ArrayList<Persona> consultarRegistros(){
        ArrayList<Persona> pers = new ArrayList<>();
        try {
            String miQuery = "select * from tb_persona order by apellidos_persona desc";
            
            state = obtenerConexion().createStatement();
            resutl = state.executeQuery(miQuery);
            
            while (resutl.next()) {                
                pers.add(
                        new Persona(
                                resutl.getString("dui_persona"),
                                resutl.getString("apellidos_persona"),
                                resutl.getString("nombres_persona")
                        )
                );
            }
        } catch (SQLException ex) {
            System.out.println("Error, problema en \n" + ex);
        }
        return pers;
    }
    
    //metod para actualizar
    public Persona obtenerDatos(){
        Persona pers = null;
        try {
            String miQuery = "select * from tb_persona where dui_persona ='" + dui_persona + "'";
            state = obtenerConexion().createStatement();
            resutl = state.executeQuery(miQuery);
            if (resutl.next()) {
                pers = new Persona(
                    resutl.getString("dui_persona"),
                    resutl.getString("apellidos_persona"),
                    resutl.getString("nombres_persona")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pers;
    }
    
    //metodo para modificar los datos de la BD
    public boolean modificarDatos(){
        try {
            String pass = "";
            if (dui_persona.isEmpty()) {
                pass="";
            } else {
                pass = "dui_persona=MD5('" + dui_persona + "'),";
            }
            String miQuery = "update tb_persona set dui_persona='" + dui_persona + "', apellidos_persona ='" + apellidos_persona + "', nombres_persona ='" + nombres_persona + "'where dui_persona ='" + dui_persona +"'";
            int estado = 0;
            state = obtenerConexion().createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean actualizar(String duiP, String apellidosP, String nombresP){
        try {
            int estado = 0;
            String miQuery = "update tb_persona set dui_persona='" + dui_persona + "', apellidos_persona='" + nombres_persona + "', nombres_persona='" + nombres_persona + "' where dui_persona ='" + dui_persona + "';";
            state = obtenerConexion().createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //metodo para borrar registro
    public boolean eliminarDatos(){
        try {
            String miQuery = "delete from tb_persona where dui_persona =' " + dui_persona + " ' ";//que hacen esas comillas dobles al final
            int estado = 0;
            state = obtenerConexion().createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
