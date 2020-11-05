package org.nlt.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nlt.include.Config;
import org.nlt.model.Users;
import org.nlt.services.UserServices;

public class StudentFrame extends javax.swing.JInternalFrame {

    private Users user;

    public StudentFrame() {
        try {
            setTitle("Student Frame");
            initComponents();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Student Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        approvedButton = new javax.swing.JButton();
        notApprovedButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "STUDENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 10, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("STUDENT NAME");
        jPanel3.add(jLabel1);
        jPanel3.add(nameTextField);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("EMAIL");
        jPanel3.add(jLabel2);
        jPanel3.add(emailTextField);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("PHONE NO.");
        jPanel3.add(jLabel3);
        jPanel3.add(phoneTextField);

        approvedButton.setBackground(new java.awt.Color(0, 204, 0));
        approvedButton.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        approvedButton.setForeground(new java.awt.Color(255, 255, 255));
        approvedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Approved.png"))); // NOI18N
        approvedButton.setText("APPROVED");
        approvedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedButtonActionPerformed(evt);
            }
        });
        jPanel3.add(approvedButton);

        notApprovedButton.setBackground(new java.awt.Color(255, 0, 0));
        notApprovedButton.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        notApprovedButton.setForeground(new java.awt.Color(255, 255, 255));
        notApprovedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Not approved.png"))); // NOI18N
        notApprovedButton.setText("NOT APPROVED");
        notApprovedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notApprovedButtonActionPerformed(evt);
            }
        });
        jPanel3.add(notApprovedButton);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "STUDENT DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        jPanel4.add(jScrollPane1);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Student-id.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        try {
            String email = studentTable.getValueAt(studentTable.getSelectedRow(), 2).toString();
            user = Config.userMap.get(email);
            nameTextField.setText(user.getName());
            emailTextField.setText(user.getEmail());
            phoneTextField.setText(user.getPhone());

            if (user.getStatus() == 3) {
                notApprovedButton.setEnabled(true);
                approvedButton.setEnabled(false);
            } else if (user.getStatus() == 1) {
                notApprovedButton.setEnabled(false);
                approvedButton.setEnabled(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Student Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_studentTableMouseClicked

    private void approvedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedButtonActionPerformed
        try {
            user.setStatus(3);
            UserServices.updateUser(user);
            JOptionPane.showMessageDialog(this, "User Approved Successfully", "Student Frame", JOptionPane.INFORMATION_MESSAGE);
            Config.mainFrame.setUserMap();  //will refresh map variable
            Config.studentFrame.setTableData(); //will refresh student table
            approvedButton.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Student Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_approvedButtonActionPerformed

    private void notApprovedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notApprovedButtonActionPerformed
        try {
            user.setStatus(1);
            UserServices.updateUser(user);
            JOptionPane.showMessageDialog(this, "User Approved Removed Successfully", "Student Frame", JOptionPane.INFORMATION_MESSAGE);
            Config.mainFrame.setUserMap();  //will refresh map variable
            Config.studentFrame.setTableData(); //will refresh student table
            approvedButton.setEnabled(false);
            notApprovedButton.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Student Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_notApprovedButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvedButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton notApprovedButton;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables

    //this method will display list of students i.e. users in table
    public void setTableData() {
        try {
            List<Users> userList = UserServices.getUserList();
            String[] cols = {"NAME", "CLASS", "EMail", "CONTACT", "DOB", "APPROVED"};
            String[][] data = new String[userList.size()][cols.length];
            int i = 0;
            for (Users user : userList) {
                data[i][0] = user.getName();
                data[i][1] = user.getClassname();
                data[i][2] = user.getEmail();
                data[i][3] = user.getPhone();
                data[i][4] = user.getDob().toString();
                if (user.getStatus() == 3) {
                    data[i][5] = "APPROVED";
                } else {
                    data[i][5] = "NOT APPROVED";
                }
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, cols);
            studentTable.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Student Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

}
