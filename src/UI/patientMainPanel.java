/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import Model.Resident;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kunal
 */
public final class patientMainPanel extends javax.swing.JPanel {
    Person person;
    Admin admin;
    JPanel lowerPanel;
    private ArrayList<Person> patientDir;
    int userName;
    String passWord;
    /**
     * Creates new form patientMainPanel
     */
    public patientMainPanel(JPanel lowerPanel, Admin admin, int username, String password) {
        initComponents();
        this.lowerPanel =lowerPanel;
        this.admin = admin;
        this.userName = username;
        this.passWord = password;
        loadPatientTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewEncounterButton = new javax.swing.JButton();
        updatePatientButton = new javax.swing.JButton();

        personPanel.setBackground(new java.awt.Color(204, 255, 255));

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("<< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Age", "Gender", "Illness", "Pulse", "BP", "Past Illness", "Residence", "isPatient"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientTable);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("XYZ HOSPITAL PATIENT DIRECTORY");

        viewEncounterButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        viewEncounterButton.setText("VIEW ENCOUNTERS");
        viewEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEncounterButtonActionPerformed(evt);
            }
        });

        updatePatientButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        updatePatientButton.setText("UPDATE ENTRY");
        updatePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personPanelLayout = new javax.swing.GroupLayout(personPanel);
        personPanel.setLayout(personPanelLayout);
        personPanelLayout.setHorizontalGroup(
            personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(237, 237, 237))
            .addGroup(personPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewEncounterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(updatePatientButton)
                        .addGap(156, 156, 156))
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        personPanelLayout.setVerticalGroup(
            personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personPanelLayout.createSequentialGroup()
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backButton)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(personPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewEncounterButton)
                    .addComponent(updatePatientButton))
                .addContainerGap(447, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(personPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.patientDir = admin.getPatientDirectory();
        commonHomeScreenPanel commonHomeScreenPanel = new commonHomeScreenPanel(lowerPanel, patientDir); 
        lowerPanel.add("commonHomeScreenPanel", commonHomeScreenPanel);
        CardLayout cardLayout = (CardLayout) lowerPanel.getLayout();
        cardLayout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEncounterButtonActionPerformed
        // TODO add your handling code here:
        int row = patientTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a patient record!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person = (Person)patientTable.getValueAt(row, 1);
        viewPatientEncounterPanel viewEncounterJPanel = new viewPatientEncounterPanel(lowerPanel, person, admin, person.getId(), person.getPassword());
        lowerPanel.add("EncounterPanel",viewEncounterJPanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_viewEncounterButtonActionPerformed

    private void updatePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow;
        selectedRow = patientTable.getSelectedRow();
        if (!(selectedRow < 0)) {
            Person person = (Person) patientTable.getValueAt(selectedRow, 1);
            patientUpdatePatient patientUpdatePatient = new patientUpdatePatient(lowerPanel, person, admin, person.getId(), person.getPassword());
            lowerPanel.add("patientUpdatePatient", patientUpdatePatient);
            CardLayout cardLayout = (CardLayout) lowerPanel.getLayout();
            cardLayout.next(lowerPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Select a record!");
        }
    }//GEN-LAST:event_updatePatientButtonActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientTable;
    private javax.swing.JPanel personPanel;
    private javax.swing.JButton updatePatientButton;
    private javax.swing.JButton viewEncounterButton;
    // End of variables declaration//GEN-END:variables

    public void loadPatientTable() {
        int rowCount = patientTable.getRowCount();
        ArrayList<Person> patientDirectory = new ArrayList<>();

        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Person p : admin.getPersonDirectory()) {
        if (p.isIsPatient()==true){
        System.out.println(p.isIsPatient());
        if(p.getId() == userName && passWord.equals(p.getPassword())) {
             patientDirectory.add(p);
        }
            }
        }
        admin.setPatientDirectory(patientDirectory);

        for (Person p : admin.getPatientDirectory()) {
            Object row[] = new Object[10];
            row[0] = p.getId();
            row[1] = p;
            row[2]= p.getGender();
            row[3] = p.getAge();
            row[4]= p.getIllness();
            row[5] = p.getHB();
            row[6]=p.getBloodPressure();
            row[7]= p.getPastIllness();
            Resident residence = p.getResidence();
            row[8] = residence.getHouse()+" "+residence.getCommunity()+", "+residence.getCity();
            row[9] = p.isIsPatient();
            model.addRow(row);
}
}
    
}

