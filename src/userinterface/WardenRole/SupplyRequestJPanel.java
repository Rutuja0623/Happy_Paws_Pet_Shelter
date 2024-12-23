/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WardenRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NgoOfficeOrganization;
import Business.Organization.PetShelterOrganization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodWorkRequest;
import Business.WorkQueue.MedWorkRequest;
import Business.WorkQueue.SupplyWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author shree
 */
public class SupplyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyRequestJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private ArrayList<String> itemList;
    private NgoOfficeOrganization organization;
    private EcoSystem business;
    private PetShelterOrganization org;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private final Logger logger = Logger.getLogger(this.getClass());
    
    public SupplyRequestJPanel(JPanel userProcessContainer, UserAccount useraccount, NgoOfficeOrganization organization,PetShelterOrganization org, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.organization = organization; //ngo
        this.org = org; //petshelter
        itemList = new ArrayList<>(); //
        populateCombo(itemList);
        populateTable(); 
    }
    
    private void populateTable(){
    DefaultTableModel model = (DefaultTableModel)WorkRequestJTable.getModel();
        model.setRowCount(0);
        org.getWorkQueue().getWorkRequestList().forEach(req->{
            Object[] row = new Object[7];
            if(req instanceof SupplyWorkRequest){
                row[0] = req;
                row[1] = req.getMessage();
                row[2] = req.getSender().getEmployee().getName();
                row[3] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getName();
                row[4] = ((SupplyWorkRequest)req).getItemList();
                row[5] = req.getStatus();
                row[6] = ((SupplyWorkRequest)req).getBillamount();
                model.addRow(row);

            }
        });
    }
    
    //display products
    private void populateCombo(ArrayList<String> foodList) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        foodList.forEach(item->{
            Object[] row = new Object[1];
            row[0] = item;
            model.addRow(row);
        });
    }
    
    private void populateSuppTable(String cid) {
        DefaultTableModel model = (DefaultTableModel)PlacedRequestJTable.getModel();
        model.setRowCount(0);
        org.getWorkQueue().getWorkRequestList().forEach(req->{
            Object[] row = new Object[6];
            if(req instanceof FoodWorkRequest){
                if(((FoodWorkRequest)req).getFoodReqId().equalsIgnoreCase(cid)){
                row[0] = req;
                row[1] = req.getMessage();
                row[2] = req.getSender().getEmployee().getName();
                row[3] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getName();
                row[4] = ((FoodWorkRequest)req).getFoodList();
                row[5] = req.getStatus();
                model.addRow(row);
                }
            }if(req instanceof MedWorkRequest){
                if(((MedWorkRequest)req).getMedReqId().equalsIgnoreCase(cid)){
                    row[0] = req;
                row[1] = req.getMessage();
                row[2] = req.getSender().getEmployee().getName();
                row[3] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getName();
                row[4] = ((MedWorkRequest)req).getMedList();
                row[5] = req.getStatus();
                model.addRow(row);
                }
            }
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        WorkRequestJTable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        PlacedRequestJTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 850));
        setSize(new java.awt.Dimension(1200, 850));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Type of Item:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 186, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 140, 450, 130));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 103, 44));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton1.setText("Request Approval");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, 40));

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, -1, 36));

        WorkRequestJTable.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        WorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Message", "Sender", "Receiver", "Items  List", "Request Status", "Bill Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WorkRequestJTable.setToolTipText("");
        jScrollPane2.setViewportView(WorkRequestJTable);
        if (WorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            WorkRequestJTable.getColumnModel().getColumn(6).setHeaderValue("Bill Amount");
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 1080, 190));

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Medicine" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 187, -1));

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton5.setText("Proceed to place a New order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, -1, 42));

        PlacedRequestJTable.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        PlacedRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Message", "Sender", "Receiver", "Items  List", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PlacedRequestJTable.setToolTipText("");
        jScrollPane3.setViewportView(PlacedRequestJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 640, 1080, 190));

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jButton6.setText("See supply status");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, -1, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/adopt_1200x850.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String itemtype = (String)(jComboBox1.getSelectedItem());
        String item = itemtype+":"+jTextField1.getText();
        if(!jTextField1.getText().isEmpty()){
            itemList.add(item);
            populateCombo(itemList);
        }else{
            JOptionPane.showMessageDialog(null, "Kindly add item name");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int val =0;  
        if(itemList.size() >0){
            do{
            val = (int) Math.abs(Math.random()*1000);
            }while(val <= 0);
            SupplyWorkRequest fwr = new SupplyWorkRequest();
            fwr.setItemList(itemList);
            fwr.setMessage("Item request");
            fwr.setSender(useraccount);
            fwr.setStatus("Pending request for approval");
            fwr.setBillamount(val);
            fwr.setSuppReqId(Integer.toString(business.getIdGenInstance().getReqId())); 
            useraccount.getWorkQueue().getWorkRequestList().add(fwr);
            organization.getWorkQueue().getWorkRequestList().add(fwr); //add q to ngoffice
            org.getWorkQueue().getWorkRequestList().add(fwr);
            JOptionPane.showMessageDialog(null, "Request sent");
            dB4OUtil.storeSystem(business);
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
            logger.info(" Supply WorkOrder requested for Approval");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
        }else{
            JOptionPane.showMessageDialog(null, "Kindly add items to list before placing order");
            logger.info(" Kinldy add items to list before placing order");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populateTable();    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(WorkRequestJTable.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }else{            
            SupplyWorkRequest swr = (SupplyWorkRequest)WorkRequestJTable.getValueAt(WorkRequestJTable.getSelectedRow(),0);
            if(swr.getStatus().equalsIgnoreCase("Approved request")){
                //move forward
                logger.info(" Proceeding to place a new order");
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("PlaceOrderJPanel", new PlaceOrderJPanel(userProcessContainer, useraccount,swr,org, enterprise,business));
                layout.next(userProcessContainer);
            }
            if(swr.getStatus().equalsIgnoreCase("Pending request for Approval")){
                JOptionPane.showMessageDialog(null, "Awaiting office staff approval");
                return;
            }
            if(swr.getStatus().equalsIgnoreCase("Pending bill pay")){
                JOptionPane.showMessageDialog(null, "Awaiting accounts office clearance");
                return;
            }
            if(swr.getStatus().equalsIgnoreCase("Bill paid")){
                JOptionPane.showMessageDialog(null, "Awaiting admin office final clearance");
            }
            if(swr.getStatus().equalsIgnoreCase("Request sent to Supplier")){
                JOptionPane.showMessageDialog(null, "Request sent to Supplier\n"+
                                                     "Click on See status button");
            }
            if(swr.getStatus().equalsIgnoreCase("Pending request")){
                JOptionPane.showMessageDialog(null, "Order pending for Office approval");
                return;
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(WorkRequestJTable.getSelectedRow()<0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }else{
            SupplyWorkRequest swr = (SupplyWorkRequest)WorkRequestJTable.getValueAt(WorkRequestJTable.getSelectedRow(),0);
            String cid = swr.getSuppReqId();
            if(swr.getStatus().equalsIgnoreCase("Pending request for Approval")){
                JOptionPane.showMessageDialog(null, "Awaiting office staff approval");
                return;
            }
            if(swr.getStatus().equalsIgnoreCase("Pending bill pay")){
                JOptionPane.showMessageDialog(null, "Awaiting accounts office clearance");
                return;
            }
            if(swr.getStatus().equalsIgnoreCase("Approved request")){
                JOptionPane.showMessageDialog(null, "Kindly place an order first");
            }
            if(swr.getStatus().equalsIgnoreCase("Bill paid")){
                JOptionPane.showMessageDialog(null, "Awaiting admin office final clearance");
            }
            if(swr.getStatus().equalsIgnoreCase("Pending request")){
                JOptionPane.showMessageDialog(null, "Order pending for Office approval");
                return;
            }else{
                populateSuppTable(cid);
                logger.info(" Populating the status for Supply WorkOrder");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PlacedRequestJTable;
    private javax.swing.JTable WorkRequestJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    

}
