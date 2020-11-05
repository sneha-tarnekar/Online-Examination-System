package org.nlt.view;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import org.nlt.include.Config;
import org.nlt.model.Questions;
import org.nlt.model.Results;
import org.nlt.model.Users;
import org.nlt.services.EmailServices;
import org.nlt.services.QuestionServices;
import org.nlt.services.ResultServices;
import org.nlt.services.UserServices;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        try {
            initComponents();
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/org/nlt/images/Admin-icon_1.png")));
            setExtendedState(MAXIMIZED_BOTH);
            Config.mainFrame = this;
            Config.loginFrame = new LoginFrame();
            Config.signupFrame = new SignupFrame();
            Config.studentFrame = new StudentFrame();
            Config.instructionFrame = new InstructionFrame();
            Config.examinationFrame = new ExaminationFrame();
            Config.practiceFrame = new PracticeFrame();
            Config.settingFrame = new SettingFrame();
            Config.questionFrame = new QuestionFrame();
            Config.resultFrame = new ResultFrame();
            Config.defaultFrame = new DefaultFrame();

            Config.mainFrame.setUserMap();
            Config.mainFrame.setQuestionMap();
            Config.mainFrame.setPracticeQuestionMap();
            Config.mainFrame.setResultMap();

            Config.studentFrame.setTableData();
            Config.questionFrame.setTableData();
            Config.questionFrame.setPracticeTableData();
            Config.resultFrame.setResultTableData();

            getSettingProperties();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upperPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        forgotPasswordButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        instructionButton = new javax.swing.JButton();
        practiceButton = new javax.swing.JButton();
        examinationButton = new javax.swing.JButton();
        questionsButton = new javax.swing.JButton();
        studentsButton = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        desktopPaneMaster = new javax.swing.JDesktopPane();
        contentImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upperPanel.setBackground(new java.awt.Color(255, 255, 255));
        upperPanel.setPreferredSize(new java.awt.Dimension(872, 100));

        titleLabel.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 255));
        titleLabel.setText("ONLINE EXAMINATION");

        loginButton.setBackground(new java.awt.Color(0, 204, 0));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/online-icon.png"))); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(0, 204, 0));
        signupButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/online-red-icon.png"))); // NOI18N
        signupButton.setText("SIGN UP");
        signupButton.setBorder(null);
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/oe logo.jpg"))); // NOI18N

        forgotPasswordButton.setBackground(new java.awt.Color(255, 255, 255));
        forgotPasswordButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        forgotPasswordButton.setForeground(new java.awt.Color(0, 153, 0));
        forgotPasswordButton.setText("Forgot Password");
        forgotPasswordButton.setBorder(null);
        forgotPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/logout-icon.png"))); // NOI18N
        logoutButton.setToolTipText("Click here to log out");
        logoutButton.setBorder(null);
        logoutButton.setEnabled(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(logoLabel)
                .addGap(85, 85, 85)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addContainerGap())
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPanelLayout.createSequentialGroup()
                        .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(upperPanel, java.awt.BorderLayout.NORTH);

        contentPanel.setLayout(new java.awt.GridLayout(1, 1));

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(250, 2147483647));
        jSplitPane1.setMinimumSize(new java.awt.Dimension(250, 397));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(250, 27));

        leftPanel.setBackground(new java.awt.Color(0, 51, 204));
        leftPanel.setMaximumSize(new java.awt.Dimension(200, 32767));
        leftPanel.setMinimumSize(new java.awt.Dimension(200, 395));
        leftPanel.setPreferredSize(new java.awt.Dimension(200, 566));
        leftPanel.setLayout(new java.awt.GridLayout(9, 1, 0, 10));

        instructionButton.setBackground(new java.awt.Color(0, 0, 0));
        instructionButton.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        instructionButton.setForeground(new java.awt.Color(255, 255, 255));
        instructionButton.setText("INSTRUCTION");
        instructionButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        instructionButton.setEnabled(false);
        instructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionButtonActionPerformed(evt);
            }
        });
        leftPanel.add(instructionButton);

        practiceButton.setBackground(new java.awt.Color(0, 0, 0));
        practiceButton.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        practiceButton.setForeground(new java.awt.Color(255, 255, 255));
        practiceButton.setText("PRACTICE EXAM");
        practiceButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceButtonActionPerformed(evt);
            }
        });
        leftPanel.add(practiceButton);

        examinationButton.setBackground(new java.awt.Color(0, 0, 0));
        examinationButton.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        examinationButton.setForeground(new java.awt.Color(255, 255, 255));
        examinationButton.setText("EXAMINATION");
        examinationButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        examinationButton.setEnabled(false);
        examinationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinationButtonActionPerformed(evt);
            }
        });
        leftPanel.add(examinationButton);

        questionsButton.setBackground(new java.awt.Color(0, 0, 0));
        questionsButton.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        questionsButton.setForeground(new java.awt.Color(255, 255, 255));
        questionsButton.setText("QUESTIONS");
        questionsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        questionsButton.setEnabled(false);
        questionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionsButtonActionPerformed(evt);
            }
        });
        leftPanel.add(questionsButton);

        studentsButton.setBackground(new java.awt.Color(0, 0, 0));
        studentsButton.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        studentsButton.setForeground(new java.awt.Color(255, 255, 255));
        studentsButton.setText("STUDENTS");
        studentsButton.setActionCommand("\n");
        studentsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        studentsButton.setEnabled(false);
        studentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsButtonActionPerformed(evt);
            }
        });
        leftPanel.add(studentsButton);

        resultButton.setBackground(new java.awt.Color(0, 0, 0));
        resultButton.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        resultButton.setForeground(new java.awt.Color(255, 255, 255));
        resultButton.setText("RESULT");
        resultButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        resultButton.setEnabled(false);
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });
        leftPanel.add(resultButton);

        settingsButton.setBackground(new java.awt.Color(0, 0, 0));
        settingsButton.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(255, 255, 255));
        settingsButton.setText("SETTINGS");
        settingsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        settingsButton.setEnabled(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        leftPanel.add(settingsButton);

        jSplitPane1.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(204, 204, 204));
        rightPanel.setLayout(new java.awt.GridLayout(1, 1));

        desktopPaneMaster.setBackground(new java.awt.Color(204, 204, 204));
        desktopPaneMaster.setLayout(new java.awt.GridLayout(1, 1));

        contentImageLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contentImageLabel.setForeground(new java.awt.Color(51, 0, 0));
        contentImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/online examination.png"))); // NOI18N
        contentImageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contentImageLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        desktopPaneMaster.add(contentImageLabel);

        rightPanel.add(desktopPaneMaster);

        jSplitPane1.setRightComponent(rightPanel);

        contentPanel.add(jSplitPane1);

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        setLoginFrame();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void instructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionButtonActionPerformed
        setInstructionFrame();
    }//GEN-LAST:event_instructionButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        setSignupFrame();
    }//GEN-LAST:event_signupButtonActionPerformed

    private void studentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsButtonActionPerformed
        setStudentFrame();
    }//GEN-LAST:event_studentsButtonActionPerformed

    private void examinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinationButtonActionPerformed
        setExaminationFrame();
    }//GEN-LAST:event_examinationButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        setSettingFrame();
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void forgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordButtonActionPerformed
        try {
            String emailId = JOptionPane.showInputDialog(this, "Enter Your Registered Email Id", "Forgot Password", JOptionPane.YES_NO_OPTION);
            if (emailId != null || !emailId.isEmpty()) {
                if (!Config.userMap.containsKey(emailId)) {
                    JOptionPane.showMessageDialog(this, "This Email Id is not registered", "Main Frame - Forgot Password", JOptionPane.ERROR_MESSAGE);
                } else {
                    Users user = Config.userMap.get(emailId);   //giving key & will return User object
                    new EmailServices().sendMail(emailId, "Your Login Password Is :" + user.getPassword(), "Forgot Password");
                    JOptionPane.showMessageDialog(this, "Your Password Sent On Your Email Id Please Check It", "Main Frame - Forgot Password", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Forgot Password", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_forgotPasswordButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        setResultFrame();
    }//GEN-LAST:event_resultButtonActionPerformed

    private void questionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionsButtonActionPerformed
        setQuestionFrame();
    }//GEN-LAST:event_questionsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int ans = JOptionPane.showConfirmDialog(this, "Are you sure to exit?", "Logout", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            Config.mainFrame.setLogout();
            Config.mainFrame.setLoginFrame();
            signupButton.setEnabled(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void practiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practiceButtonActionPerformed
        setPracticeFrame();
    }//GEN-LAST:event_practiceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contentImageLabel;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JDesktopPane desktopPaneMaster;
    private javax.swing.JButton examinationButton;
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JButton instructionButton;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton practiceButton;
    private javax.swing.JButton questionsButton;
    private javax.swing.JButton resultButton;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton settingsButton;
    public javax.swing.JButton signupButton;
    private javax.swing.JButton studentsButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables

    public void setLoginFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.loginFrame);
            Config.loginFrame.setVisible(true);
            Config.loginFrame.setPreferredSize(getMinimumSize());
            Config.loginFrame.setClosable(true);
            Config.loginFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Login Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setSignupFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.signupFrame);
            Config.signupFrame.setVisible(true);
            Config.signupFrame.setPreferredSize(getMinimumSize());
            Config.signupFrame.setClosable(true);
            Config.signupFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Sign up Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setInstructionFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.instructionFrame);
            Config.instructionFrame.setVisible(true);
            Config.instructionFrame.setPreferredSize(getMinimumSize());
            Config.instructionFrame.setClosable(true);
            Config.instructionFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Instruction Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setStudentFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.studentFrame);
            Config.studentFrame.setVisible(true);
            Config.studentFrame.setPreferredSize(getMinimumSize());
            Config.studentFrame.setClosable(true);
            Config.studentFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Student Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setExaminationFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.examinationFrame);
            Config.examinationFrame.setVisible(true);
            Config.examinationFrame.setPreferredSize(getMinimumSize());
            Config.examinationFrame.setClosable(true);
            Config.examinationFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Student Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setSettingFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.settingFrame);
            Config.settingFrame.setVisible(true);
            Config.settingFrame.setPreferredSize(getMinimumSize());
            Config.settingFrame.setClosable(true);
            Config.settingFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Setting Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setQuestionFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.questionFrame);
            Config.questionFrame.setVisible(true);
            Config.questionFrame.setPreferredSize(getMinimumSize());
            Config.questionFrame.setClosable(true);
            Config.questionFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setResultFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.resultFrame);
            Config.resultFrame.setVisible(true);
            Config.resultFrame.setPreferredSize(getMinimumSize());
            Config.resultFrame.setClosable(true);
            Config.resultFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Result Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setPracticeFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.practiceFrame);
            Config.practiceFrame.setVisible(true);
            Config.practiceFrame.setPreferredSize(getMinimumSize());
            Config.practiceFrame.setClosable(true);
            Config.practiceFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Practice Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

//this method will add Users object from db to map
    public void setUserMap() {
        try {
            //will remove all existing objects
            Config.userMap.clear();
            List<Users> userList = UserServices.getUserList();
            for (Users user : userList) {
                //email as key & user object as value
                Config.userMap.put(user.getEmail(), user);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - User Map", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setQuestionMap() {
        try {
            //will remove all existing objects
            Config.questionMap.clear();
            List<Questions> quesionList = QuestionServices.getQuestionList();
            for (Questions question : quesionList) {
                //email as key & user object as value
                Config.questionMap.put(question.getQuestion(), question);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Question Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setPracticeQuestionMap() {
        try {
            //will remove all existing objects
            Config.practiceQuestionMap.clear();
            List<Questions> quesionList = QuestionServices.getPracticeQuestionList();
            for (Questions question : quesionList) {
                //email as key & user object as value
                Config.practiceQuestionMap.put(question.getQuestion(), question);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Practice Test Frame", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void setResultMap() {
        try {
            //will remove all existing objects
            Config.resultMap.clear();
            List<Results> resultList = ResultServices.getResultList();
            for (Results result : resultList) {
                //email as key & user object as value
                Config.resultMap.put(result.getResult(), result);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Result Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    //whenever admin login successfull we will call this method
    public void setAdminLogin() {
        studentsButton.setEnabled(true);
        questionsButton.setEnabled(true);
        resultButton.setEnabled(true);
        settingsButton.setEnabled(true);
        logoutButton.setEnabled(true);
        loginButton.setEnabled(false);
        Config.mainFrame.setDefaultFrame();

        this.setTitle("Login: " + Config.loginUser.getName());
    }

    //whenever student login successfull we will call this method
    public void setStudentLogin() {
        instructionButton.setEnabled(true);
        examinationButton.setEnabled(true);
        logoutButton.setEnabled(true);
        loginButton.setEnabled(false);
        Config.mainFrame.setDefaultFrame();

        this.setTitle("Login: " + Config.loginUser.getName());
    }

    public void setLogout() {
        studentsButton.setEnabled(false);
        questionsButton.setEnabled(false);
        resultButton.setEnabled(false);
        settingsButton.setEnabled(false);
        instructionButton.setEnabled(false);
        examinationButton.setEnabled(false);
        logoutButton.setEnabled(false);
        loginButton.setEnabled(true);
    }

    public void setDefaultFrame() {
        try {
            desktopPaneMaster.removeAll();
            desktopPaneMaster.add(Config.defaultFrame);
            Config.defaultFrame.setVisible(true);
            Config.defaultFrame.setPreferredSize(getMinimumSize());
            Config.defaultFrame.setClosable(false);
            Config.defaultFrame.setMaximum(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Default Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setSettingProperties() {
        try {
            File f = new File("conf.properties");
            FileOutputStream fout = null;
            fout = new FileOutputStream(f);
            Config.props.store(fout, "NLT INFOTECH");
            fout.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Setting Properties", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void getSettingProperties() {
        try {
            File f = new File("conf.properties");
            FileInputStream fin = null;
            if (f.exists()) {
                fin = new FileInputStream(f);
                Config.props.load(fin);
                fin.close();

                if (Config.props.containsKey("email")) {
                    Config.settingFrame.emailTextField.setText(Config.props.getProperty("email"));
                }
                if (Config.props.containsKey("email password")) {
                    Config.settingFrame.passwordTextField.setText(Config.props.getProperty("email password"));
                }
                if (Config.props.containsKey("exam time")) {
                    Config.settingFrame.timeTextField.setText(Config.props.getProperty("exam time"));
                }
                if (Config.props.containsKey("exam marks")) {
                    Config.settingFrame.marksTextField.setText(Config.props.getProperty("exam marks"));
                }
                if (Config.props.containsKey("instruction1")) {
                    Config.settingFrame.instruction1TextField.setText(Config.props.getProperty("instruction1"));
                    Config.instructionFrame.instruction1Label.setText(Config.props.getProperty("instruction1"));
                }
                if (Config.props.containsKey("instruction2")) {
                    Config.settingFrame.instruction2TextField.setText(Config.props.getProperty("instruction2"));
                    Config.instructionFrame.instruction2Label.setText(Config.props.getProperty("instruction2"));
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Main Frame - Setting Properties", JOptionPane.ERROR_MESSAGE);
        }
    }

}
