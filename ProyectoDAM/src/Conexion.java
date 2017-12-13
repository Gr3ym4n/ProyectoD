
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARN
 */
public class Conexion {
    public static Connection conexion=null;
    public Statement sentencia=null;
    public PreparedStatement sentenciaInsert,sentenciaUpdate;
    public ResultSet rs=null;
    public boolean valor;
    public String sql="";

    public static Connection getInstancia(){
        if(Conexion.conexion==null){
            Conexion.conectar();
        }
        return conexion;
    }
    
    public static void conectar(){    
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.143:1521:xe","practicasiap", "practicasiap");
        } catch (ClassNotFoundException ex) {
                System.out.println("Error. Clase no encontrada: "+ex.getMessage()+" "+ex.getLocalizedMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,   "Conexion no valida. Parametros de conexion incorrectos.");
            System.out.println("Error en conexion a BBDD: "+ex.getMessage()+" "+ex.getLocalizedMessage()+" "+ex.getErrorCode());
        }
    }
    
    
    public void EliminarRegistro(String table,int id){
        try {
            sql="DELETE FROM "+table+" WHERE ID = ?";
            
            sentenciaUpdate=conexion.prepareStatement(sql);
            sentenciaUpdate.setInt(1,id);
            sentenciaUpdate.execute();
            conexion.commit();
            sentenciaUpdate=null;
        } catch (SQLException ex) {
            System.out.println("Error al eliminar registro. Error: "+ex.getMessage()+" - "+
                    ex.getSQLState()+" - "+ex.getErrorCode());
        }
    }
    //ADAPTAR A CADA TABLA
    public void InsertarVisitas(int idGrup, int idEsp, String tDat, String tDesc) {
        try {
            sql="INSERT INTO table_name(name_columns) VALUES (?,?,?,?,?,0)";
            sentenciaInsert=conexion.prepareStatement(sql);
            //sentenciaInsert.setInt(1, getNextId("VISITA"));
            sentenciaInsert.setInt(2, idGrup);
            sentenciaInsert.setInt(3, idEsp);
            sentenciaInsert.setString(4, tDat);
            sentenciaInsert.setString(5, tDesc);
            sentenciaInsert.executeUpdate();
            conexion.commit();
            sentenciaInsert=null;
        } catch (SQLException ex) {
            System.out.println("Error al insertar registro en table_name. Error: "+ex.getMessage()+" - "+
                    ex.getSQLState()+" - "+ex.getErrorCode());
        }
    }
    public ResultSet RecuperarTodo(String tabla){
        
        return rs;
    }

    
    
    
}
