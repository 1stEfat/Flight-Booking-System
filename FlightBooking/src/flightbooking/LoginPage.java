/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flightbooking;

import flightbooking.LogIn;
import flightbooking.MyProvider;

/**
 *
 * @author Ali Ahmed
 */
public class LoginPage extends javax.swing.JFrame {
    public static String x=null;
    public static String y=null;
    MyProvider my = new MyProvider();
    public LoginPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordtext1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernametext1 = new javax.swing.JTextField();
        passwordtext2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SignUpbutton1 = new javax.swing.JButton();
        loginbutton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/vector-3d-illustration-airplane-clouds-600nw-2143367099.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 560));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("X");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), null));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 20, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel3.setText("Welcome!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 120, 20));

        passwordtext1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        passwordtext1.setForeground(new java.awt.Color(51, 51, 51));
        passwordtext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/icons8_Secure_50pxbleee.png"))); // NOI18N
        jPanel1.add(passwordtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 50, 60));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Login");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 60, -1));

        usernametext1.setActionCommand("");
        usernametext1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));
        usernametext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametext1ActionPerformed(evt);
            }
        });
        jPanel1.add(usernametext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 280, -1));

        passwordtext2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 153, 255)));
        passwordtext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtext2ActionPerformed(evt);
            }
        });
        jPanel1.add(passwordtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 280, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/icons8_Account_50pxblue.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 60, 50));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Username:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 130, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 130, 40));

        SignUpbutton1.setBackground(new java.awt.Color(51, 153, 255));
        SignUpbutton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SignUpbutton1.setForeground(new java.awt.Color(255, 255, 255));
        SignUpbutton1.setText("Sign Up");
        SignUpbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 190, 40));

        loginbutton1.setBackground(new java.awt.Color(51, 153, 255));
        loginbutton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginbutton1.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton1.setText("Login");
        loginbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 190, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/icons8_Forgot_Password_50px_4bluuuu.png"))); // NOI18N
        jLabel9.setText("Forgot password?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 170, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 890, 560));

        setSize(new java.awt.Dimension(874, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void passwordtext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtext2ActionPerformed

    private void SignUpbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpbutton1ActionPerformed
        this.setVisible(false);
        new SignUP().setVisible(true);
      
    }//GEN-LAST:event_SignUpbutton1ActionPerformed

    private void loginbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton1ActionPerformed
      String un = usernametext1.getText();
      String ps = passwordtext2.getText();
      LogIn l = new LogIn();
     
     
    if(l.login(un, ps)==true) { 
        this.setVisible(false);
        x=un;
        y=ps;
    }
      
    }//GEN-LAST:event_loginbutton1ActionPerformed

    private void usernametext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametext1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpbutton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbutton1;
    private javax.swing.JLabel passwordtext1;
    private javax.swing.JPasswordField passwordtext2;
    private javax.swing.JTextField usernametext1;
    // End of variables declaration//GEN-END:variables
}
