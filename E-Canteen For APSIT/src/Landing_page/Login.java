/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Landing_page;

/**
 *
 * @author Avadhoot
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1070, 600));
        setMinimumSize(new java.awt.Dimension(1070, 600));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("E-Canteen");
        add(jLabel1);
        jLabel1.setBounds(130, 80, 263, 56);

        jLabel2.setFont(new java.awt.Font("Swis721 Ex BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Welcome");
        add(jLabel2);
        jLabel2.setBounds(160, 120, 200, 44);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Login to E-Canteen");
        add(jLabel3);
        jLabel3.setBounds(180, 160, 165, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Username");
        add(jLabel4);
        jLabel4.setBounds(70, 250, 86, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Password");
        add(jLabel5);
        jLabel5.setBounds(70, 300, 76, 22);
        add(txtUsername);
        txtUsername.setBounds(190, 250, 198, 22);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Login");
        add(jButton1);
        jButton1.setBounds(260, 380, 72, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Forgot Password?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(190, 330, 150, 19);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Don't have an account ?");
        add(jLabel6);
        jLabel6.setBounds(10, 570, 170, 22);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 255));
        jButton3.setText("Signup");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(190, 570, 80, 22);
        add(txtPassword);
        txtPassword.setBounds(190, 300, 198, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/9hsk9w4r.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(540, 0, 540, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}