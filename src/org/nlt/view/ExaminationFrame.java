package org.nlt.view;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.nlt.include.Config;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.Examinations;
import org.nlt.model.Questions;
import org.nlt.services.ExaminationServices;
import org.nlt.services.UserServices;

public class ExaminationFrame extends javax.swing.JInternalFrame implements Runnable {

    private Thread examthread;
    private int questionIndex = 0;
    private ArrayList<String> questionArrayList;

    public ExaminationFrame() {
        try {
            setTitle("Examination Frame");
            initComponents();
            questionArrayList = new ArrayList();
            examthread = new Thread(this);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    //when any thread will start execution
    //this method will execute
    public void run() {
        startButton.setEnabled(false);
        exitButton.setEnabled(true);
        nextButton.setEnabled(true);
        getQuestion();

        int s = 59;
        int m = Integer.parseInt(Config.props.getProperty("exam time"));
        m--;
        while (true) //infine loop
        {
            timeLabel.setText("Time Remaining: " + m + ":" + s);
            s--;
            if (s == 0) {
                if (m == 0) {
                    JOptionPane.showMessageDialog(this, "Examination Over", "Examination Frame", JOptionPane.ERROR_MESSAGE);
                    exitButton.setEnabled(false);
                    nextButton.setEnabled(false);
                    previousButton.setEnabled(false);
                    submitButton.setEnabled(false);
                    resultButton.setEnabled(true);
                    examReportButton.setEnabled(true);
                    break;
                }
                m--;
                s = 59;
            }
            try {
                examthread.sleep(1000);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        queTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        optionA = new javax.swing.JRadioButton();
        optionB = new javax.swing.JRadioButton();
        optionC = new javax.swing.JRadioButton();
        optionD = new javax.swing.JRadioButton();
        usernameLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        markLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        totalQueLabel = new javax.swing.JLabel();
        solvedQueLabel = new javax.swing.JLabel();
        remainingQueLabel = new javax.swing.JLabel();
        examReportButton = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("EXAMINATION");

        queTextArea.setColumns(20);
        queTextArea.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        queTextArea.setRows(5);
        queTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUESTION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(queTextArea);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        optionA.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(optionA);
        optionA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optionA.setText("Option A");
        jPanel3.add(optionA);

        optionB.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(optionB);
        optionB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optionB.setText("Option B");
        jPanel3.add(optionB);

        optionC.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(optionC);
        optionC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optionC.setText("Option C");
        jPanel3.add(optionC);

        optionD.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(optionD);
        optionD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        optionD.setText("Option D");
        jPanel3.add(optionD);

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(102, 0, 102));
        usernameLabel.setText("User Login :");

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 3, 20, 20));

        previousButton.setBackground(new java.awt.Color(51, 51, 51));
        previousButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        previousButton.setForeground(new java.awt.Color(255, 255, 255));
        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/previous.png"))); // NOI18N
        previousButton.setText("PREVIOUS");
        previousButton.setEnabled(false);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });
        jPanel5.add(previousButton);

        nextButton.setBackground(new java.awt.Color(51, 51, 51));
        nextButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/next.png"))); // NOI18N
        nextButton.setText("NEXT");
        nextButton.setEnabled(false);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel5.add(nextButton);

        submitButton.setBackground(new java.awt.Color(51, 51, 51));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/submit.png"))); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.setEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel5.add(submitButton);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        startButton.setBackground(new java.awt.Color(0, 204, 0));
        startButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Edit-Document-icon (1).png"))); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        markLabel.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        markLabel.setForeground(new java.awt.Color(255, 255, 255));
        markLabel.setText("Max. Marks: ");
        markLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        timeLabel.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("Max. Time Limit: ");
        timeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Examination.jpg"))); // NOI18N

        exitButton.setBackground(new java.awt.Color(204, 0, 0));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/Button-Close-icon.png"))); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setToolTipText("Don't click this button untill you submit your exam");
        exitButton.setEnabled(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        resultButton.setBackground(new java.awt.Color(0, 0, 204));
        resultButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        resultButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/instru_black.png"))); // NOI18N
        resultButton.setText("RESULT");
        resultButton.setEnabled(false);
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        totalQueLabel.setBackground(new java.awt.Color(0, 0, 0));
        totalQueLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        totalQueLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalQueLabel.setText("TOTAL QUE:");

        solvedQueLabel.setBackground(new java.awt.Color(0, 0, 0));
        solvedQueLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        solvedQueLabel.setForeground(new java.awt.Color(255, 255, 255));
        solvedQueLabel.setText("SOLVED QUE:");

        remainingQueLabel.setBackground(new java.awt.Color(0, 0, 0));
        remainingQueLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        remainingQueLabel.setForeground(new java.awt.Color(255, 255, 255));
        remainingQueLabel.setText("REMAINING QUE:");

        examReportButton.setBackground(new java.awt.Color(0, 153, 153));
        examReportButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        examReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/instructions.png"))); // NOI18N
        examReportButton.setText("Exam Details");
        examReportButton.setActionCommand("Exam Report");
        examReportButton.setEnabled(false);
        examReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultButton)
                        .addGap(18, 18, 18)
                        .addComponent(examReportButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(totalQueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(solvedQueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(remainingQueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(markLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(markLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalQueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(solvedQueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(remainingQueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            int questionSize = Config.questionMap.values().size();
            totalQueLabel.setText("TOTAL QUE: " + questionSize);
            remainingQueLabel.setText("REMAINING QUE: " + questionSize);
            solvedQueLabel.setText("SOLVED QUE: 0");

            usernameLabel.setText("Login: " + Config.loginUser.getName());
            if (Config.props.containsKey("exam time")) {
                timeLabel.setText("Time Remaining : " + Config.props.getProperty("exam time") + " minutes");
            }
            if (Config.props.containsKey("exam marks")) {
                markLabel.setText("Max. Marks: " + Config.props.getProperty("exam marks"));
            }
            examthread.start();     //It will start execution of run()

            Config.loginUser.setStatus(1);
            UserServices.updateUser(Config.loginUser);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        try {
            int ans = JOptionPane.showConfirmDialog(this, "Sure? You want to exit?", "End Exam", JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                examthread.stop();
                startButton.setEnabled(true);
                exitButton.setEnabled(false);
                resultButton.setEnabled(false);
                examReportButton.setEnabled(false);
                queTextArea.setText("");
                optionA.setText("Option A");
                optionB.setText("Option B");
                optionC.setText("Option C");
                optionD.setText("Option D");
                markLabel.setText("Total marks: ");
                timeLabel.setText("Time Remaining: 0:0");
                totalQueLabel.setText("TOTAL QUE: 0");
                remainingQueLabel.setText("REMAINING QUE: 0");
                solvedQueLabel.setText("SOLVED QUE: 0");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        try {
            getQuestion();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        try {
            questionIndex = questionIndex - 2;
            getQuestion();
            if (questionIndex == 1) {
                previousButton.setEnabled(false);
            }
            nextButton.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_previousButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            //we need to select an option
            if (optionA.isSelected() || optionB.isSelected() || optionC.isSelected() || optionD.isSelected()) {
                //create empty object
                Examinations examination = new Examinations();

                //the Questions object which we are going to solve
                Questions objective = Config.questionMap.get(queTextArea.getText());
                int marks = 0;
                boolean result = false;

                if (optionA.isSelected() && objective.getOption1().equals(objective.getAnswer())) {
                    marks = objective.getMarks();
                    result = true;
                }
                if (optionB.isSelected() && objective.getOption2().equals(objective.getAnswer())) {
                    marks = objective.getMarks();
                    result = true;
                }
                if (optionC.isSelected() && objective.getOption3().equals(objective.getAnswer())) {
                    marks = objective.getMarks();
                    result = true;
                }
                if (optionD.isSelected() && objective.getOption4().equals(objective.getAnswer())) {
                    marks = objective.getMarks();
                    result = true;
                }

                String givenAnswer = "";
                if (optionA.isSelected()) {
                    givenAnswer = optionA.getText();
                }
                if (optionB.isSelected()) {
                    givenAnswer = optionB.getText();
                }
                if (optionC.isSelected()) {
                    givenAnswer = optionC.getText();
                }
                if (optionD.isSelected()) {
                    givenAnswer = optionD.getText();
                }

                examination.setAnswer(givenAnswer);
                examination.setCreated(new Date());
                examination.setMarks(marks);
                examination.setModified(new Date());
                examination.setObjective(objective);
                examination.setResult(result);
                examination.setStatus(1);
                examination.setUser(Config.loginUser);

                ExaminationServices.addExaminationQuestion(examination);
                questionArrayList.add(queTextArea.getText());
                submitButton.setEnabled(false);
                //JOptionPane.showMessageDialog(this, "Your Answer Submitted\n Click To Next / Previous", "Examination Frame", JOptionPane.INFORMATION_MESSAGE);

                solvedQueLabel.setText("SOLVED QUE: " + questionArrayList.size());
                remainingQueLabel.setText("REMAINING QUE: " + (Config.questionMap.values().size() - questionArrayList.size()));
                if (questionArrayList.size() == Config.questionMap.values().size()) {
                    resultButton.setEnabled(true);
                    examReportButton.setEnabled(true);
                    exitButton.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Your have submitted all questions. \n Check your result by clicking Result button", "Examination Frame", JOptionPane.INFORMATION_MESSAGE);
                }
                //getQuestion();  //It will set next question after submitting current question
            } else {
                JOptionPane.showMessageDialog(this, "Please select an option", "Examination Frame", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        try {
            List<Examinations> examinationList = ExaminationServices.getExaminations(Config.loginUser);
            int totalMarks = 0;   //total marks
            int marksObtained = 0;    //marks obtained
            int correctAns = 0;
            int incorrectAns = 0;
            String result;

            for (Examinations examination : examinationList) {
                totalMarks = totalMarks + examination.getObjective().getMarks();
                if (examination.isResult()) {
                    marksObtained = marksObtained + examination.getMarks();
                    correctAns++;
                } else {
                    incorrectAns++;
                }
            }

            if (marksObtained >= totalMarks / 2) {
                JOptionPane.showMessageDialog(this, "Congratulations! You are passed. \nMarks Obtained: " + marksObtained + " out of " + totalMarks + "\n Correct Ans: " + correctAns + "   Incorrect Ans: " + incorrectAns, "Result", JOptionPane.INFORMATION_MESSAGE);
                result = "Pass";
            } else {
                JOptionPane.showMessageDialog(this, "You are failed. \nBetter luck next time! \nMarks Obtained: " + marksObtained + " out of " + totalMarks + "\n Correct Ans: " + correctAns + "   Incorrect Ans: " + incorrectAns, "Result", JOptionPane.INFORMATION_MESSAGE);
                result = "Fail";
            }

            Connection con = DatabaseConnection.getDatabaseSession().connection();
            File f = new File(".");

            JasperDesign jd = JRXmlLoader.load(f.getCanonicalPath() + "/build/classes/org/nlt/report/Certificate.jrxml");

            String sql = "SELECT\n"
                    + "     results.`created` AS results_created,\n"
                    + "     results.`marksObtained` AS results_marksObtained,\n"
                    + "     results.`result` AS results_result,\n"
                    + "     results.`totalMarks` AS results_totalMarks,\n"
                    + "     users.`id` AS users_id,\n"
                    + "     users.`classname` AS users_classname,\n"
                    + "     users.`name` AS users_name,\n"
                    + "     users.`phone` AS users_phone,\n"
                    + "     users.`dob` AS users_dob\n"
                    + "FROM\n"
                    + "     `users` users INNER JOIN `results` results ON users.`id` = results.`user_id` where users.`id` =" + Config.loginUser.getId();

            // System.out.println(sql);
            JRDesignQuery query = new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);

            String pdfFileName = f.getCanonicalPath() + "/" + Config.loginUser.getName() + ".pdf";
            JasperExportManager.exportReportToPdfFile(jp, pdfFileName);

            JasperViewer.viewReport(jp, false);

            Config.resultFrame.setStudentResult(result, marksObtained, totalMarks); //this method will add result for result frame
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_resultButtonActionPerformed

    private void examReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examReportButtonActionPerformed
        try {

            Connection con = DatabaseConnection.getDatabaseSession().connection();
            File f = new File(".");

            JasperDesign jd = JRXmlLoader.load(f.getCanonicalPath() + "/build/classes/org/nlt/report/ExamReport.jrxml");

            String sql = "SELECT\n"
                    + "     examinations.`answer` AS examinations_answer,\n"
                    + "     examinations.`marks` AS examinations_marks,\n"
                    + "     examinations.`result` AS examinations_result,\n"
                    + "     examinations.`status` AS examinations_status,\n"
                    + "     users.`name` AS users_name,\n"
                    + "     questions.`answer` AS questions_answer,\n"
                    + "     questions.`question` AS questions_question,\n"
                    + "     examinations.`id` AS examinations_id,\n"
                    + "     users.`phone` AS users_phone\n"
                    + "FROM\n"
                    + "     `users` users INNER JOIN `examinations` examinations ON users.`id` = examinations.`user_id` \n"
                    + "     INNER JOIN `questions` questions ON examinations.`objective_id` = questions.`id` where users.`id` =" + Config.loginUser.getId();

            // System.out.println(sql);
            JRDesignQuery query = new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);

            JasperViewer.viewReport(jp, false);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_examReportButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton examReportButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel markLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton optionA;
    private javax.swing.JRadioButton optionB;
    private javax.swing.JRadioButton optionC;
    private javax.swing.JRadioButton optionD;
    private javax.swing.JButton previousButton;
    private javax.swing.JTextArea queTextArea;
    private javax.swing.JLabel remainingQueLabel;
    private javax.swing.JButton resultButton;
    private javax.swing.JLabel solvedQueLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalQueLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private void getQuestion() {
        try {
            Collection<Questions> questionValues = Config.questionMap.values();
            ArrayList<Questions> objectiveArrayList = new ArrayList(questionValues);
            Questions question = objectiveArrayList.get(questionIndex);
            questionIndex++;
            queTextArea.setText(question.getQuestion());
            optionA.setText(question.getOption1());
            optionB.setText(question.getOption2());
            optionC.setText(question.getOption3());
            optionD.setText(question.getOption4());

            //It means last que is over
            if (questionIndex == objectiveArrayList.size()) {
                nextButton.setEnabled(false);
            }

            //if questions are more than 2
            if (questionIndex > 1 && objectiveArrayList.size() > 1) {
                previousButton.setEnabled(true);
            }

            //Start button, Next button, Previous button
            if (questionArrayList.contains(queTextArea.getText())) //question solved
            {
                submitButton.setEnabled(false);
            } else //question unsolved
            {
                submitButton.setEnabled(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

}
