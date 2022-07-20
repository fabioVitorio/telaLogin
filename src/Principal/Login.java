package Principal;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
   
    }

    //--------------------------------------------------------------------------
    // ------------------------ CÓD QUE CRIA O JFRAME --------------------------
    //--------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUser = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Studio Innovation");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfUser.setForeground(new java.awt.Color(0, 0, 0));
        tfUser.setToolTipText("");
        tfUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        getContentPane().add(tfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 140, -1));

        tfSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(tfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, -1));

        btEntrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/areaLogin.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 520, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    // ------------------------- TEXT FIELD USUARIO ----------------------------
    //--------------------------------------------------------------------------
    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        tfSenha.requestFocus(); // Passar para outro textField com Enter      
    }//GEN-LAST:event_tfUserActionPerformed
    
    //--------------------------------------------------------------------------
    // ----------------------------- BOTÃO ENTRAR ------------------------------
    //--------------------------------------------------------------------------
    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
      
        
        if(tfUser.getText(). equals ("StudioInnovation") && (tfSenha.getText(). equals ("@empresarial"))){
            JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao sistema. \nLogin Efetuado com Sucesso!",
                    "Sistema - INV", JOptionPane.INFORMATION_MESSAGE);
                      
            new TelaPrincipal().setVisible(true); dispose(); //chama TelaPrincipal e fecha a tela Login
                          
            }else{
               JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto!",
                       "Sistema - INV", JOptionPane.ERROR_MESSAGE);          
        } 
    }//GEN-LAST:event_btEntrarActionPerformed

    //--------------------------------------------------------------------------
    // --------------------------- TEXT FIELD SENHA ----------------------------
    //--------------------------------------------------------------------------
    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        btEntrar.requestFocus();// Passar para outro textField com Enter
    }//GEN-LAST:event_tfSenhaActionPerformed

    //--------------------------------------------------------------------------
    // -------------------------- INÍCIO DO PROGRAMA ---------------------------
    //--------------------------------------------------------------------------
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables

 
}
