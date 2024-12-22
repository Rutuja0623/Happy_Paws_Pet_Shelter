/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NgoOfficeOrganization;
import Business.Role.NgoAccountantRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chaitanya
 */
public class NgoAccountantWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private NgoOfficeOrganization ngoOfficeOrganization; 
    private Enterprise enterprise;
    private EcoSystem business;
    /**
     * Creates new form NgoAccountantWorkAreaJPanel
     */
    public NgoAccountantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, NgoOfficeOrganization ngoOfficeOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        jLabel3.setText(enterprise.getName());
        this.userProcessContainer = userProcessContainer;
        this.ngoOfficeOrganization = ngoOfficeOrganization;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(197, 231, 249));
        setBounds(new java.awt.Rectangle(0, 0, 1200, 850));
        setDoubleBuffered(false);
        setPreferredSize(new java.awt.Dimension(1200, 850));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Accountant Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("Enterprise:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(226, 153, 0));
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 540, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton3.setText("DashBoard");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 133, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/accountant_600x600.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 600, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("NgoAccountantDashBoardJPanel", new NgoAccountantDashBoardJPanel(userProcessContainer,account,ngoOfficeOrganization,enterprise ,business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}