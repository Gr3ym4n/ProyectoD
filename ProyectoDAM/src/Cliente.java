
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Cliente {
    private int cp, tlf, fax,id=-1;
    private String nif,nombre,direccion,poblacion,provincia,mail;

    public Cliente() {
    }

    public Cliente(int id, String nif, String nombre, String direccion, String poblacion, String provincia, int tlf, int fax, int cp, String mail) {
        this.cp = cp;
        this.tlf = tlf;
        this.fax = fax;
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.mail = mail;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

public void getDataCliente(String nombre){//BUSCAR
        try {
            String sql="SELECT ID,NIF,NOMBRE,DIRECCION,POBLACION,PROVINCIA,CODIGO_POSTAL,TELEFONO,FAX,E_MAIL"
                    + " FROM CLIENTES WHERE NOMBRE=?";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            query.setString(1, nombre);
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                rs.next();
                this.id=rs.getInt("ID");
                this.cp = rs.getInt("CODIGO_POSTAL");
                this.tlf = rs.getInt("TELEFONO");
                this.fax = rs.getInt("FAX");
                this.nif = rs.getString("NIF");
                this.nombre = rs.getString("NOMBRE");
                this.direccion = rs.getString("DIRECCION");
                this.poblacion = rs.getString("POBLACION");
                this.provincia = rs.getString("PROVINCIA");
                this.mail = rs.getString("E_MAIL");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrarCliente(){//BORRAR
        if(this.id>0){
            try {
                String sql="DELETE FROM CLIENTES WHERE ID=?";

                PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);

                query.setInt(1, this.id);

                query.execute();

            } catch (SQLException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
                    JOptionPane.showMessageDialog(null,  "No hay datos a borrar. Busque un cliente primero.");
        }
    }
    public void insertCliente(){//ANIADIR
        try {
            String sql="INSERT INTO CLIENTES(NIF,NOMBRE,"
                    + "DIRECCION,CODIGO_POSTAL,POBLACION,PROVINCIA,TELEFONO,FAX,E_MAIL) VALUES (?,?,?,"
                    + "?,?,?,?,?,?)";
            
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            query.setString(1, this.nif);
            query.setString(2, this.nombre);
            query.setString(3, this.direccion);
            query.setInt(4, this.cp);
            query.setString(5, this.poblacion);
            query.setString(6, this.provincia);
            query.setInt(7, this.tlf);
            query.setInt(8, this.fax);
            query.setString(9, this.mail);
            
            query.executeUpdate();
            Conexion.getInstancia().commit();
            
            this.getDataCliente(this.nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateCliente(){//ACTUALIZAR
        try {
            String sql="UPDATE CLIENTES SET NIF=?,NOMBRE=?,"
                    + "DIRECCION=?,CODIGO_POSTAL=?,POBLACION=?,PROVINCIA=?,TELEFONO=?,FAX=?,E_MAIL=? WHERE ID=?";
            
            PreparedStatement sentenciaUpdate=Conexion.getInstancia().prepareStatement(sql);
            
            sentenciaUpdate.setString(1, this.nif);
            sentenciaUpdate.setString(2, this.nombre);
            sentenciaUpdate.setString(3, this.direccion);
            sentenciaUpdate.setInt(4, this.cp);
            sentenciaUpdate.setString(5, this.poblacion);
            sentenciaUpdate.setString(6, this.provincia);
            sentenciaUpdate.setInt(7, this.tlf);
            sentenciaUpdate.setInt(8, this.fax);
            sentenciaUpdate.setString(9, this.mail);
            sentenciaUpdate.setInt(10, this.id);
            
            sentenciaUpdate.executeUpdate();
            Conexion.getInstancia().commit();
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateOrCreate(){
        if(id>0){
            updateCliente();
        }
        else{
            insertCliente();
        }
    }
    
    public static ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> list=new ArrayList<>();
        
        
        try {
            String sql="SELECT ID,NIF,NOMBRE,DIRECCION,POBLACION,PROVINCIA,CODIGO_POSTAL,TELEFONO,FAX,E_MAIL"
                    + " FROM CLIENTES";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                while(rs.next()){
                    list.add(
                            new Cliente(
                                    rs.getInt("ID"),
                                    rs.getString("NIF"),
                                    rs.getString("NOMBRE"),
                                    rs.getString("DIRECCION"),
                                    rs.getString("POBLACION"),
                                    rs.getString("PROVINCIA"),
                                    rs.getInt("CODIGO_POSTAL"),
                                    rs.getInt("TELEFONO"),
                                    rs.getInt("FAX"),
                                    rs.getString("E_MAIL")
                            )
                    );
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getID() {
        return id;
    }
    
}
