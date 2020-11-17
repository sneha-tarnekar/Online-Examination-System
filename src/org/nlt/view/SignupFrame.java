package org.nlt.view;

import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import org.nlt.include.Config;
import org.nlt.model.Users;
import org.nlt.services.EmailServices;
import org.nlt.services.UserServices;

public class SignupFrame extends javax.swing.JInternalFrame {

    public SignupFrame() {
        try {
            setTitle("Sign up Frame");
            initComponents();
            dobDateChooser.setDate(new Date());    //it will set current date
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Sign up Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobileNoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        classnameComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        dobDateChooser = new com.toedter.calendar.JDateChooser();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new java.awt.GridLayout(6, 2, 10, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/faculty1.jpg"))); // NOI18N
        jLabel2.setText("NAME");
        jPanel3.add(jLabel2);

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(nameTextField);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Mail-icon.png"))); // NOI18N
        jLabel3.setText("EMAIL");
        jPanel3.add(jLabel3);

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(emailTextField);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/iPhone-White-iOS-icon.png"))); // NOI18N
        jLabel4.setText("MOBILE NO");
        jPanel3.add(jLabel4);

        mobileNoTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(mobileNoTextField);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Calendar-icon.png"))); // NOI18N
        jLabel5.setText("CLASSNAME");
        jPanel3.add(jLabel5);

        classnameComboBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        classnameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year 1", "Year 2", "Year 3", "Year 4" }));
        jPanel3.add(classnameComboBox);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Mac-iCal-icon.png"))); // NOI18N
        jLabel6.setText("DATE OF BIRTH");
        jPanel3.add(jLabel6);

        dobDateChooser.setDateFormatString("dd,MM, yyyy");
        dobDateChooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(dobDateChooser);

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Check-icon.png"))); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitButton);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/signup-Custom.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 171, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            String name = nameTextField.getText();
            String email = emailTextField.getText();
            String phone = mobileNoTextField.getText();
            String className = classnameComboBox.getSelectedItem().toString();
            Date dob = dobDateChooser.getDate();

            int val = new Random().nextInt(1000000); //will return less than this random value
            if (val < 0) //if negative
            {
                val = val * -1; //converting into positive value
            }

            String password = val + "";

            if (Config.userMap.containsKey(email)) {
                JOptionPane.showMessageDialog(this, "Email Id Already Exist", "Sign up Frame", JOptionPane.ERROR_MESSAGE);
            } else {
                Users user = new Users(); //empty object
                user.setClassname(className);
                user.setCreated(new Date());
                user.setDob(dob);
                user.setEmail(email);
                user.setModified(new Date());
                user.setName(name);
                user.setPassword(password);
                user.setPhone(phone);
                user.setStatus(1);

                UserServices.addUser(user);
                JOptionPane.showMessageDialog(this, "Your account created successfully \nPlease check your email for password", "Sign up", JOptionPane.INFORMATION_MESSAGE);
                String textMessage = "Your Login Authentication Are\n Username:" + email + "\n Password: " + password;
                new EmailServices().sendMail(email, "Login Authentication", textMessage);
                JOptionPane.showMessageDialog(this, "Please check your email for Login Details", "Sign up", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Sign up Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox classnameComboBox;
    private com.toedter.calendar.JDateChooser dobDateChooser;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField mobileNoTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
