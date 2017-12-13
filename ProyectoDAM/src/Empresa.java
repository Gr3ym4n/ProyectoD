
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARN
 */
public class Empresa {
    private int cp, tlf, fax;
    private String nif,nombre,persona,direccion,poblacion,provincia,mail;

    public Empresa() {
        getDataEmpresa();
        //int cp, int tlf, int fax, String nif, String nombre, String persona, String direccion, String poblacion, String provincia, String mail7
        /*this.cp = cp;
        this.tlf = tlf;
        this.fax = fax;
        this.nif = nif;
        this.nombre = nombre;
        this.persona = persona;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.mail = mail;*/
    }
    private void getDataEmpresa(){
        try {
            String sql="SELECT CIF,NOMBRE,PERSONA_FISICA,DIRECCION,CODIGO_POSTAL,POBLACION,PROVINCIA,TELEFONO,FAX,E_MAIL"
                    + " FROM EMPRESA";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                rs.next();
                this.cp = rs.getInt("CODIGO_POSTAL");
                this.tlf = rs.getInt("TELEFONO");
                this.fax = rs.getInt("FAX");
                this.nif = rs.getString("CIF");
                this.nombre = rs.getString("NOMBRE");
                this.persona = rs.getString("PERSONA_FISICA");
                this.direccion = rs.getString("DIRECCION");
                this.poblacion = rs.getString("POBLACION");
                this.provincia = rs.getString("PROVINCIA");
                this.mail = rs.getString("E_MAIL");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateEmpresa(){
        try {
            String sql="UPDATE EMPRESA SET CIF=?,NOMBRE=?,PERSONA_FISICA=?,"
                    + "DIRECCION=?,CODIGO_POSTAL=?,POBLACION=?,PROVINCIA=?,TELEFONO=?,FAX=?,E_MAIL=? WHERE CIF=?";
            
            PreparedStatement sentenciaUpdate=Conexion.getInstancia().prepareStatement(sql);
            
            sentenciaUpdate.setString(1, this.nif);
            sentenciaUpdate.setString(2, this.nombre);
            sentenciaUpdate.setString(3, this.persona);
            sentenciaUpdate.setString(4, this.direccion);
            sentenciaUpdate.setInt(5, this.cp);
            sentenciaUpdate.setString(6, this.poblacion);
            sentenciaUpdate.setString(7, this.provincia);
            sentenciaUpdate.setInt(8, this.tlf);
            sentenciaUpdate.setInt(9, this.fax);
            sentenciaUpdate.setString(10, this.mail);
            sentenciaUpdate.setString(11, this.nif);
            sentenciaUpdate.executeUpdate();
            Conexion.getInstancia().commit();
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

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
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
    
    
}
