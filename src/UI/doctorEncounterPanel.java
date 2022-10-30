/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Encounter;
import Model.Person;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class doctorEncounterPanel extends javax.swing.JPanel {

    Admin admin;
    Encounter encounter;
    JPanel lowerPanel;
    Person person;
    /**
     * Creates new form doctorEncounterPanel
     */
    public doctorEncounterPanel(JPanel lowerPanel, Encounter e, Admin admin, Person person) {
        initComponents();
        this.lowerPanel = lowerPanel;
        this.admin = admin;
        this.encounter = e;
        this.person = person;
        getEncounterDetails();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        encounterNameTF = new javax.swing.JTextField();
        vitalSignTF = new javax.swing.JTextField();
        timeSlotTF = new javax.swing.JTextField();
        saveEncounter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        doctorTF = new javax.swing.JTextField();
        symptomsLbl = new javax.swing.JLabel();
        symptomsTF = new javax.swing.JTextField();
        diagnosisLbl = new javax.swing.JLabel();
        medicineLbl = new javax.swing.JLabel();
        diagnosisTF = new javax.swing.JTextField();
        medicineTF = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE ENCOUNTER");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("ENCOUNTER NAME :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("VITAL SIGN :");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("TIME SLOT :");

        encounterNameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                encounterNameTFKeyReleased(evt);
            }
        });

        vitalSignTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vitalSignTFKeyReleased(evt);
            }
        });

        timeSlotTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeSlotTFActionPerformed(evt);
            }
        });
        timeSlotTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timeSlotTFKeyReleased(evt);
            }
        });

        saveEncounter.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        saveEncounter.setText("SAVE ENCOUNTER");
        saveEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEncounterActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("CLEAR DETAILS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("<< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("CONSULTING DOCTOR :");

        doctorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorTFActionPerformed(evt);
            }
        });
        doctorTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                doctorTFKeyReleased(evt);
            }
        });

        symptomsLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        symptomsLbl.setText("Symptoms :");

        symptomsTF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        symptomsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomsTFActionPerformed(evt);
            }
        });

        diagnosisLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        diagnosisLbl.setText("Diagnosis :");

        medicineLbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        medicineLbl.setText("Medicines :");

        diagnosisTF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        medicineTF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(saveEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(timeSlotTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(medicineLbl))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(vitalSignTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(diagnosisLbl))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(encounterNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(symptomsLbl)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(symptomsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diagnosisTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(medicineTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(encounterNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symptomsLbl)
                    .addComponent(symptomsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitalSignTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(diagnosisLbl)
                    .addComponent(diagnosisTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timeSlotTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(medicineLbl)
                        .addComponent(medicineTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void saveEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEncounterActionPerformed
        // TODO add your handling code here:
        String name;
        String timeSlot;
        String vitalSign;
        String doctor;
        String symptom;
        String diagnosis;
        String medicine;

        try{
            name = encounterNameTF.getText();
            timeSlot = vitalSignTF.getText();
            vitalSign = timeSlotTF.getText();
            doctor = doctorTF.getText();
            symptom = symptomsTF.getText();
            diagnosis = diagnosisTF.getText();
            medicine = medicineTF.getText();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please recheck info enetered!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //adding encounter
//        person.getEncounterHistory().add(new Encounter(name, vitalSign, timeSlot, doctor, symptom, diagnosis, medicine));
        encounter.setEncounter(encounterNameTF.getText());
        encounter.setVitalsign(vitalSignTF.getText());
        encounter.setTimeSlot(timeSlotTF.getText());
        encounter.setDoctor(doctorTF.getText());
        encounter.setSymptoms(symptomsTF.getText());
        encounter.setDiagnosis(diagnosisTF.getText());
        encounter.setMedicine(medicineTF.getText());
        JOptionPane.showMessageDialog(this, "Encounter Resolved successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveEncounterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        encounterNameTF.setText("");
        vitalSignTF.setText("");
        timeSlotTF.setText("");
        doctorTF.setText("");
        symptomsTF.setText("");
        diagnosisTF.setText("");
        medicineTF.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        doctorViewEncountersPanel doctorViewEncountersPanel = new doctorViewEncountersPanel(lowerPanel, person, admin);
        lowerPanel.add("doctorViewEncountersPanel",doctorViewEncountersPanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void doctorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorTFActionPerformed

    private void timeSlotTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeSlotTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeSlotTFActionPerformed

    private void encounterNameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encounterNameTFKeyReleased
        // TODO add your handling code here:
         String str ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(encounterNameTF.getText());
        if(!match.matches()){
            encounterNameTF.setText("Invalid input!");
        }
        else {
            encounterNameTF.setText("");
        }
    }//GEN-LAST:event_encounterNameTFKeyReleased

    private void vitalSignTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vitalSignTFKeyReleased
        // TODO add your handling code here:
         String str ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(vitalSignTF.getText());
        if(!match.matches()){
            vitalSignTF.setText("Invalid input!");
        }
        else {
            vitalSignTF.setText("");
        }
    }//GEN-LAST:event_vitalSignTFKeyReleased

    private void doctorTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctorTFKeyReleased
        // TODO add your handling code here:
         String str ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(doctorTF.getText());
        if(!match.matches()){
            doctorTF.setText("Invalid input!");
        }
        else {
            doctorTF.setText("");
        }
    }//GEN-LAST:event_doctorTFKeyReleased

    private void timeSlotTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timeSlotTFKeyReleased
        // TODO add your handling code here:
         String str ="^[0-9]{0,10}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(timeSlotTF.getText());
        if(!match.matches()){
            timeSlotTF.setText("Invalid! Only numeric input");
        }
        else {
            timeSlotTF.setText("");
        }
    }//GEN-LAST:event_timeSlotTFKeyReleased

    private void symptomsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomsTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JTextField diagnosisTF;
    private javax.swing.JTextField doctorTF;
    private javax.swing.JTextField encounterNameTF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel medicineLbl;
    private javax.swing.JTextField medicineTF;
    private javax.swing.JButton saveEncounter;
    private javax.swing.JLabel symptomsLbl;
    private javax.swing.JTextField symptomsTF;
    private javax.swing.JTextField timeSlotTF;
    private javax.swing.JTextField vitalSignTF;
    // End of variables declaration//GEN-END:variables

private void getEncounterDetails() {
        encounterNameTF.setText(String.valueOf(encounter.getEncounter()));
//        encounterNameTF.setEnabled(true);
        vitalSignTF.setText(encounter.getVitalsign());
//        vitalSignTF.setEnabled(true);
        timeSlotTF.setText(encounter.getTimeSlot());
//        timeSlotTF.setEnabled(true);
        doctorTF.setText(String.valueOf(encounter.getDoctor()));
//        doctorTF.setEnabled(true);
        symptomsTF.setText(String.valueOf(encounter.getSymptoms()));
        diagnosisTF.setText(String.valueOf(encounter.getDiagnosis()));
        medicineTF.setText(String.valueOf(encounter.getMedicine()));

//        saveDetailsButton.setEnabled(false);
    }

}
