/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sem3miniproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JPanel;

/**
 *
 * @author shigvan
 */
public class PAGE12 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame3
     */
    public PAGE12() {
        initComponents();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "purv@&soh@m9222");
            String username = jLabel2.getText();

            if (username.length() > 0) {
                String personalSql = "select * from personal where username = '" + username + "'";
                String educationSql = "select * from education where username = '" + username + "'";
                String sipSql = "select * from sip where username = '" + username + "'";
                 String wecSql = "select * from wec where username = '" + username + "'";

                Statement personalStm = conn.createStatement();
                Statement educationStm = conn.createStatement();
                Statement sipStm = conn.createStatement();
                 Statement wecStm = conn.createStatement();

                java.sql.ResultSet personalRs = personalStm.executeQuery(personalSql);
                java.sql.ResultSet educationRs = educationStm.executeQuery(educationSql);
                java.sql.ResultSet sipRs = sipStm.executeQuery(sipSql);
                java.sql.ResultSet wecRs = wecStm.executeQuery(wecSql);

                if (personalRs.next()) {
                    String email = personalRs.getString(3);
                    jLabel3.setText(email);
                    String contact = personalRs.getString(4);
                    jLabel4.setText(contact);
                    String country = personalRs.getString(5);
                    jLabel5.setText(country);
                    String links = personalRs.getString(7);
                    jLabel6.setText(links);
                    String summary = personalRs.getString(8);
                    jTextArea4.setText(summary);
                    
                }

                if (educationRs.next()) {
                    String school = educationRs.getString(2);
                    jLabel16.setText(school);
                    String degree = educationRs.getString(4);
                    jLabel13.setText(degree);
                    String year = educationRs.getString(4);
                    jLabel17.setText(year);
                    
                } 
                
                if (wecRs.next()) {
                    String certificate = wecRs.getString(4);
                    jTextArea3.setText(certificate);
                    
                } 
                
                if (sipRs.next()) {
                        String projects = sipRs.getString(4);
                        jTextArea2.setText(projects);
                        String skills = sipRs.getString(2);
                        jTextArea1.setText(skills);
                    } 
                else {
                        javax.swing.JOptionPane.showMessageDialog(this, "No projects data found.");
                    }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("jLabel13");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 350, 20));

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 150, 20));

        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 150, 20));

        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 120, 20));

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 150, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("soham shigvan");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 440, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel15.setText("jLabel13");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 350, 30));

        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 350, 20));

        jTextArea1.setBackground(new java.awt.Color(235, 229, 212));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 690, 160));

        jScrollPane2.setBackground(new java.awt.Color(235, 229, 212));

        jTextArea2.setBackground(new java.awt.Color(235, 229, 212));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 700, 130));

        jTextArea3.setBackground(new java.awt.Color(235, 229, 212));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 340, 200));

        jLabel17.setText("jLabel13");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 20));

        jTextArea4.setBackground(new java.awt.Color(235, 229, 212));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextArea4ComponentShown(evt);
            }
        });
        jScrollPane4.setViewportView(jTextArea4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 330, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sem3miniproject/RESUME (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 750, 830));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 810));

        jLabel2.setText("Ayush23");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Print");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 80, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 80, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("click here to preview your resume let's go");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 450, 50));

        jButton1.setText("PREVIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "purv@&soh@m9222");
            String username = jLabel2.getText();

            if (username.length() > 0) {
                String personalSql = "select * from personal where username = '" + username + "'";
                String educationSql = "select * from education where username = '" + username + "'";
                String sipSql = "select * from sip where username = '" + username + "'";
                String wecSql = "select * from wec where username = '" + username + "'";

                Statement personalStm = conn.createStatement();
                Statement educationStm = conn.createStatement();
                Statement sipStm = conn.createStatement();
                Statement wecStm = conn.createStatement();

                java.sql.ResultSet personalRs = personalStm.executeQuery(personalSql);
                java.sql.ResultSet educationRs = educationStm.executeQuery(educationSql);
                java.sql.ResultSet sipRs = sipStm.executeQuery(sipSql);
                java.sql.ResultSet wecRs = wecStm.executeQuery(wecSql);

                if (personalRs.next()) {
                    String fullname = personalRs.getString(3);
                    jLabel12.setText(fullname);
                    String jobp = personalRs.getString(2);
                    jLabel15.setText(jobp);
                    String email = personalRs.getString(4);
                    jLabel3.setText(email);
                    String contact = personalRs.getString(5);
                    jLabel4.setText(contact);
                    String country = personalRs.getString(6);
                    jLabel5.setText(country);
                    String links = personalRs.getString(8);
                    jLabel6.setText(links);
                    String summary = personalRs.getString(9);
                    jTextArea2.setText(summary);

                }

                if (educationRs.next()) {
                    String school = educationRs.getString(2);
                    jLabel16.setText(school);
                    String year = educationRs.getString(3);
                    jLabel13.setText(year);
                    String degree = educationRs.getString(4);
                    jLabel17.setText(degree);
                   

                }

                if (wecRs.next()) {
                    String certificate = wecRs.getString(4);
                    jTextArea4.setText(certificate);

                }

                if (sipRs.next()) {
                    String projects = sipRs.getString(4);
                    jTextArea1.setText(projects);
                    String skills = sipRs.getString(2);
                    jTextArea3.setText(skills);
                }
                else {
                    javax.swing.JOptionPane.showMessageDialog(this, "No projects data found.");
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PAGE8 PAGE8Frame = new PAGE8();
        String username= jLabel2.getText();
        PAGE8Frame.setVisible(true);
        PAGE8Frame.pack();
        PAGE8Frame.jLabel15.setText(username);
        PAGE8Frame.setLocationRelativeTo(PAGE8Frame);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextArea4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextArea4ComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextArea4ComponentShown

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.80,0.95);

                jPanel2.print(g2);

                return Printable.PAGE_EXISTS;

            }
        });
        boolean ok = job.printDialog();
        if(ok){
            try{

                job.print();
            }
            catch (PrinterException ex){
                ex.printStackTrace();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(PAGE12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAGE12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAGE12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAGE12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAGE12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
