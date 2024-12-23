/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRole;

import Business.DB4OUtil.DB4OUtil;
import Business.POJO.Users;
import Business.EcoSystem;
import Business.Regex.Vald;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JoinPetSchoolRequest;
import EmailUtility.EmailUtility;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.httpclient.URIException;
import org.apache.log4j.Logger;

/**
 *
 * @author chaitanya
 */
public class UserWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Users users;
    private EcoSystem business;
   
            
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private final Logger logger = Logger.getLogger(this.getClass());
    private EmailUtility em=new EmailUtility();
    private char[] genratedOTP = em.createOtp();
           
           
    
    
    public UserWorkAreaJPanel(JPanel userProcessContainer, Users users, EcoSystem business, Boolean isNewUser) {
        initComponents();

        if(!isNewUser){
            disableSignUPArea();
        }
        else{
            enableSignUPArea();
        }
        this.userProcessContainer = userProcessContainer;
        this.users = users;
        this.business = business;
        
        logger.info("User logged into UserWorkAreaJPanel");
    }
    
    private void disableSignUPArea() {
        jPanel1.setVisible(false);
        reportAnimalBtn.setVisible(true);
        statusReportAnimalBtn.setVisible(true);
        jButton3.setVisible(true);
        jButton5.setVisible(true);
        jButton2.setVisible(true);
    }
    
    private void enableSignUPArea(){
        jPanel1.setVisible(true);
        reportAnimalBtn.setVisible(false);
        statusReportAnimalBtn.setVisible(false);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jButton2.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportAnimalBtn = new javax.swing.JButton();
        statusReportAnimalBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cityJF = new javax.swing.JTextField();
        zipJF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameJF = new javax.swing.JTextField();
        UserName = new javax.swing.JLabel();
        emailJF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        OTPTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 850));
        setSize(new java.awt.Dimension(1200, 850));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportAnimalBtn.setBackground(new java.awt.Color(0, 153, 255));
        reportAnimalBtn.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        reportAnimalBtn.setText("Report a Stray Animal");
        reportAnimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportAnimalBtnActionPerformed(evt);
            }
        });
        add(reportAnimalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 43));

        statusReportAnimalBtn.setBackground(new java.awt.Color(0, 153, 255));
        statusReportAnimalBtn.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        statusReportAnimalBtn.setText("View status of reported Animal");
        statusReportAnimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusReportAnimalBtnActionPerformed(evt);
            }
        });
        add(statusReportAnimalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, 43));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton3.setText("Request to Adopt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 198, 43));

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton5.setText("Request to Join Training School");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 290, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jButton2.setText("View Status of Pet School Admission Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 450, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameJTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 240, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 205, -1, -1));

        cityJF.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cityJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJFActionPerformed(evt);
            }
        });
        jPanel1.add(cityJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 240, -1));

        zipJF.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel1.add(zipJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 240, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Zip code");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Full Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        nameJF.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel1.add(nameJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 240, -1));

        UserName.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        UserName.setText("City");
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, 30));

        emailJF.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        emailJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJFActionPerformed(evt);
            }
        });
        jPanel1.add(emailJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 240, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        passwordJTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jPanel1.add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 240, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 104, 41));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Customer Sign Up ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setText("OTP");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 40, -1));

        OTPTextField.setFont(emailJF.getFont());
        OTPTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTPTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(OTPTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 240, 30));

        jButton4.setText("Send OTP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jButton6.setText("Check OTP");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 630, 520));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/common.jpg"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void reportAnimalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportAnimalBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        
        try {
            userProcessContainer.add("ReportAnimalJPanel", new ReportAnimalJPanel(userProcessContainer, users , business));
        } catch (URIException ex) {
            java.util.logging.Logger.getLogger(UserWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(UserWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reportAnimalBtnActionPerformed

    private void statusReportAnimalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusReportAnimalBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("StatusReportAnimalJPanel", new StatusReportAnimalJPanel(userProcessContainer, users, business));
        layout.next(userProcessContainer);
    
    }//GEN-LAST:event_statusReportAnimalBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AdoptAPetDashboard", new AdoptAPetDashboard(userProcessContainer, users, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(validateEmptyFields()){
            String userName = nameJTextField.getText();
            String password = String.valueOf(passwordJTextField.getPassword());
            String fullname=nameJF.getText();
            String emailId=emailJF.getText();
            String city=cityJF.getText();
            String zip=zipJF.getText();

            business.getUserDirInstance().createUserAccount(userName, password,fullname, emailId, city, zip);
            JOptionPane.showMessageDialog(null, "Save Successfull");
            dB4OUtil.storeSystem(business);
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
            //EmailUtility em=new EmailUtility();
            System.out.println(emailId);
            
            
            
            
            
             if (        String.valueOf(OTPTextField.getText()).equals(String.valueOf(genratedOTP)))
        {
            
         em.sendMail(emailId, "Account Registration Successfull", "You have been Successfully Registered. Welcome to the Happy Paws");
        
            logger.info(nameJTextField.getText() + " user signed up successfully and email sent to " + emailJF.getText());
        }
             else
                 
             {
                JOptionPane.showMessageDialog(null, "You have entered the wrong OTP. Please check once again");

             
             }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cityJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJFActionPerformed

    private void emailJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJFActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("JoinPetSchoolReuqestJPanel", new JoinPetSchoolReuqestJPanel(userProcessContainer, users, business));
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("StatusJoinPetSchoolJPanel", new StatusJoinPetSchoolJPanel(userProcessContainer, users, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
           // char[] otp = em.createOtp();
            
            System.out.println(genratedOTP);
            String emailId=emailJF.getText();

            
             em.sendOTPMail(emailId, "Email Varification OTP", "Please find an OTP for email varification",String.valueOf(genratedOTP));
            
            logger.info(nameJTextField.getText() + " Varification email sent to " + emailJF.getText());
            
            
            
            
            
           
            

      
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void OTPTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTPTextFieldActionPerformed
        // TODO add your handling code here:
        
        
        
            
    }//GEN-LAST:event_OTPTextFieldActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                    System.out.println(genratedOTP);

        if (        String.valueOf(OTPTextField.getText()).equals(String.valueOf(genratedOTP)))
        {
                   JOptionPane.showMessageDialog(null, "Email Varification Successfull");

        }
        
        else
            
        {
                JOptionPane.showMessageDialog(null, "You have entered the wrong OTP. Please check once again");

        }
    }//GEN-LAST:event_jButton6ActionPerformed
    
    public Boolean validateEmptyFields(){
        if(zipJF.getText().isEmpty() || nameJTextField.getText().isEmpty() || nameJF.getText().isEmpty() || emailJF.getText().isEmpty() || cityJF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter mandatory fields");
            return false;
        }
        if(passwordJTextField.getPassword().toString().isEmpty())
        {JOptionPane.showMessageDialog(null, "Please enter mandatory fields");
        return false;
        }
        else{
            if(!business.getUserDirInstance().checkIfUsernameIsUnique(nameJTextField.getText())){
                JOptionPane.showMessageDialog(null, "Please enter unique username");
                return false;
            }
            if(!Vald.getInstance().validEmail(emailJF.getText())){
                JOptionPane.showMessageDialog(null, "Please enter valid email");
                return false;
            }
            if(!Vald.getInstance().validName(nameJF.getText())){
                JOptionPane.showMessageDialog(null, "Please enter valid name");
                return false;
            }
            if(!Vald.getInstance().validName(cityJF.getText())){
                JOptionPane.showMessageDialog(null, "Please enter valid city name");
                return false;
            }
            if(!Vald.getInstance().validNum(zipJF.getText())){
                JOptionPane.showMessageDialog(null, "Please enter zip code in numbers");
                return false;
            }
            if(zipJF.getText().length() != 5){
                JOptionPane.showMessageDialog(null, "Please enter a 5 digit zipcode");
                return false;
            }
            return true;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OTPTextField;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField cityJF;
    private javax.swing.JTextField emailJF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameJF;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JButton reportAnimalBtn;
    private javax.swing.JButton statusReportAnimalBtn;
    private javax.swing.JTextField zipJF;
    // End of variables declaration//GEN-END:variables

    
}
