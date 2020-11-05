package org.nlt.view;

import java.util.Date;
import javax.swing.JOptionPane;
import org.nlt.include.Config;
import org.nlt.services.UserServices;

public class SettingFrame extends javax.swing.JInternalFrame {

    public SettingFrame() {
        try {
            setTitle("Setting Frame");
            initComponents();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Setting Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        saveEmailButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        marksTextField = new javax.swing.JTextField();
        saveExamButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        currentPasswordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        confirmNewPasswordField = new javax.swing.JPasswordField();
        changePasswordButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        instruction1TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        instruction2TextField = new javax.swing.JTextField();
        saveInstructionButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "EMAIL CONFIGURATION DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setText("ENTER EMAIL ID");
        jPanel1.add(jLabel1);

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(emailTextField);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("ENTER EMAIL PASSWORD");
        jPanel1.add(jLabel2);

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(passwordTextField);

        saveEmailButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        saveEmailButton.setText("SAVE");
        saveEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEmailButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveEmailButton);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "EXAM DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setText("ENTER EXAM TIME PERIOD IN MINUTES");
        jPanel2.add(jLabel3);

        timeTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        timeTextField.setToolTipText("");
        jPanel2.add(timeTextField);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setText("ENTER EXAM MARKS");
        jPanel2.add(jLabel4);

        marksTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(marksTextField);

        saveExamButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        saveExamButton.setText("SAVE");
        saveExamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExamButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveExamButton);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Current Password");
        jPanel3.add(jLabel5);

        currentPasswordField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(currentPasswordField);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("New Password");
        jPanel3.add(jLabel6);

        newPasswordField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(newPasswordField);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Confirm New Password");
        jPanel3.add(jLabel7);

        confirmNewPasswordField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(confirmNewPasswordField);

        changePasswordButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changePasswordButton.setText("CHANGE PASSWORD");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        jPanel3.add(changePasswordButton);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "INSTRUCTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("INSTRUCTION1");
        jPanel4.add(jLabel8);

        instruction1TextField.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel4.add(instruction1TextField);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setText("INSTRUCTION2");
        jPanel4.add(jLabel9);

        instruction2TextField.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jPanel4.add(instruction2TextField);

        saveInstructionButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        saveInstructionButton.setText("SAVE");
        saveInstructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInstructionButtonActionPerformed(evt);
            }
        });
        jPanel4.add(saveInstructionButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        try {
            String currentPassword = currentPasswordField.getText();
            if (currentPassword.equals(Config.loginUser.getPassword())) {
                String newPassword = newPasswordField.getText();
                String confirmNewPassword = confirmNewPasswordField.getText();

                if (newPassword.equals(confirmNewPassword)) {
                    Config.loginUser.setPassword(newPassword);
                    Config.loginUser.setModified(new Date());
                    UserServices.updateUser(Config.loginUser);
                    JOptionPane.showMessageDialog(this, "Password Changed Successfully", "Change Password", JOptionPane.INFORMATION_MESSAGE);
                    currentPasswordField.setText("");
                    newPasswordField.setText("");
                    confirmNewPasswordField.setText("");

                    Config.mainFrame.setLogout();
                    Config.mainFrame.setLoginFrame();
                } else {
                    JOptionPane.showMessageDialog(this, "Confirm Password Mismatch", "Change Password", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(this, "Current Password Mismatch", "Change Password", JOptionPane.ERROR_MESSAGE);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Change Password", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void saveEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEmailButtonActionPerformed
        Config.props.setProperty("email", emailTextField.getText());
        Config.props.setProperty("email password", passwordTextField.getText());
        Config.mainFrame.setSettingProperties();
    }//GEN-LAST:event_saveEmailButtonActionPerformed

    private void saveExamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExamButtonActionPerformed
        Config.props.setProperty("exam time", timeTextField.getText());
        Config.props.setProperty("exam marks", marksTextField.getText());
        Config.mainFrame.setSettingProperties();
    }//GEN-LAST:event_saveExamButtonActionPerformed

    private void saveInstructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInstructionButtonActionPerformed
        Config.props.setProperty("instruction1", instruction1TextField.getText());
      Config.props.setProperty("instruction2", instruction2TextField.getText());
      Config.mainFrame.setSettingProperties();
    }//GEN-LAST:event_saveInstructionButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JPasswordField confirmNewPasswordField;
    private javax.swing.JPasswordField currentPasswordField;
    public javax.swing.JTextField emailTextField;
    public javax.swing.JTextField instruction1TextField;
    public javax.swing.JTextField instruction2TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField marksTextField;
    private javax.swing.JPasswordField newPasswordField;
    public javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton saveEmailButton;
    private javax.swing.JButton saveExamButton;
    private javax.swing.JButton saveInstructionButton;
    public javax.swing.JTextField timeTextField;
    // End of variables declaration//GEN-END:variables
}
