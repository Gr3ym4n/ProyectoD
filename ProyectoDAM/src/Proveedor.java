

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
public class Proveedor {
    private int cp, tlf, fax,id=-1;
    private String cif,nombre,persona,direccion,poblacion,provincia,mail;

    public Proveedor() {
    }

    public Proveedor(int id, String cif, String nombre, String direccion, String poblacion, String provincia, int cp, String persona, int tlf, int fax, String mail) {
        this.id=id;
        this.cp = cp;
        this.tlf = tlf;
        this.fax = fax;
        this.cif = cif;
        this.nombre = nombre;
        this.persona = persona;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public static ArrayList<Proveedor> getProveedores(){
        ArrayList<Proveedor> listProv=new ArrayList<>();
        
        
        try {
            String sql="SELECT ID,CIF,NOMBRE,DIRECCION,POBLACION,PROVINCIA,CODIGO_POSTAL,PERSONA_CONTACTO,TELEFONO,FAX,E_MAIL"
                    + " FROM PROVEEDOR";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                while(rs.next()){
                    listProv.add(
                            new Proveedor(
                                    rs.getInt("ID"),
                                    rs.getString("CIF"),
                                    rs.getString("NOMBRE"),
                                    rs.getString("DIRECCION"),
                                    rs.getString("POBLACION"),
                                    rs.getString("PROVINCIA"),
                                    rs.getInt("CODIGO_POSTAL"),
                                    rs.getString("PERSONA_CONTACTO"),
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
        return listProv;
    }
    
    public void getDataProveedor(String nombre){//BUSCAR
        try {
            String sql="SELECT ID,CIF,NOMBRE,DIRECCION,POBLACION,PROVINCIA,CODIGO_POSTAL,PERSONA_CONTACTO,TELEFONO,FAX,E_MAIL"
                    + " FROM PROVEEDOR WHERE NOMBRE=?";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            query.setString(1, nombre);
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                rs.next();
                this.id=rs.getInt("ID");
                this.cp = rs.getInt("CODIGO_POSTAL");
                this.tlf = rs.getInt("TELEFONO");
                this.fax = rs.getInt("FAX");
                this.cif = rs.getString("CIF");
                this.nombre = rs.getString("NOMBRE");
                this.persona = rs.getString("PERSONA_CONTACTO");
                this.direccion = rs.getString("DIRECCION");
                this.poblacion = rs.getString("POBLACION");
                this.provincia = rs.getString("PROVINCIA");
                this.mail = rs.getString("E_MAIL");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateOrCreate(){
        if(id>0){
            updateProveedor();
        }
        else{
            insertProveedor();
        }
    }
    public void borrarProveedor(){//BORRAR
        if(this.id>0){
            try {
                String sql="DELETE FROM PROVEEDOR WHERE ID=?";

                PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);

                query.setInt(1, this.id);

                query.executeUpdate();
                Conexion.getInstancia().commit();

            } catch (SQLException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
                    JOptionPane.showMessageDialog(null,  "No hay datos a borrar. Busque un proveedor primero.");
        }
    }
    public void insertProveedor(){//ANIADIR
        try {
            String sql="INSERT INTO PROVEEDOR(CIF,NOMBRE,PERSONA_CONTACTO,"
                    + "DIRECCION,CODIGO_POSTAL,POBLACION,PROVINCIA,TELEFONO,FAX,E_MAIL) VALUES (?,?,?,"
                    + "?,?,?,?,?,?,?)";
            
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            query.setString(1, this.cif);
            query.setString(2, this.nombre);
            query.setString(3, this.persona);
            query.setString(4, this.direccion);
            query.setInt(5, this.cp);
            query.setString(6, this.poblacion);
            query.setString(7, this.provincia);
            query.setInt(8, this.tlf);
            query.setInt(9, this.fax);
            query.setString(10, this.mail);
            
            query.executeUpdate();
            Conexion.getInstancia().commit();
            
            this.getDataProveedor(this.nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateProveedor(){//ACTUALIZAR
        try {
            String sql="UPDATE PROVEEDOR SET CIF=?,NOMBRE=?,PERSONA_CONTACTO=?,"
                    + "DIRECCION=?,CODIGO_POSTAL=?,POBLACION=?,PROVINCIA=?,TELEFONO=?,FAX=?,E_MAIL=? WHERE ID=?";
            
            PreparedStatement sentenciaUpdate=Conexion.getInstancia().prepareStatement(sql);
            
            sentenciaUpdate.setString(1, this.cif);
            sentenciaUpdate.setString(2, this.nombre);
            sentenciaUpdate.setString(3, this.persona);
            sentenciaUpdate.setString(4, this.direccion);
            sentenciaUpdate.setInt(5, this.cp);
            sentenciaUpdate.setString(6, this.poblacion);
            sentenciaUpdate.setString(7, this.provincia);
            sentenciaUpdate.setInt(8, this.tlf);
            sentenciaUpdate.setInt(9, this.fax);
            sentenciaUpdate.setString(10, this.mail);
            sentenciaUpdate.setInt(11, this.id);
            
            int nfilas=sentenciaUpdate.executeUpdate();
            System.out.println("filas "+nfilas);
            
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getDireccion() {
        return direccion;
    }
    public int getID(){
        return id;
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
    
}
