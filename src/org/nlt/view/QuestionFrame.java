package org.nlt.view;

import java.util.Collection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nlt.include.Config;
import org.nlt.model.Questions;
import org.nlt.services.QuestionServices;

public class QuestionFrame extends javax.swing.JInternalFrame {
    
    Questions objective;
    
    public QuestionFrame() {
        try {
            setTitle("Question Frame");
            initComponents();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        optionATextField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        optionBTextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        optionCTextField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        optionDTextField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        queTypeComboBox = new javax.swing.JComboBox();
        marksSpinField = new com.toedter.components.JSpinField();
        optionARadioButton = new javax.swing.JRadioButton();
        optionBRadioButton = new javax.swing.JRadioButton();
        optionCRadioButton = new javax.swing.JRadioButton();
        optionDRadioButton = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        questionTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        practiceQuestionTable = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        QuestionTextArea1 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(211, 214, 221));
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jPanel3.setBackground(new java.awt.Color(211, 214, 221));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Questions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        questionTextArea.setColumns(20);
        questionTextArea.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        questionTextArea.setRows(5);
        jScrollPane1.setViewportView(questionTextArea);

        jPanel4.setBackground(new java.awt.Color(211, 214, 221));
        jPanel4.setLayout(new java.awt.GridLayout(6, 1, 5, 5));

        jPanel5.setBackground(new java.awt.Color(211, 214, 221));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Option A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 0, 0))); // NOI18N
        jPanel5.setLayout(new java.awt.BorderLayout());

        optionATextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel5.add(optionATextField, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(211, 214, 221));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Option B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 0, 0))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        optionBTextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel6.add(optionBTextField, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(211, 214, 221));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Option C", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 0, 0))); // NOI18N
        jPanel7.setLayout(new java.awt.BorderLayout());

        optionCTextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel7.add(optionCTextField, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(211, 214, 221));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Option D", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 0, 0))); // NOI18N
        jPanel8.setLayout(new java.awt.BorderLayout());

        optionDTextField.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jPanel8.add(optionDTextField, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(211, 214, 221));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Select marks and answer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel9.setLayout(new java.awt.GridLayout(1, 6));

        queTypeComboBox.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        queTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Practice", "Examination" }));
        jPanel9.add(queTypeComboBox);

        marksSpinField.setValue(1);
        jPanel9.add(marksSpinField);

        optionARadioButton.setBackground(new java.awt.Color(211, 214, 221));
        buttonGroup1.add(optionARadioButton);
        optionARadioButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        optionARadioButton.setText("Option A");
        jPanel9.add(optionARadioButton);

        optionBRadioButton.setBackground(new java.awt.Color(211, 214, 221));
        buttonGroup1.add(optionBRadioButton);
        optionBRadioButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        optionBRadioButton.setText("Option B");
        jPanel9.add(optionBRadioButton);

        optionCRadioButton.setBackground(new java.awt.Color(211, 214, 221));
        buttonGroup1.add(optionCRadioButton);
        optionCRadioButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        optionCRadioButton.setText("Option C");
        jPanel9.add(optionCRadioButton);

        optionDRadioButton.setBackground(new java.awt.Color(211, 214, 221));
        buttonGroup1.add(optionDRadioButton);
        optionDRadioButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        optionDRadioButton.setText("Option D");
        jPanel9.add(optionDRadioButton);

        jPanel4.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(211, 214, 221));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new java.awt.GridLayout(1, 4, 5, 5));

        submitButton.setBackground(new java.awt.Color(111, 175, 217));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(51, 0, 0));
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/submit.png"))); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel10.add(submitButton);

        updateButton.setBackground(new java.awt.Color(111, 175, 217));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(51, 0, 0));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/update 2.png"))); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel10.add(updateButton);

        deleteButton.setBackground(new java.awt.Color(111, 175, 217));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(51, 0, 0));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Button-Close-icon.png"))); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel10.add(deleteButton);

        resetButton.setBackground(new java.awt.Color(111, 175, 217));
        resetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(51, 0, 0));
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/reset 24.png"))); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel10.add(resetButton);

        jPanel4.add(jPanel10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(211, 214, 221));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Question Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examination Questions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 0, 102))); // NOI18N

        questionTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        questionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        questionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(questionTable);

        jPanel2.add(jScrollPane3);

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Practice Questions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(0, 0, 102))); // NOI18N

        practiceQuestionTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        practiceQuestionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        practiceQuestionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                practiceQuestionTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(practiceQuestionTable);

        jPanel2.add(jScrollPane4);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel11.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Questions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        QuestionTextArea1.setColumns(20);
        QuestionTextArea1.setRows(5);
        jScrollPane2.setViewportView(QuestionTextArea1);

        jPanel13.setLayout(new java.awt.GridLayout(6, 1, 5, 5));

        jPanel14.setLayout(new java.awt.BorderLayout());
        jPanel13.add(jPanel14);

        jPanel15.setLayout(new java.awt.BorderLayout());
        jPanel13.add(jPanel15);

        jPanel16.setLayout(new java.awt.BorderLayout());
        jPanel13.add(jPanel16);

        jPanel17.setLayout(new java.awt.BorderLayout());
        jPanel13.add(jPanel17);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel18);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel19);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Question Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel20);

        jInternalFrame1.getContentPane().add(jPanel11, java.awt.BorderLayout.CENTER);

        getContentPane().add(jInternalFrame1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            String question = questionTextArea.getText();
            String option1 = optionATextField.getText();
            String option2 = optionBTextField.getText();
            String option3 = optionCTextField.getText();
            String option4 = optionDTextField.getText();
            String answer = "";
            
            int status=0;
                    if(queTypeComboBox.getSelectedItem().toString().equals("Examination"))
                    {
                        status=1;
                    }
                    else if(queTypeComboBox.getSelectedItem().toString().equals("Practice"))
                    {
                        status=2;
                    }
            
            if ((status==1&&Config.questionMap.containsKey(question))||(status==2&&Config.practiceQuestionMap.containsKey(question))) {
                JOptionPane.showMessageDialog(this, "Question Already Exist", "Question Frame", JOptionPane.ERROR_MESSAGE);
            } else {
                if (optionARadioButton.isSelected()) {
                    answer = option1;
                } else if (optionBRadioButton.isSelected()) {
                    answer = option2;
                } else if (optionCRadioButton.isSelected()) {
                    answer = option3;
                } else if (optionDRadioButton.isSelected()) {
                    answer = option4;
                }
                
                if (question.isEmpty() || option1.isEmpty() || option2.isEmpty() || option3.isEmpty() || option4.isEmpty() || answer.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Invalid Entry", "Question Frame", JOptionPane.ERROR_MESSAGE);
                } else {
                    Questions objective = new Questions();
                    objective.setAnswer(answer);
                    objective.setOption1(option1);
                    objective.setOption2(option2);
                    objective.setOption3(option3);
                    objective.setOption4(option4);
                    objective.setQuestion(question);
                    objective.setMarks(marksSpinField.getValue());
                    objective.setStatus(status);
                    objective.setCreated(new Date());
                    objective.setModified(new Date());
                    QuestionServices.addQuestion(objective);
                    JOptionPane.showMessageDialog(this, "Question Added", "Question Frame", JOptionPane.INFORMATION_MESSAGE);
                    
                    Config.mainFrame.setQuestionMap();
                    Config.mainFrame.setPracticeQuestionMap();
                    Config.questionFrame.setTableData();
                    Config.questionFrame.setPracticeTableData();
                    resetData();
                } //inner else close
            } //else close
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void questionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionTableMouseClicked
        try {
            String question = questionTable.getValueAt(questionTable.getSelectedRow(), 0).toString();
            objective = Config.questionMap.get(question);
            if (objective != null) {
                questionTextArea.setText(objective.getQuestion());
                optionATextField.setText(objective.getOption1());
                optionBTextField.setText(objective.getOption2());
                optionCTextField.setText(objective.getOption3());
                optionDTextField.setText(objective.getOption4());
                if (objective.getAnswer().equals(objective.getOption1())) {
                    optionARadioButton.setSelected(true);
                } else if (objective.getAnswer().equals(objective.getOption2())) {
                    optionBRadioButton.setSelected(true);
                } else if (objective.getAnswer().equals(objective.getOption3())) {
                    optionCRadioButton.setSelected(true);
                } else if (objective.getAnswer().equals(objective.getOption4())) {
                    optionDRadioButton.setSelected(true);
                }
                marksSpinField.setValue(objective.getMarks());
                queTypeComboBox.setSelectedItem("Examination");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_questionTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            if (objective == null) {
                JOptionPane.showMessageDialog(this, "Please select a question to update", "Question Frame", JOptionPane.ERROR_MESSAGE);
            } else {
                String question = questionTextArea.getText();
                String option1 = optionATextField.getText();
                String option2 = optionBTextField.getText();
                String option3 = optionCTextField.getText();
                String option4 = optionDTextField.getText();
                String answer = "";
                
                int status=0;
                    if(queTypeComboBox.getSelectedItem().toString().equals("Examination"))
                    {
                        status=1;
                    }
                    else if(queTypeComboBox.getSelectedItem().toString().equals("Practice"))
                    {
                        status=2;
                    }
                
                if (optionARadioButton.isSelected()) {
                    answer = option1;
                } else if (optionBRadioButton.isSelected()) {
                    answer = option2;
                } else if (optionCRadioButton.isSelected()) {
                    answer = option3;
                } else if (optionDRadioButton.isSelected()) {
                    answer = option4;
                }
                objective.setAnswer(answer);
                objective.setOption1(option1);
                objective.setOption2(option2);
                objective.setOption3(option3);
                objective.setOption4(option4);
                objective.setQuestion(question);
                objective.setMarks(marksSpinField.getValue());
                objective.setModified(new Date());
                objective.setStatus(status);
                
                QuestionServices.updateQuestion(objective);
                JOptionPane.showMessageDialog(this, "Question Updated", "Question Frame", JOptionPane.INFORMATION_MESSAGE);
                
                Config.mainFrame.setQuestionMap();
                Config.mainFrame.setPracticeQuestionMap();
                Config.questionFrame.setTableData();
                                    Config.questionFrame.setPracticeTableData();
                resetData();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            if (objective == null) {
                JOptionPane.showMessageDialog(this, "Please Select Question To Delete", "Question Frame", JOptionPane.ERROR_MESSAGE);
            } else {
                objective.setModified(new Date());
                objective.setStatus(0);
                QuestionServices.updateQuestion(objective);
                JOptionPane.showMessageDialog(this, "Question Deleted Successfully", "Question Frame", JOptionPane.INFORMATION_MESSAGE);
                Config.mainFrame.setQuestionMap();  //will refresh map variable
                Config.mainFrame.setPracticeQuestionMap();//will refresh map variable
                Config.questionFrame.setTableData();    //will display record in table
                Config.questionFrame.setPracticeTableData();//will display record in table
                resetData();
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resetData();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void practiceQuestionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_practiceQuestionTableMouseClicked
         try {
            String question = practiceQuestionTable.getValueAt(practiceQuestionTable.getSelectedRow(), 0).toString();
            objective = Config.practiceQuestionMap.get(question);
            if (objective != null) {
                questionTextArea.setText(objective.getQuestion());
                optionATextField.setText(objective.getOption1());
                optionBTextField.setText(objective.getOption2());
                optionCTextField.setText(objective.getOption3());
                optionDTextField.setText(objective.getOption4());
                if (objective.getAnswer().equals(objective.getOption1())) {
                    optionARadioButton.setSelected(true);
                } else if (objective.getAnswer().equals(objective.getOption2())) {
                    optionBRadioButton.setSelected(true);
                } else if (objective.getAnswer().equals(objective.getOption3())) {
                    optionCRadioButton.setSelected(true);
                } else if (objective.getAnswer().equals(objective.getOption4())) {
                    optionDRadioButton.setSelected(true);
                }
                marksSpinField.setValue(objective.getMarks());
                queTypeComboBox.setSelectedItem("Practice");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_practiceQuestionTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea QuestionTextArea1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.components.JSpinField marksSpinField;
    private javax.swing.JRadioButton optionARadioButton;
    private javax.swing.JTextField optionATextField;
    private javax.swing.JRadioButton optionBRadioButton;
    private javax.swing.JTextField optionBTextField;
    private javax.swing.JRadioButton optionCRadioButton;
    private javax.swing.JTextField optionCTextField;
    private javax.swing.JRadioButton optionDRadioButton;
    private javax.swing.JTextField optionDTextField;
    private javax.swing.JTable practiceQuestionTable;
    private javax.swing.JComboBox queTypeComboBox;
    private javax.swing.JTable questionTable;
    private javax.swing.JTextArea questionTextArea;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    public void setTableData() {
        try {
            Collection<Questions> questionValues = Config.questionMap.values();
            String[] cols = {"QUE", "OP1", "OP2", "OP3", "OP4", "ANS", "MARKS"};
            String[][] data = new String[questionValues.size()][cols.length];
            int i = 0;
            for (Questions question : questionValues) {
                data[i][0] = question.getQuestion();
                data[i][1] = question.getOption1();
                data[i][2] = question.getOption2();
                data[i][3] = question.getOption3();
                data[i][4] = question.getOption4();
                data[i][5] = question.getAnswer();
                data[i][6] = question.getMarks() + "";
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, cols);
            questionTable.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setPracticeTableData() {
        try {
            Collection<Questions> questionValues = Config.practiceQuestionMap.values();
            String[] cols = {"QUE", "OP1", "OP2", "OP3", "OP4", "ANS", "MARKS"};
            String[][] data = new String[questionValues.size()][cols.length];
            int i = 0;
            for (Questions question : questionValues) {
                data[i][0] = question.getQuestion();
                data[i][1] = question.getOption1();
                data[i][2] = question.getOption2();
                data[i][3] = question.getOption3();
                data[i][4] = question.getOption4();
                data[i][5] = question.getAnswer();
                data[i][6] = question.getMarks() + "";
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, cols);
            practiceQuestionTable.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void resetData() {
        questionTextArea.setText("");
        optionATextField.setText("");
        optionBTextField.setText("");
        optionCTextField.setText("");
        optionDTextField.setText("");
        marksSpinField.setValue(1);
    }
    
}
