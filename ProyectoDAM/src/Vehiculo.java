/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ARN
 */
public class Vehiculo {
    
    private int kilometros,id=-1;
    private String matricula,marca,modelo,bastidor,observaciones;

    public Vehiculo() {
    }

    public Vehiculo(int id,String matricula, String marca, String modelo) {
        this.id=id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    public static ArrayList<Vehiculo> getVehiculos(int idCli){
        ArrayList<Vehiculo> listVehi=new ArrayList<>();
        
        
        try {
            String sql="SELECT VEHICULOS.ID,VEHICULOS.MATRICULA,VEHICULOS.MARCA,VEHICULOS.MODELO,"
                    + " VEHICULOS.BASTIDOR,VEHICULOS.KILOMETROS,VEHICULOS.OBSERVACIONES"
                    + " FROM VEHICULOS INNER JOIN CLI_VEHI ON CLI_VEHI.ID_VEHI=VEHICULOS.ID WHERE CLI_VEHI.ID_CLI=? ";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            query.setInt(1, idCli);
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                while(rs.next()){
                    listVehi.add(
                            new Vehiculo(
                                    rs.getInt("ID"),
                                    rs.getString("MATRICULA"),
                                    rs.getString("MARCA"),
                                    rs.getString("MODELO")
                            )
                    );
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listVehi;
    }
    public static ArrayList<Vehiculo> getVehiculos(){
        ArrayList<Vehiculo> listVehi=new ArrayList<>();
        
        
        try {
            String sql="SELECT ID,MATRICULA,MARCA,MODELO,"
                    + " BASTIDOR,KILOMETROS,OBSERVACIONES"
                    + " FROM VEHICULOS";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                while(rs.next()){
                    listVehi.add(
                            new Vehiculo(
                                    rs.getInt("ID"),
                                    rs.getString("MATRICULA"),
                                    rs.getString("MARCA"),
                                    rs.getString("MODELO")
                            )
                    );
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listVehi;
    }
    public void getDataVehiculo(String matricula){//BUSCAR
        try {
            String sql="SELECT ID,MATRICULA,MARCA,MODELO,"
                    + " BASTIDOR,KILOMETROS,OBSERVACIONES"
                    + " FROM VEHICULOS WHERE MATRICULA=?";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            query.setString(1, matricula);
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                rs.next();
                this.id=rs.getInt("ID");
                this.matricula = rs.getString("MATRICULA");
                this.marca = rs.getString("MARCA");
                this.modelo = rs.getString("MODELO");
                this.bastidor = rs.getString("BASTIDOR");
                this.kilometros = rs.getInt("KILOMETROS");
                this.observaciones = rs.getString("OBSERVACIONES");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateOrCreate(){
        if(id>0){
            updateVehiculo();
        }
        else{
            insertVehiculo();
        }
    }
    public void borrarVehiculo(){//BORRAR
        if(this.id>0){
            try {
                String sql="DELETE FROM VEHICULOS WHERE ID=?";

                PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);

                query.setInt(1, this.id);

                query.execute();

            } catch (SQLException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
                    JOptionPane.showMessageDialog(null,  "No hay datos a borrar. Busque un vehiculo primero.");
        }
    }
    public void asociarCliente(int idCli){
        try { 
            String sql="INSERT INTO CLI_VEHI(ID_CLI,ID_VEHI) VALUES (?,?)";
            
            
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            query.setInt(1, idCli);
            query.setInt(2, this.id);
            System.out.println("idCli"+ idCli + " idveh" + this.id);
            query.executeUpdate();
            Conexion.getInstancia().commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void insertVehiculo(){//ANIADIR
        try {
            String sql="INSERT INTO VEHICULOS(MATRICULA,MARCA,MODELO,"
                    + "BASTIDOR,KILOMETROS,OBSERVACIONES) VALUES (?,?,?,"
                    + "?,?,?)";
            
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            query.setString(1, this.matricula);
            query.setString(2, this.marca);
            query.setString(3, this.modelo);
            query.setString(4, this.bastidor);
            query.setInt(5, this.kilometros);
            query.setString(6, this.observaciones);
            
            query.executeUpdate();
            Conexion.getInstancia().commit();
            this.getDataVehiculo(this.matricula);
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateVehiculo(){//ACTUALIZAR
        try {
            String sql="UPDATE VEHICULOS SET MATRICULA=?,MARCA=?,MODELO=?,"
                    + "BASTIDOR=?,KILOMETROS=?,OBSERVACIONES=? WHERE ID=?";
            
            PreparedStatement sentenciaUpdate=Conexion.getInstancia().prepareStatement(sql);
            
            sentenciaUpdate.setString(1, this.matricula);
            sentenciaUpdate.setString(2, this.marca);
            sentenciaUpdate.setString(3, this.modelo);
            sentenciaUpdate.setString(4, this.bastidor);
            sentenciaUpdate.setInt(5, this.kilometros);
            sentenciaUpdate.setString(6, this.observaciones);
            
            sentenciaUpdate.setInt(7, this.id);
            
            sentenciaUpdate.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public int getID(){
        return id;
    }
    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
