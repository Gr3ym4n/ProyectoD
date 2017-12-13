
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARN
 */
public class FormVehiculo extends javax.swing.JFrame {
    Vehiculo vehiculo=null;
    static FormVehiculo instancia=null;

    /**
     * Creates new form FormVehiculo
     */
    public FormVehiculo() {
        initComponents();
        this.vehiculo=new Vehiculo();
        loadComboClientes();
    }               
    
    public static FormVehiculo getInstancia(){
        if(instancia==null){
            instancia=new FormVehiculo();
        }
        instancia.borrarFormulario();
        return instancia;
    }
    private void rellenarFormulario(){
        txtBASTIDOR.setText(vehiculo.getBastidor()+"");
        txtKILOMETROS.setText(vehiculo.getKilometros()+"");
        txtMARCA.setText(vehiculo.getMarca()+"");
        txtMODELO.setText(vehiculo.getModelo()+"");
        txtMATRICULA.setText(vehiculo.getMatricula()+"");
        txtOBSERVACIONES.setText(vehiculo.getObservaciones()+"");
    }
    private void borrarFormulario(){
        txtBASTIDOR.setText("");
        txtKILOMETROS.setText("");
        txtMARCA.setText("");
        txtMODELO.setText("");
        txtMATRICULA.setText("");
        txtOBSERVACIONES.setText("");
    }
    private void actualizarObjetos(){
        vehiculo.setKilometros(Integer.parseInt(this.txtKILOMETROS.getText()));
        vehiculo.setBastidor(this.txtBASTIDOR.getText());
        vehiculo.setMarca(this.txtMARCA.getText());
        vehiculo.setModelo(this.txtMODELO.getText());
        vehiculo.setMatricula(this.txtMATRICULA.getText());
        vehiculo.setObservaciones(this.txtOBSERVACIONES.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTELEFONO = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        btnACTUALIZAR = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblMATRICULA = new javax.swing.JLabel();
        txtMATRICULA = new javax.swing.JTextField();
        lblMARCA = new javax.swing.JLabel();
        txtMARCA = new javax.swing.JTextField();
        lblMODELO = new javax.swing.JLabel();
        txtMODELO = new javax.swing.JTextField();
        lblBASTIDOR = new javax.swing.JLabel();
        txtBASTIDOR = new javax.swing.JTextField();
        lblKILOMETROS = new javax.swing.JLabel();
        txtKILOMETROS = new javax.swing.JTextField();
        lblOBSERVACIONES = new javax.swing.JLabel();
        txtOBSERVACIONES = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTELEFONO.setText("CLIENTE");

        btnACTUALIZAR.setText("ACTUALIZAR");
        btnACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACTUALIZARActionPerformed(evt);
            }
        });

        btnRESET.setText("RESET");
        btnRESET.setMaximumSize(new java.awt.Dimension(95, 23));
        btnRESET.setMinimumSize(new java.awt.Dimension(95, 23));
        btnRESET.setPreferredSize(new java.awt.Dimension(95, 23));
        btnRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETActionPerformed(evt);
            }
        });

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblMATRICULA.setText("MATRICULA");

        lblMARCA.setText("MARCA");

        lblMODELO.setText("MODELO");

        lblBASTIDOR.setText("BASTIDOR");

        lblKILOMETROS.setText("KILOMETROS");

        lblOBSERVACIONES.setText("OBSERVACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBASTIDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblKILOMETROS, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                        .addComponent(lblMATRICULA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKILOMETROS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBASTIDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOBSERVACIONES)
                                    .addComponent(lblTELEFONO))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOBSERVACIONES, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(cbCliente, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMATRICULA)
                    .addComponent(txtMATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMARCA)
                    .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMODELO)
                    .addComponent(txtMODELO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBASTIDOR)
                    .addComponent(txtBASTIDOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKILOMETROS)
                    .addComponent(txtKILOMETROS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOBSERVACIONES)
                    .addComponent(txtOBSERVACIONES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTELEFONO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnACTUALIZAR)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACTUALIZARActionPerformed
        actualizarObjetos();

        this.vehiculo.updateOrCreate();
        this.vehiculo.asociarCliente(((Cliente)cbCliente.getSelectedItem()).getID());
    }//GEN-LAST:event_btnACTUALIZARActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        this.vehiculo=new Vehiculo();
        this.rellenarFormulario();
    }//GEN-LAST:event_btnRESETActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.vehiculo.borrarVehiculo();
        this.borrarFormulario();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.vehiculo.getDataVehiculo(txtMATRICULA.getText());
        rellenarFormulario();
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void loadComboClientes(){
        ArrayList<Cliente> listCli=Cliente.getClientes();
        cbCliente.setModel(new DefaultComboBoxModel(listCli.toArray()));
        //cbCliente.setSelectedIndex(-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTUALIZAR;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRESET;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JLabel lblBASTIDOR;
    private javax.swing.JLabel lblKILOMETROS;
    private javax.swing.JLabel lblMARCA;
    private javax.swing.JLabel lblMATRICULA;
    private javax.swing.JLabel lblMODELO;
    private javax.swing.JLabel lblOBSERVACIONES;
    private javax.swing.JLabel lblTELEFONO;
    private javax.swing.JTextField txtBASTIDOR;
    private javax.swing.JTextField txtKILOMETROS;
    private javax.swing.JTextField txtMARCA;
    private javax.swing.JTextField txtMATRICULA;
    private javax.swing.JTextField txtMODELO;
    private javax.swing.JTextField txtOBSERVACIONES;
    // End of variables declaration//GEN-END:variables
}
