/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import Model.Resident;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class addPersonByCommunityPanel extends javax.swing.JPanel {
    private JPanel lowerPanel;
    Admin admin;
    /**
     * Creates new form addPersonByCommunityPanel
     */
    public addPersonByCommunityPanel(JPanel lowerPanel, Admin admin) {
        initComponents();
        this.admin = admin;
        this.lowerPanel = lowerPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPersonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        genderTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        communityTF = new javax.swing.JTextField();
        cityTF = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        saveDetailsButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        houseTF = new javax.swing.JTextField();
        nameVal = new javax.swing.JLabel();
        genderVal = new javax.swing.JLabel();
        ageVal = new javax.swing.JLabel();
        pulseVal = new javax.swing.JLabel();
        bpVal = new javax.swing.JLabel();

        addPersonPanel.setBackground(new java.awt.Color(0, 102, 102));
        addPersonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADD NEW PERSON");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addPersonPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("NAME :");
        addPersonPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("GENDER :");
        addPersonPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("AGE :");
        addPersonPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("COMMUNITY :");
        addPersonPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("CITY :");
        addPersonPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 154, -1));

        genderTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                genderTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(genderTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 154, -1));

        ageTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 154, -1));
        addPersonPanel.add(communityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 140, -1));
        addPersonPanel.add(cityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 140, -1));

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("<< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 107, 30));

        saveDetailsButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        saveDetailsButton.setText("SAVE DETAILS");
        saveDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDetailsButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(saveDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 30));

        clearButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 114, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("HOUSE :");
        addPersonPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        houseTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseTFActionPerformed(evt);
            }
        });
        addPersonPanel.add(houseTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 150, -1));
        addPersonPanel.add(nameVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, 20));
        addPersonPanel.add(genderVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 20));
        addPersonPanel.add(ageVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 160, 20));
        addPersonPanel.add(pulseVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 134, 150, 20));
        addPersonPanel.add(bpVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPersonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addPersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyReleased
        // TODO add your handling code here:
        String Name ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(Name);
        Matcher match= p.matcher(nameTF.getText());
        if(!match.matches()){
            nameVal.setText("Invalid input!");
        }
        else {
            nameVal.setText("");
        }
    }//GEN-LAST:event_nameTFKeyReleased

    private void genderTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genderTFKeyReleased
        // TODO add your handling code here:
        String Name ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(Name);
        Matcher match= p.matcher(genderTF.getText());
        if(!match.matches()){
            genderVal.setText("Invalid input!");
        }
        else {
            genderVal.setText("");
        }
    }//GEN-LAST:event_genderTFKeyReleased

    private void ageTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTFKeyReleased
        // TODO add your handling code here:
        String age ="^[0-9]{0,10}$";
        Pattern p = Pattern.compile(age);
        Matcher match= p.matcher(ageTF.getText());
        if(!match.matches()){
            ageVal.setText("Invalid! Only numeric input");
        }
        else {
            ageVal.setText("");
        }
    }//GEN-LAST:event_ageTFKeyReleased

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        communityMainPanel communityMainPanel = new communityMainPanel(lowerPanel, admin);
        lowerPanel.add("communityMainPanel",communityMainPanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDetailsButtonActionPerformed
        // TODO add your handling code here:
        String name;
        int age;
        String gender;
        String city;
        String community;
        String house;
        String illness;
        String pastIllness;
        double BP;
        double HB;
        boolean isPatient;

        try{
            name= nameTF.getText();
            gender = genderTF.getText();
            age = Integer.parseInt(ageTF.getText());
            city = cityTF.getText();
            community = communityTF.getText();
            house = houseTF.getText();
            illness = "Null";
            pastIllness = "Null";

//            if (isPatientCB.isSelected()) {
//                patientStatusTF.setText("YES");
//                isPatient = true;
//            } else {
//                patientStatusTF.setText("NO");
                isPatient = false;
//            }
            BP = 0;
            HB = 0;

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please recheck info entered!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //adding person to directory
        Resident residence = new Resident(house, community, city);
        Person person  = new Person(name, age, gender, illness, pastIllness, residence, isPatient, BP, HB);
        this.admin.addPerson(person);
        JOptionPane.showMessageDialog(this, "Person added successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_saveDetailsButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        nameTF.setText("");
        genderTF.setText("");
        ageTF.setText("");
//        illnessTF.setText("");
//        pastIllnessTF.setText("");
//        hgTF.setText("");
//        bpTF.setText("");
        houseTF.setText("");
        communityTF.setText("");
        cityTF.setText("");
        //        isPatientCB.isSelected(false);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void houseTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPersonPanel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel ageVal;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bpVal;
    private javax.swing.JTextField cityTF;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField communityTF;
    private javax.swing.JTextField genderTF;
    private javax.swing.JLabel genderVal;
    private javax.swing.JTextField houseTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel nameVal;
    private javax.swing.JLabel pulseVal;
    private javax.swing.JButton saveDetailsButton;
    // End of variables declaration//GEN-END:variables
}
