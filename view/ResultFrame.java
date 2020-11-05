package org.nlt.view;

import java.util.Collection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nlt.include.Config;
import org.nlt.model.Results;
import org.nlt.services.ResultServices;

public class ResultFrame extends javax.swing.JInternalFrame {

    public ResultFrame() {
        try {
            setTitle("Result Frame");
            initComponents();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Result Frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)), "Students Result", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 0, 102))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        resultTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(resultTable);

        jPanel2.add(jScrollPane1);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/computer.jpg"))); // NOI18N
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables

public void setResultTableData()
{
    try {
            Collection<Results> resultValues = Config.resultMap.values();
            String[] cols = {"STUDENT", "RESULT", "MARKS OBTAINED", "TOTAL MARKS","EXAM DATE"};
            String[][] data = new String[resultValues.size()][cols.length];
            int i = 0;
            for (Results result : resultValues) {
                data[i][0] = result.getUser().getName();
                data[i][1] = result.getResult();
                data[i][2] = result.getMarksObtained()+"";
                data[i][3] = result.getTotalMarks()+"";
                data[i][4] = result.getCreated()+"";
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, cols);
            resultTable.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Result Frame2", JOptionPane.ERROR_MESSAGE);
        }
}

public void setStudentResult(String rslt,int marksObtained,int totalMarks)
{
    try
    {
     Results result = new Results();
            result.setUser(Config.loginUser);
            result.setResult(rslt);
            result.setMarksObtained(marksObtained);
            result.setTotalMarks(totalMarks);
            result.setCreated(new Date());
            result.setStatus(1);
            ResultServices.addResult(result);
            } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Result Frame1", JOptionPane.ERROR_MESSAGE);
        }
}

}
