/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import javax.swing.JOptionPane;

/**
 *
 * @author diegu
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        BtnRealizarCadastro = new javax.swing.JButton();
        BtnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setMaximumSize(new java.awt.Dimension(798, 620));
        setMinimumSize(new java.awt.Dimension(798, 620));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(798, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 360, 40));

        txtLogin.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 360, 40));

        BtnRealizarCadastro.setBackground(new java.awt.Color(102, 153, 255));
        BtnRealizarCadastro.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        BtnRealizarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        BtnRealizarCadastro.setBorder(null);
        BtnRealizarCadastro.setContentAreaFilled(false);
        BtnRealizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 150, 20));

        BtnEntrar.setBackground(new java.awt.Color(102, 153, 255));
        BtnEntrar.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        BtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEntrar.setBorder(null);
        BtnEntrar.setContentAreaFilled(false);
        BtnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 250, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Quadrado para tampar.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealizarCadastroActionPerformed

        
        
    }//GEN-LAST:event_BtnRealizarCadastroActionPerformed

    public boolean checkLogin(String login, String senha){
        return login.equals("Diego") && senha.equals("123");
    }
    
    public boolean checkLogin1(String login, String senha){
        return login.equals("Carol") && senha.equals("123");
    }
    
    public boolean checkLogin2(String login, String senha){
        return login.equals("Leonardo") && senha.equals("123");
    }
    
    public boolean checkLogin3(String login, String senha){
        return login.equals("Arthur") && senha.equals("123");
    }
    
    public boolean checkLogin4(String login, String senha){
        return login.equals("Vinicius") && senha.equals("123");
    }
    
    public boolean checkLogin5(String login, String senha){
        return login.equals("Bruno") && senha.equals("123");
    }
    
    public boolean checkLogin6(String login, String senha){
        return login.equals("Gustavo") && senha.equals("123");
    }
    
    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        
        if(this.checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))){
            JOptionPane.showMessageDialog(null, "Bem vindo Diego!");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            this.dispose();
            telaPrincipal.setVisible(true);

        }else if((this.checkLogin1(txtLogin.getText(), new String(txtSenha.getPassword())))){
            JOptionPane.showMessageDialog(null, "Bem vinda Carol!");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            this.dispose();
            telaPrincipal.setVisible(true);
        
        }else if((this.checkLogin2(txtLogin.getText(), new String(txtSenha.getPassword())))){
            JOptionPane.showMessageDialog(null, "Bem vindo Leonardo!");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            this.dispose();
            telaPrincipal.setVisible(true);
            
        }else if((this.checkLogin3(txtLogin.getText(), new String(txtSenha.getPassword())))){
            JOptionPane.showMessageDialog(null, "Bem vindo Arthur!");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            this.dispose();
            telaPrincipal.setVisible(true);
            
        }else if((this.checkLogin4(txtLogin.getText(), new String(txtSenha.getPassword())))){
            JOptionPane.showMessageDialog(null, "Bem vindo Vinicius!");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            this.dispose();
            telaPrincipal.setVisible(true);
            
        }else if((this.checkLogin5(txtLogin.getText(), new String(txtSenha.getPassword())))){
            JOptionPane.showMessageDialog(null, "Bem vindo Bruno!");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            this.dispose();
            telaPrincipal.setVisible(true);
            
        }else if((this.checkLogin6(txtLogin.getText(), new String(txtSenha.getPassword())))){
            JOptionPane.showMessageDialog(null, "Bem vindo Gustavo!");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            this.dispose();
            telaPrincipal.setVisible(true);
        
        }else{
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        }
    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JButton BtnRealizarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
