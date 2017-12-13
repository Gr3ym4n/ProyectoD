
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
public class FormInventario extends javax.swing.JFrame {
    Inventario inventario=null;
    static FormInventario instancia=null;
    /**
     * Creates new form FormInventario
     */
    public FormInventario() {
        initComponents();
        this.inventario=new Inventario();
        loadComboProveedores();
    }

    
    public static FormInventario getInstancia(){
        if(instancia==null){
            instancia=new FormInventario();
        }
        instancia.borrarFormulario();
        return instancia;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtREFERENCIA = new javax.swing.JTextField();
        btnRESET = new javax.swing.JButton();
        lblNIF = new javax.swing.JLabel();
        txtDESCRIPCION = new javax.swing.JTextField();
        lblNOMBRE = new javax.swing.JLabel();
        txtMARCA = new javax.swing.JTextField();
        lblPERSONA = new javax.swing.JLabel();
        txtCANTIDAD = new javax.swing.JTextField();
        lblDIRECCION = new javax.swing.JLabel();
        txtPRECIO = new javax.swing.JTextField();
        lblCP = new javax.swing.JLabel();
        txtDESCUENTO = new javax.swing.JTextField();
        lblPROVINCIA = new javax.swing.JLabel();
        btnACTUALIZAR = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblTELEFONO = new javax.swing.JLabel();
        btnAÑADIRPROV = new javax.swing.JButton();
        txtREFPROV = new javax.swing.JTextField();
        lblMAIL = new javax.swing.JLabel();
        txtPRECIOCOMPRA = new javax.swing.JTextField();
        lblMAIL1 = new javax.swing.JLabel();
        cbProveedor = new javax.swing.JComboBox<>();
        btnBUSCAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnRESET.setText("RESET");
        btnRESET.setMaximumSize(new java.awt.Dimension(95, 23));
        btnRESET.setMinimumSize(new java.awt.Dimension(95, 23));
        btnRESET.setPreferredSize(new java.awt.Dimension(95, 23));
        btnRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESETActionPerformed(evt);
            }
        });

        lblNIF.setText("REFERENCIA");

        lblNOMBRE.setText("DESCRIPCION");

        lblPERSONA.setText("MARCA");

        lblDIRECCION.setText("CANTIDAD");

        lblCP.setText("PRECIO");

        lblPROVINCIA.setText("DESCUENTO");

        btnACTUALIZAR.setText("ACTUALIZAR");
        btnACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACTUALIZARActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTELEFONO.setText("PROVEEDOR");

        btnAÑADIRPROV.setText("AÑADIR PROVEEDOR");
        btnAÑADIRPROV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAÑADIRPROVActionPerformed(evt);
            }
        });

        lblMAIL.setText("REF. PROV");

        lblMAIL1.setText("PRECIO COMPRA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMAIL)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTELEFONO)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtREFPROV, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(cbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(btnAÑADIRPROV))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMAIL1)
                        .addGap(8, 8, 8)
                        .addComponent(txtPRECIOCOMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTELEFONO)
                    .addComponent(btnAÑADIRPROV)
                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMAIL)
                    .addComponent(txtREFPROV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPRECIOCOMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMAIL1))
                .addGap(48, 48, 48))
        );

        btnBUSCAR.setText("BUSCAR");
        btnBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBUSCARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPERSONA)
                            .addComponent(lblNIF)
                            .addComponent(lblNOMBRE)
                            .addComponent(lblDIRECCION)
                            .addComponent(lblCP)
                            .addComponent(lblPROVINCIA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtREFERENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDESCUENTO)
                                    .addComponent(txtCANTIDAD)
                                    .addComponent(txtPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnACTUALIZAR)
                        .addGap(6, 6, 6)
                        .addComponent(btnBUSCAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNIF)
                    .addComponent(txtREFERENCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNOMBRE)
                    .addComponent(txtDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPERSONA)
                    .addComponent(txtMARCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDIRECCION)
                    .addComponent(txtCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCP)
                    .addComponent(txtPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPROVINCIA)
                    .addComponent(txtDESCUENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnACTUALIZAR)
                    .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBUSCAR))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAÑADIRPROVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAÑADIRPROVActionPerformed
        // TODO add your handling code here:
       FormProveedor newProv=new FormProveedor();
       newProv.setVisible(true);
       loadComboProveedores();
    }//GEN-LAST:event_btnAÑADIRPROVActionPerformed
                    
    private void rellenarFormulario(){        
        txtCANTIDAD.setText(inventario.getCantidad()+"");
        txtDESCRIPCION.setText(inventario.getDescripcion()+"");
        txtMARCA.setText(inventario.getMarca()+"");
        txtDESCUENTO.setText(inventario.getDescuento()+"");
        txtPRECIO.setText(inventario.getPrecio_venta()+"");
        txtPRECIOCOMPRA.setText(inventario.getPrecio_compra()+"");
        txtREFERENCIA.setText(inventario.getReferencia()+"");
        txtREFPROV.setText(inventario.getRef_prov()+"");
        loadComboProveedores();
    }
    private void borrarFormulario(){
        txtCANTIDAD.setText(inventario.getCantidad()+"");
        txtDESCRIPCION.setText("");
        txtMARCA.setText("");
        txtDESCUENTO.setText("");
        txtPRECIO.setText("");
        txtPRECIOCOMPRA.setText("");
        txtREFERENCIA.setText("");
        txtREFPROV.setText("");
        cbProveedor.setSelectedIndex(0);
    }
    private void actualizarObjetos(){
        inventario.setCantidad(Double.parseDouble(txtCANTIDAD.getText()));
        inventario.setDescripcion(txtDESCRIPCION.getText());
        inventario.setDescuento(Double.parseDouble(txtDESCUENTO.getText()));
        inventario.setId_prov(((Proveedor)cbProveedor.getSelectedItem()).getID());
        inventario.setMarca(txtMARCA.getText());
        inventario.setPrecio_compra(Double.parseDouble(txtPRECIOCOMPRA.getText()));
        inventario.setPrecio_venta(Double.parseDouble(txtPRECIO.getText()));
        inventario.setRef_prov(txtREFPROV.getText());
        inventario.setReferencia(txtREFERENCIA.getText());
    }
    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        // TODO add your handling code here:
        this.inventario=new Inventario();
        this.rellenarFormulario();        
    }//GEN-LAST:event_btnRESETActionPerformed

    private void btnACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACTUALIZARActionPerformed
        // TODO add your handling code here:
        actualizarObjetos();
        this.inventario.updateOrCreate();
    }//GEN-LAST:event_btnACTUALIZARActionPerformed

    private void btnBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBUSCARActionPerformed
        // TODO add your handling code here:
        this.inventario.getDataInventario(txtREFERENCIA.getText());
        rellenarFormulario();
    }//GEN-LAST:event_btnBUSCARActionPerformed
    private void loadComboProveedores(){
        ArrayList<Proveedor> listProv=Proveedor.getProveedores();
        cbProveedor.setModel(new DefaultComboBoxModel(listProv.toArray()));
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
            java.util.logging.Logger.getLogger(FormInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTUALIZAR;
    private javax.swing.JButton btnAÑADIRPROV;
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnRESET;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblDIRECCION;
    private javax.swing.JLabel lblMAIL;
    private javax.swing.JLabel lblMAIL1;
    private javax.swing.JLabel lblNIF;
    private javax.swing.JLabel lblNOMBRE;
    private javax.swing.JLabel lblPERSONA;
    private javax.swing.JLabel lblPROVINCIA;
    private javax.swing.JLabel lblTELEFONO;
    private javax.swing.JTextField txtCANTIDAD;
    private javax.swing.JTextField txtDESCRIPCION;
    private javax.swing.JTextField txtDESCUENTO;
    private javax.swing.JTextField txtMARCA;
    private javax.swing.JTextField txtPRECIO;
    private javax.swing.JTextField txtPRECIOCOMPRA;
    private javax.swing.JTextField txtREFERENCIA;
    private javax.swing.JTextField txtREFPROV;
    // End of variables declaration//GEN-END:variables
}