/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PetHealthCheckUpRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rutuj
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ClinicOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ClinicOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
//        userAccount.getWorkQueue().getWorkRequestList().clear();
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        organization.getWorkQueue().getWorkRequestList().stream().filter(req->req instanceof PetHealthCheckUpRequest).forEach(request->{
            Object[] row = new Object[11];
            row[0] = request;
            row[1] = ((PetHealthCheckUpRequest)request).getPrescription();
            row[2] = ((PetHealthCheckUpRequest)request).getPet();
            row[3] = ((PetHealthCheckUpRequest)request).getSender();
            row[4] = ((PetHealthCheckUpRequest)request).getReceiver();
            row[5] = ((PetHealthCheckUpRequest)request).getStatus();
            row[6] = ((PetHealthCheckUpRequest)request).getPrescription()==null?"":((PetHealthCheckUpRequest)request).getPrescription().getStatus();
            row[7] = ((PetHealthCheckUpRequest)request).getRequestDate();
            
            row[8] = ((PetHealthCheckUpRequest)request).getUrgency();
            row[9] = ((PetHealthCheckUpRequest)request).getComments();
            row[10] = ((PetHealthCheckUpRequest)request).getPrescription()==null?"":((PetHealthCheckUpRequest)request).getPrescription().getMessage();
            model.addRow(row);
        });
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 850));
        setSize(new java.awt.Dimension(1200, 850));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshTestJButton.setBackground(new java.awt.Color(0, 153, 255));
        refreshTestJButton.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, -1, 39));

        enterpriseLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 48, 150, 30));

        valueLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(226, 153, 0));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 520, 26));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setText("Prescribe Medicine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, -1, 43));

        workRequestJTable.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Health check Id", "Prescription req id", "PetId", "Request Raised By", "Assigned To", "Health check status", "Prescription status", "Request Date", "Urgency ", "Comments", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 134, 1180, 420));

        assign.setBackground(new java.awt.Color(0, 153, 255));
        assign.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        assign.setText("Assign to me");
        assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignActionPerformed(evt);
            }
        });
        add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, -1, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/adopt_1200x850.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Integer selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table");
             return;
        }
        PetHealthCheckUpRequest req = (PetHealthCheckUpRequest)workRequestJTable.getValueAt(selectedRow, 0);
//        if(req.getPrescription().getStatus().equalsIgnoreCase("Pending request")||req.getPrescription().getStatus().equalsIgnoreCase("Completed Request") ){
//             JOptionPane.showMessageDialog(null, "Prescription already raised/completed");
//             return;
//        }
        if(req.getStatus().equalsIgnoreCase("Pending request")){
            JOptionPane.showMessageDialog(null, "Please assign to self first for raising prescription");
            return;
        }
        if(req.getStatus().equalsIgnoreCase("Request Forwarded")){
            JOptionPane.showMessageDialog(null, "Please assign to self first");
            return;
        }
        if(req.getStatus().equalsIgnoreCase("Diagnosed")){
            JOptionPane.showMessageDialog(null, "Pet already diagnosed");
            return;
        }
        if (selectedRow >= 0) {
            if(req.getReceiver()==userAccount){
                req.setReceiver(userAccount);
                req.setStatus("Diagonsis In Progress");
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("PrescribeMedJPanel", new PrescribeMedJPanel(userProcessContainer, userAccount, enterprise, req,business));
                layout.next(userProcessContainer);
                dB4OUtil.storeSystem(business);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select a New Request or request assigned to your name");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
    }//GEN-LAST:event_workRequestJTableMouseClicked

    private void assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignActionPerformed
        // TODO add your handling code here:
        Integer selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table");
             return;
        }
        PetHealthCheckUpRequest req = (PetHealthCheckUpRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if (selectedRow >= 0) {
            if(!(req.getReceiver().getRole() instanceof DoctorRole) ){
                req.setReceiver(userAccount);
                req.setStatus("Pending Diagonsis");
                dB4OUtil.storeSystem(business);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please select a New Request");
            }
        }
        populateRequestTable();
    }//GEN-LAST:event_assignActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assign;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
