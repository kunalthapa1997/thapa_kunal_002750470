/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class commonHomeScreenPanel extends javax.swing.JPanel {
    Admin admin;
    Person person;
    JPanel lowerPanel;
    /**
     * Creates new form commonHomeScreenPanel
     * @param <error>
     */
    public commonHomeScreenPanel(JPanel lowerPanel, ArrayList<Person> personDirectory) {
        admin = new Admin();
        initComponents();
        this.lowerPanel= lowerPanel;
        admin.setPersonDirectory(personDirectory);
        setSize(830,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeLowerPanel = new javax.swing.JPanel();
        adminButton = new javax.swing.JButton();
        commAdminBtn = new javax.swing.JButton();
        adminButton2 = new javax.swing.JButton();
        patientBtn = new javax.swing.JButton();
        adminButton4 = new javax.swing.JButton();

        homeLowerPanel.setBackground(new java.awt.Color(204, 255, 255));

        adminButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminButton.setText("ADMIN");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        commAdminBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        commAdminBtn.setText("Community Admin");
        commAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commAdminBtnActionPerformed(evt);
            }
        });

        adminButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminButton2.setText("Doctor");
        adminButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton2ActionPerformed(evt);
            }
        });

        patientBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        patientBtn.setText("Patient");
        patientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBtnActionPerformed(evt);
            }
        });

        adminButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminButton4.setText("Hospital Admin");
        adminButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLowerPanelLayout = new javax.swing.GroupLayout(homeLowerPanel);
        homeLowerPanel.setLayout(homeLowerPanelLayout);
        homeLowerPanelLayout.setHorizontalGroup(
            homeLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLowerPanelLayout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addGroup(homeLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(commAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(440, 440, 440))
        );
        homeLowerPanelLayout.setVerticalGroup(
            homeLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLowerPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(commAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homeLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
        AdminWindow adminWindow = new AdminWindow(lowerPanel, admin);
        lowerPanel.add("AdminWindow", adminWindow);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_adminButtonActionPerformed

    private void commAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commAdminBtnActionPerformed
        // TODO add your handling code here:
        communityLoginPanel commWindow = new communityLoginPanel(lowerPanel, admin);
        lowerPanel.add("AdminWindow", commWindow);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_commAdminBtnActionPerformed

    private void adminButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButton2ActionPerformed

    private void patientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBtnActionPerformed
        // TODO add your handling code here:
        patientLoginPanel patientWindow = new patientLoginPanel(lowerPanel, admin);
        lowerPanel.add("patientLoginPanel", patientWindow);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_patientBtnActionPerformed

    private void adminButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton adminButton2;
    private javax.swing.JButton adminButton4;
    private javax.swing.JButton commAdminBtn;
    private javax.swing.JPanel homeLowerPanel;
    private javax.swing.JButton patientBtn;
    // End of variables declaration//GEN-END:variables
}
