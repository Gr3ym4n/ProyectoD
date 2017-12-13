/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author ARN
 */
public class Inventario {
    private int id_prov,id=-1;
    private double cantidad,precio_venta,descuento,precio_compra;
    private String referencia,descripcion,marca,ref_prov;

    public Inventario() {
    }

    public void getDataInventario(String referencia){//BUSCAR
        try {
            String sql="SELECT ID,REFERENCIA,DESCRIPCION,MARCA,"
                    + " CANTIDAD,PRECIO_VENTA,DESCUENTO,"
                    + " ID_PROV,REF_PROV,PRECIO_COMPRA"
                    + " FROM INVENTARIO WHERE REFERENCIA=?";
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            query.setString(1, referencia);
            if(query.execute()){
                ResultSet rs=query.getResultSet();
                rs.next();
                this.id=rs.getInt("ID");
                this.id_prov=rs.getInt("ID_PROV");
                this.precio_venta=rs.getDouble("PRECIO_VENTA");
                this.descuento=rs.getDouble("DESCUENTO");
                this.precio_compra=rs.getDouble("PRECIO_COMPRA");
                this.cantidad=rs.getDouble("CANTIDAD");
                this.referencia = rs.getString("REFERENCIA");
                this.marca = rs.getString("MARCA");
                this.descripcion = rs.getString("DESCRIPCION");
                this.ref_prov = rs.getString("REF_PROV");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void borrarInventario(){//BORRAR
        if(this.id>0){
            try {
                String sql="DELETE FROM INVENTARIO WHERE ID=?";

                PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);

                query.setInt(1, this.id);

                query.execute();

            } catch (SQLException ex) {
                Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,  "No hay datos a borrar. Busque un elemento del inventario primero.");
        }
    }
    public void insertInventario(){//ANIADIR
        System.out.println("Insertando en inventario");
        try {
            String sql="INSERT INTO INVENTARIO(REFERENCIA,DESCRIPCION,MARCA,"
                    + " CANTIDAD,PRECIO_VENTA,DESCUENTO, ID_PROV,REF_PROV,PRECIO_COMPRA) VALUES (?,?,?,"
                    + "?,?,?,?,?,?)";
            
            PreparedStatement query=Conexion.getInstancia().prepareStatement(sql);
            
            query.setString(1, this.referencia);
            query.setString(2, this.descripcion);
            query.setString(3, this.marca);
            query.setDouble(4, this.cantidad);
            query.setDouble(5, this.precio_venta);
            query.setDouble(6, this.descuento);
            query.setInt(7, this.id_prov);
            query.setString(8, this.ref_prov);
            query.setDouble(9, this.precio_compra);
            
            query.executeUpdate();
            Conexion.getInstancia().commit();
            this.getDataInventario(this.referencia);
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateInventario(){//ACTUALIZAR
        try {
            String sql="UPDATE INVENTARIO SET REFERENCIA=?,DESCRIPCION=?,MARCA=?,"
                    + "CANTIDAD=?,PRECIO_VENTA=?,DESCUENTO=?,ID_PROV=?,REF_PROV=?,PRECIO_COMPRA=? WHERE ID=?";
            
            PreparedStatement sentenciaUpdate=Conexion.getInstancia().prepareStatement(sql);            
            
            sentenciaUpdate.setString(1, this.referencia);
            sentenciaUpdate.setString(2, this.descripcion);
            sentenciaUpdate.setString(3, this.marca);
            sentenciaUpdate.setDouble(4, this.cantidad);
            sentenciaUpdate.setDouble(5, this.precio_venta);
            sentenciaUpdate.setDouble(6, this.descuento);
            sentenciaUpdate.setInt(7, this.id_prov);
            sentenciaUpdate.setString(8, this.ref_prov);
            sentenciaUpdate.setDouble(9, this.precio_compra);
            
            sentenciaUpdate.setInt(10, this.id);
            
            sentenciaUpdate.executeUpdate();
            Conexion.getInstancia().commit();
        } catch (SQLException ex) {
            Logger.getLogger(Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void updateOrCreate(){
        if(id>0){
            updateInventario();
        }
        else{
            insertInventario();
        }
    }
    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRef_prov() {
        return ref_prov;
    }

    public void setRef_prov(String ref_prov) {
        this.ref_prov = ref_prov;
    }
    
}
