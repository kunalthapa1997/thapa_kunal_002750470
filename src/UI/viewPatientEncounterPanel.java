/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Encounter;
import Model.Person;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kunal
 */
public class viewPatientEncounterPanel extends javax.swing.JPanel {
    
    Person person;
    Admin admin;
    JPanel lowerPanel;
    int userName;
    String passWord;
    /**
     * Creates new form viewPatientEncounterPanel
     */
    public viewPatientEncounterPanel(JPanel lowerPanel, Person person, Admin admin, int username, String password) {
        initComponents();
        this.person = person;
        this.lowerPanel = lowerPanel;
        this.admin = admin;
        this.userName = username;
        this.passWord = password;
        loadEncounterTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        encounterTable = new javax.swing.JTable();
        createEncounterButton = new javax.swing.JButton();
        deleteEncounterButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("MAINTAIN PATIENT ENCOUNTER");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        encounterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Encounter Name", "Time Slot", "Vital Sign", "Consulting Doctor", "Symptoms", "Diagnosis", "Medicines"
            }
        ));
        jScrollPane1.setViewportView(encounterTable);

        createEncounterButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        createEncounterButton.setText("CREATE");
        createEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEncounterButtonActionPerformed(evt);
            }
        });

        deleteEncounterButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        deleteEncounterButton.setText("DELETE");
        deleteEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEncounterButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("<< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createEncounterButton)
                        .addGap(46, 46, 46)
                        .addComponent(deleteEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jLabel1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEncounterButtonActionPerformed
        // TODO add your handling code here:
        patientEncounterPanel createEncounter = new patientEncounterPanel(lowerPanel, person, admin, this.userName, this.passWord);
        lowerPanel.add("CreateEncounterPanel",createEncounter);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_createEncounterButtonActionPerformed

    private void deleteEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEncounterButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = encounterTable.getSelectedRow();
        if (!(selectedRow < 0)) {
            Encounter encounter = (Encounter) encounterTable.getValueAt(selectedRow, 0);
            ArrayList<Encounter> encounterHistory = person.getEncounterHistory();
            encounterHistory.remove(encounter);
            loadEncounterTable();
    }//GEN-LAST:event_deleteEncounterButtonActionPerformed
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        patientMainPanel patientPanel = new patientMainPanel(lowerPanel, admin, this.userName, this.passWord);
        lowerPanel.add("patientMainPanel",patientPanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createEncounterButton;
    private javax.swing.JButton deleteEncounterButton;
    private javax.swing.JTable encounterTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private void loadEncounterTable() {
        int rowCount = encounterTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) encounterTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Model.Encounter e : person.getEncounterHistory()) {
            Object row[] = new Object[7];
            row[0] = e;
            row[1] = e.getVitalsign();
            row[2] = e.getTimeSlot();
            row[3]  = e.getDoctor();
            row[4] = e.getSymptoms();
            row[5] = e.getDiagnosis();
            row[6] = e.getMedicine();
            model.addRow(row);
        }
    }
}
