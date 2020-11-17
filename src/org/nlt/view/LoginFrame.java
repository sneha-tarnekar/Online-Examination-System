package org.nlt.view;

import javax.swing.JOptionPane;
import org.nlt.include.Config;
import org.nlt.model.Users;
import org.nlt.services.UserServices;

public class LoginFrame extends javax.swing.JInternalFrame {

    public LoginFrame() {
        try {
            setTitle("Login Frame");
            initComponents();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Login Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        upperPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        usertypeComboBox = new javax.swing.JComboBox();
        loginButton1 = new javax.swing.JButton();
        resetButton1 = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        upperPanel1.setBackground(new java.awt.Color(204, 204, 255));
        upperPanel1.setMaximumSize(new java.awt.Dimension(300, 32767));
        upperPanel1.setMinimumSize(new java.awt.Dimension(300, 170));
        upperPanel1.setPreferredSize(new java.awt.Dimension(300, 230));
        upperPanel1.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("USERNAME");
        upperPanel1.add(jLabel4);

        usernameTextField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        usernameTextField.setText("snehatarnekar@gmail.com");
        upperPanel1.add(usernameTextField);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PASSWORD");
        upperPanel1.add(jLabel5);

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        passwordTextField.setText("12345");
        upperPanel1.add(passwordTextField);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("USER TYPE");
        upperPanel1.add(jLabel6);

        usertypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        usertypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "STUDENT" }));
        upperPanel1.add(usertypeComboBox);

        loginButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        loginButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/login.png"))); // NOI18N
        loginButton1.setText("LOGIN");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        upperPanel1.add(loginButton1);

        resetButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        resetButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/reset 24.png"))); // NOI18N
        resetButton1.setText("RESET");
        upperPanel1.add(resetButton1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(upperPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(upperPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 740, 290));

        imageLabel.setBackground(new java.awt.Color(153, 153, 255));
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/banner_login.png"))); // NOI18N
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 990, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        try {
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();
            String userType = usertypeComboBox.getSelectedItem().toString();
            //if login successfull then it will return Users object
            //otherwise it will return null
            Users user = UserServices.getUser(username, password, userType);
            if (user == null) {
                JOptionPane.showMessageDialog(this, "Invalid Login", "Login Frame", JOptionPane.ERROR_MESSAGE);
            } else {
                Config.loginUser = user;
                Config.mainFrame.signupButton.setEnabled(false);    //after login signup button will be disabled
                //login successfull
                if (user.getStatus() == 2) //it means login person is admin
                {
                    Config.mainFrame.setAdminLogin();
                } else if (user.getStatus() == 3) //it means login person is student & approved
                {
                    Config.mainFrame.setStudentLogin();
                } else if (user.getStatus() == 1) //it means login person is student & approved
                {
                    JOptionPane.showMessageDialog(this, "Your Account Found But Yet Not Approved By Admin.\n Please Contact With Administrator", "Login Frame", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Login Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton1;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton resetButton1;
    private javax.swing.JPanel upperPanel1;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JComboBox usertypeComboBox;
    // End of variables declaration//GEN-END:variables
}
