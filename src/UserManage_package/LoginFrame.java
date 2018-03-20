/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserManage_package;

import javax.swing.JOptionPane;
import main_package.MainJFrame;

/**
 *
 * @author Administrator
 */
public class LoginFrame extends javax.swing.JFrame {
    private UserManager um;
    /**
     * Creates new form MainFrame
     */
    public LoginFrame() {
        um=new UserManager();
        initComponents();
        pwdTextField.setEchoChar((char)0);
        loginButton.requestFocus();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new main_package.ButtonJPanel("src/images/login.jpg");
        loginButton = new javax.swing.JButton();
        regButton = new javax.swing.JButton();
        logIdTextFiled = new javax.swing.JTextField();
        pwdTextField = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("登录");

        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        regButton.setBorderPainted(false);
        regButton.setContentAreaFilled(false);
        regButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });

        logIdTextFiled.setText("请输入账号");
        logIdTextFiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                logIdTextFiledFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                logIdTextFiledFocusLost(evt);
            }
        });

        pwdTextField.setText("请输入密码");
        pwdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(regButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(logIdTextFiled, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(pwdTextField))
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(logIdTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
        String result=um.login(new User(logIdTextFiled.getText(),String.valueOf(pwdTextField.getPassword())));
        String[] splits=result.split(" ");
        if(splits.length==1)
            JOptionPane.showMessageDialog(null, splits[0]);
        else if(splits.length==3){
            JOptionPane.showMessageDialog(null, splits[0]);
            dispose();
            MainJFrame main=new MainJFrame(new User(splits[1],logIdTextFiled.getText(),
                    String.valueOf(pwdTextField.getPassword()),Integer.valueOf(splits[2])));
            main.setVisible(true);
            
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        // TODO add your handling code here:
        RegFrame rf=new RegFrame();
        rf.setVisible(true);
    }//GEN-LAST:event_regButtonActionPerformed

    private void pwdTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdTextFieldFocusLost
        if(String.valueOf(pwdTextField.getPassword()).equals("")){
            pwdTextField.setText("请输入密码");
            pwdTextField.setEchoChar((char)0);
        }
    }//GEN-LAST:event_pwdTextFieldFocusLost

    private void pwdTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdTextFieldFocusGained
        if(String.valueOf(pwdTextField.getPassword()).equals("请输入密码")){
            pwdTextField.setText("");
            pwdTextField.setEchoChar('*');
        }
    }//GEN-LAST:event_pwdTextFieldFocusGained

    private void logIdTextFiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logIdTextFiledFocusLost
        if(logIdTextFiled.getText().equals(""))
        logIdTextFiled.setText("请输入账号");
    }//GEN-LAST:event_logIdTextFiledFocusLost

    private void logIdTextFiledFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logIdTextFiledFocusGained
        if(logIdTextFiled.getText().equals("请输入账号"))
        logIdTextFiled.setText("");
    }//GEN-LAST:event_logIdTextFiledFocusGained

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logIdTextFiled;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField pwdTextField;
    private javax.swing.JButton regButton;
    // End of variables declaration//GEN-END:variables
}