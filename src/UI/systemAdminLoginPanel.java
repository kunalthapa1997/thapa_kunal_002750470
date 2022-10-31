/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class systemAdminLoginPanel extends javax.swing.JPanel {
    JPanel lowerPanel;
    Admin admin;
    private ArrayList<Person> patientDir;
    /**
     * Creates new form systemAdminLoginPanel
     */
    public systemAdminLoginPanel(JPanel lowerPanel, Admin admin) {
        initComponents();
        this.lowerPanel= lowerPanel;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftCredentialPanel = new javax.swing.JPanel();
        leftPanelLbl = new javax.swing.JLabel();
        leftPanelLbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rightPanelLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        clearBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();

        leftCredentialPanel.setBackground(new java.awt.Color(0, 51, 51));

        leftPanelLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        leftPanelLbl.setForeground(new java.awt.Color(255, 255, 255));
        leftPanelLbl.setText("Boston National");

        leftPanelLbl1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        leftPanelLbl1.setForeground(new java.awt.Color(255, 255, 255));
        leftPanelLbl1.setText("Hospital");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patient Login Portal");

        javax.swing.GroupLayout leftCredentialPanelLayout = new javax.swing.GroupLayout(leftCredentialPanel);
        leftCredentialPanel.setLayout(leftCredentialPanelLayout);
        leftCredentialPanelLayout.setHorizontalGroup(
            leftCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftCredentialPanelLayout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
            .addGroup(leftCredentialPanelLayout.createSequentialGroup()
                .addGroup(leftCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftCredentialPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(leftPanelLbl))
                    .addGroup(leftCredentialPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(leftPanelLbl1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftCredentialPanelLayout.setVerticalGroup(
            leftCredentialPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftCredentialPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(leftPanelLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftPanelLbl1)
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(212, 212, 212))
        );

        rightPanelLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        rightPanelLbl.setText("HMS");

        passwordLbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        passwordLbl.setText("Password :");

        usernameLbl.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        usernameLbl.setText("Username :");

        usernameTxt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        passwordTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordTxt.setText("jPasswordField1");

        clearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(clearBtn)
                            .addGap(43, 43, 43)
                            .addComponent(loginBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLbl)
                            .addGap(18, 18, 18)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(usernameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(rightPanelLbl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(rightPanelLbl)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(loginBtn))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 309, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(leftCredentialPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 476, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(leftCredentialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        usernameTxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String userName = usernameTxt.getText();
        String password = passwordTxt.getText();
        
        if(userName.equals("sysadmin") && password.equals("syspassword")) {
            AdminWindow adminWindow = new AdminWindow(lowerPanel, admin);
            lowerPanel.add("AdminWindow", adminWindow);
            CardLayout layout = (CardLayout)lowerPanel.getLayout();
            layout.next(lowerPanel);
        } else {
             JOptionPane.showMessageDialog(null, "Please enter correct username/password", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel leftCredentialPanel;
    private javax.swing.JLabel leftPanelLbl;
    private javax.swing.JLabel leftPanelLbl1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel rightPanelLbl;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
