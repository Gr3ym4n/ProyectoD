/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARN
 */
public class FormEmpresa extends javax.swing.JFrame {
    Empresa empresa=null;
    static FormEmpresa instancia=null;
    /**
     * Creates new form Empresa
     */
    public FormEmpresa() {
        initComponents();
        this.empresa=new Empresa();
        this.rellenarFormulario();
    }
    public static FormEmpresa getInstancia(){
        if(instancia==null){
            instancia=new FormEmpresa();
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

        lblNIF = new javax.swing.JLabel();
        lblNOMBRE = new javax.swing.JLabel();
        lblPERSONA = new javax.swing.JLabel();
        lblDIRECCION = new javax.swing.JLabel();
        lblCP = new javax.swing.JLabel();
        lblPOBLACION = new javax.swing.JLabel();
        lblPROVINCIA = new javax.swing.JLabel();
        lblTELEFONO = new javax.swing.JLabel();
        lblFAX = new javax.swing.JLabel();
        lblMAIL = new javax.swing.JLabel();
        txtNIFCIF = new javax.swing.JTextField();
        txtNOMBRE = new javax.swing.JTextField();
        txtPERSONA = new javax.swing.JTextField();
        txtDIRECCION = new javax.swing.JTextField();
        txtCODIGOPOSTAL = new javax.swing.JTextField();
        txtPOBLACION = new javax.swing.JTextField();
        txtPROVINCIA = new javax.swing.JTextField();
        txtTELEFONO = new javax.swing.JTextField();
        txtFAX = new javax.swing.JTextField();
        txtMAIL = new javax.swing.JTextField();
        btnACTUALIZAR = new javax.swing.JButton();
        btnRESET = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNIF.setText("NIF/CIF");

        lblNOMBRE.setText("NOMBRE");

        lblPERSONA.setText("PERSONA FISICA");

        lblDIRECCION.setText("DIRECCION");

        lblCP.setText("CODIGO POSTAL");

        lblPOBLACION.setText("POBLACION");

        lblPROVINCIA.setText("PROVINCIA");

        lblTELEFONO.setText("TELEFONO");

        lblFAX.setText("FAX");

        lblMAIL.setText("E-MAIL");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCODIGOPOSTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPOBLACION)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPOBLACION, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDIRECCION)
                        .addGap(37, 37, 37)
                        .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPROVINCIA)
                        .addGap(36, 36, 36)
                        .addComponent(txtPROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTELEFONO)
                        .addGap(40, 40, 40)
                        .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFAX)
                        .addGap(73, 73, 73)
                        .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblNOMBRE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPERSONA)
                                .addComponent(lblNIF))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNIFCIF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPERSONA, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnACTUALIZAR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblMAIL)
                            .addGap(58, 58, 58)
                            .addComponent(txtMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNIF)
                    .addComponent(txtNIFCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNOMBRE)
                    .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPERSONA)
                    .addComponent(txtPERSONA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDIRECCION)
                    .addComponent(txtDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCP)
                    .addComponent(lblPOBLACION)
                    .addComponent(txtCODIGOPOSTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPOBLACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPROVINCIA)
                    .addComponent(txtPROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTELEFONO)
                    .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFAX)
                    .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMAIL))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnACTUALIZAR)
                    .addComponent(btnRESET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void actualizarObjetos(){
        empresa.setCp(Integer.parseInt(this.txtCODIGOPOSTAL.getText()));
        empresa.setDireccion(this.txtDIRECCION.getText());
        empresa.setFax(Integer.parseInt(this.txtFAX.getText()));
        empresa.setMail(this.txtMAIL.getText());
        empresa.setNif(this.txtNIFCIF.getText());
        empresa.setNombre(this.txtNOMBRE.getText());
        empresa.setPersona(this.txtPERSONA.getText());
        empresa.setPoblacion(this.txtPOBLACION.getText());
        empresa.setProvincia(this.txtPROVINCIA.getText());
        empresa.setTlf(Integer.parseInt(this.txtTELEFONO.getText()));
    }
    private void btnACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACTUALIZARActionPerformed
        // TODO add your handling code here:
        
        actualizarObjetos();
        
        this.empresa.updateEmpresa();
    }//GEN-LAST:event_btnACTUALIZARActionPerformed

    private void btnRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESETActionPerformed
        // TODO add your handling code here:
        this.empresa=new Empresa();
        this.rellenarFormulario();
    }//GEN-LAST:event_btnRESETActionPerformed
    private void rellenarFormulario(){
        txtCODIGOPOSTAL.setText(evitarNull(empresa.getCp()+""));
        txtDIRECCION.setText(evitarNull(empresa.getDireccion()+""));
        txtFAX.setText(evitarNull(empresa.getFax()+""));
        txtMAIL.setText(evitarNull(empresa.getMail()+""));
        txtNIFCIF.setText(evitarNull(empresa.getNif()+""));
        txtNOMBRE.setText(evitarNull(empresa.getNombre()+""));
        txtPERSONA.setText(evitarNull(empresa.getPersona()+""));
        txtPOBLACION.setText(evitarNull(empresa.getPoblacion()+""));
        txtPROVINCIA.setText(evitarNull(empresa.getProvincia()+""));
        txtTELEFONO.setText(evitarNull(empresa.getTlf()+""));
    }
    private String evitarNull(String n){
        
        if(n.equals("null")){
            return "";
        }
        else{
            return n;
        }
    }
    private void borrarFormulario(){
        txtCODIGOPOSTAL.setText("");
        txtDIRECCION.setText("");
        txtFAX.setText("");
        txtMAIL.setText("");
        txtNIFCIF.setText("");
        txtNOMBRE.setText("");
        txtPERSONA.setText("");
        txtPOBLACION.setText("");
        txtPROVINCIA.setText("");
        txtTELEFONO.setText("");
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
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTUALIZAR;
    private javax.swing.JButton btnRESET;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblDIRECCION;
    private javax.swing.JLabel lblFAX;
    private javax.swing.JLabel lblMAIL;
    private javax.swing.JLabel lblNIF;
    private javax.swing.JLabel lblNOMBRE;
    private javax.swing.JLabel lblPERSONA;
    private javax.swing.JLabel lblPOBLACION;
    private javax.swing.JLabel lblPROVINCIA;
    private javax.swing.JLabel lblTELEFONO;
    private javax.swing.JTextField txtCODIGOPOSTAL;
    private javax.swing.JTextField txtDIRECCION;
    private javax.swing.JTextField txtFAX;
    private javax.swing.JTextField txtMAIL;
    private javax.swing.JTextField txtNIFCIF;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtPERSONA;
    private javax.swing.JTextField txtPOBLACION;
    private javax.swing.JTextField txtPROVINCIA;
    private javax.swing.JTextField txtTELEFONO;
    // End of variables declaration//GEN-END:variables
}
