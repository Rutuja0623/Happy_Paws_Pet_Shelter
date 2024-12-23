/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chaitanya
 */
package userinterface.FieldWorkerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NgoOfficeOrganization;
import Business.Organization.PetShelterOrganization;
import Business.POJO.Pet;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReportStrayAnimalRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lakshit S Talreja
 */
public class RegisterAnimalJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private NgoOfficeOrganization ngoOfficeOrganization; 
    private PetShelterOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Pet pet;
    private WorkRequest workQ;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private static Integer petCounter = 123;
    
    /**
     * Creates new form RegisterAnimalJPanel
     */
    public RegisterAnimalJPanel(JPanel userProcessContainer, UserAccount account, PetShelterOrganization organization, Enterprise enterprise, EcoSystem business, WorkRequest workQ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ngoOfficeOrganization = ngoOfficeOrganization;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.workQ = workQ;
        petCounter++;
        petIDTextField.setText(("PET"+petCounter));
        reportIDTextField.setText(((ReportStrayAnimalRequest) workQ).getReportId());
        animalTypeTextField.setText(((ReportStrayAnimalRequest) workQ).getAnimalType());
        addressTextField.setText(((ReportStrayAnimalRequest) workQ).getStreet());
        cityTextField.setText(((ReportStrayAnimalRequest) workQ).getCity());
        zipTextField.setText(Integer.toString(((ReportStrayAnimalRequest) workQ).getZipCode()));
        issueTypeTextField.setText(((ReportStrayAnimalRequest) workQ).getIssueType());
        urgencyTypeTextField.setText(((ReportStrayAnimalRequest) workQ).getUrgencyType());
        commentsTextArea.setText(((ReportStrayAnimalRequest) workQ).getComments());
        reportedUserTextField.setText(((ReportStrayAnimalRequest) workQ).getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registerAnimalBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        reportIDTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        zipTextField = new javax.swing.JTextField();
        reportedUserTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        animalTypeTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        issueTypeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        urgencyTypeTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        petIDTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        availableForAdoptionCB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 850));
        setSize(new java.awt.Dimension(1200, 850));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Register a Stray Animal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        registerAnimalBtn.setBackground(new java.awt.Color(0, 153, 255));
        registerAnimalBtn.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        registerAnimalBtn.setText("Register");
        registerAnimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAnimalBtnActionPerformed(evt);
            }
        });
        add(registerAnimalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, 121, 41));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setText("Edit Comments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, -1, 41));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Comments:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        cityTextField.setEditable(false);
        cityTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cityTextField.setEnabled(false);
        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 140, -1));

        reportIDTextField.setEditable(false);
        reportIDTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        reportIDTextField.setEnabled(false);
        reportIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportIDTextFieldActionPerformed(evt);
            }
        });
        add(reportIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 140, -1));

        addressTextField.setEditable(false);
        addressTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        addressTextField.setEnabled(false);
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 142, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Reported User:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        zipTextField.setEditable(false);
        zipTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        zipTextField.setEnabled(false);
        add(zipTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 138, -1));

        reportedUserTextField.setEditable(false);
        reportedUserTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        reportedUserTextField.setEnabled(false);
        add(reportedUserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 140, -1));

        commentsTextArea.setEditable(false);
        commentsTextArea.setColumns(20);
        commentsTextArea.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        commentsTextArea.setRows(5);
        commentsTextArea.setEnabled(false);
        jScrollPane1.setViewportView(commentsTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 197, 86));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Report ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Street Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Animal Type: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Zip:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, -1, -1));

        animalTypeTextField.setEditable(false);
        animalTypeTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        animalTypeTextField.setEnabled(false);
        animalTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalTypeTextFieldActionPerformed(evt);
            }
        });
        add(animalTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 142, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Issue:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        issueTypeTextField.setEditable(false);
        issueTypeTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        issueTypeTextField.setEnabled(false);
        issueTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueTypeTextFieldActionPerformed(evt);
            }
        });
        add(issueTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 140, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Urgency:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        urgencyTypeTextField.setEditable(false);
        urgencyTypeTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        urgencyTypeTextField.setEnabled(false);
        urgencyTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urgencyTypeTextFieldActionPerformed(evt);
            }
        });
        add(urgencyTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 138, -1));

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, -1, 41));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Pet ID:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        petIDTextField.setEditable(false);
        petIDTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        petIDTextField.setEnabled(false);
        add(petIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 143, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Available for Adoption: ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        availableForAdoptionCB.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        availableForAdoptionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        add(availableForAdoptionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 143, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/adopt_1200x850.jpg"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void registerAnimalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAnimalBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        pet = new Pet();
        pet.setAnimalType(((ReportStrayAnimalRequest) workQ).getAnimalType());
        pet.setPetId(petIDTextField.getText());
        pet.setCurrentHealthStatus("Healthy");
        pet.setNameNGO(enterprise.getName());
        pet.setIsAvailableForAdoption(availableForAdoptionCB.getSelectedItem().toString() == "Yes" ? true : false);
        pet.setIsStray(true);
        pet.setHasBeenReportedForAbuse(false);
        pet.setNamePC(organization.getName());
        dB4OUtil.storeSystem(business);
        pet.setIsAdopted(false);
        ((ReportStrayAnimalRequest) workQ).setPet(pet);
        ((ReportStrayAnimalRequest) workQ).setFieldWorkerAssigned(userAccount);
        workQ.setResolveDate(new Date());
        workQ.setStatus("Resolved");
        business.getPetDirInstance().getListOfPets().add(pet);
        JOptionPane.showMessageDialog(null, "Pet registered with " + enterprise.getName());
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_registerAnimalBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        commentsTextArea.setEnabled(true);
        commentsTextArea.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void reportIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportIDTextFieldActionPerformed

    private void animalTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animalTypeTextFieldActionPerformed

    private void issueTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueTypeTextFieldActionPerformed

    private void urgencyTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urgencyTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urgencyTypeTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField animalTypeTextField;
    private javax.swing.JComboBox<String> availableForAdoptionCB;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextArea commentsTextArea;
    private javax.swing.JTextField issueTypeTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField petIDTextField;
    private javax.swing.JButton registerAnimalBtn;
    private javax.swing.JTextField reportIDTextField;
    private javax.swing.JTextField reportedUserTextField;
    private javax.swing.JTextField urgencyTypeTextField;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
}
