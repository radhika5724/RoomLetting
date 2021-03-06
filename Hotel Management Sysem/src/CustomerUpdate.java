/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENT
 */
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class CustomerUpdate extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form CustomerUpdate
     */
    public CustomerUpdate() {
        initComponents();
        String url="jdbc:mysql://localhost:3306/hotelmanage";
        String user="root";
        String password="root";
        try{
            Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection(url,user,password);
                    st=con.createStatement();
                    System.out.println("Connected");
        }
            catch(Exception e)
                    {
                    System.out.print(e.getMessage());
                    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblAdhaarNo = new javax.swing.JLabel();
        txtAdhaarNo = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        RbtnMale = new javax.swing.JRadioButton();
        RbtnFemale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/information (1).png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Personal");

        jLabel14.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 560, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFirstName.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(204, 204, 204));
        lblFirstName.setText("First-Name       :");

        lblContactNo.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblContactNo.setForeground(new java.awt.Color(204, 204, 204));
        lblContactNo.setText("Contact No.       :");

        lblLastName.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(204, 204, 204));
        lblLastName.setText("Last-Name        :");

        lblEmailAddress.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblEmailAddress.setForeground(new java.awt.Color(204, 204, 204));
        lblEmailAddress.setText("Email Address  :");

        lblAdhaarNo.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblAdhaarNo.setForeground(new java.awt.Color(204, 204, 204));
        lblAdhaarNo.setText("Adhaar No.       :");

        txtAdhaarNo.setBackground(new java.awt.Color(204, 204, 204));
        txtAdhaarNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAdhaarNo.setEnabled(false);

        txtLastName.setBackground(new java.awt.Color(204, 204, 204));
        txtLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtLastName.setEnabled(false);

        txtFirstName.setBackground(new java.awt.Color(204, 204, 204));
        txtFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtFirstName.setEnabled(false);

        txtEmailAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtEmailAddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmailAddress.setEnabled(false);

        txtContactNo.setBackground(new java.awt.Color(204, 204, 204));
        txtContactNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtContactNo.setEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/name.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/name.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/telephone.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/id-card.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email.png"))); // NOI18N

        lblCustomerID.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblCustomerID.setForeground(new java.awt.Color(204, 204, 204));
        lblCustomerID.setText("Customer ID     :");

        txtCustomerID.setBackground(new java.awt.Color(204, 204, 204));
        txtCustomerID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(204, 204, 204));
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(51, 51, 51));
        btnCancel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(204, 204, 204));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(51, 51, 51));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(204, 204, 204));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/binary.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lavatory.png"))); // NOI18N

        lblGender.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        lblGender.setForeground(new java.awt.Color(204, 204, 204));
        lblGender.setText("Gender              :");

        RbtnMale.setBackground(new java.awt.Color(153, 153, 153));
        radioGender.add(RbtnMale);
        RbtnMale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RbtnMale.setForeground(new java.awt.Color(204, 255, 255));
        RbtnMale.setText("Male");
        RbtnMale.setEnabled(false);

        RbtnFemale.setBackground(new java.awt.Color(153, 153, 153));
        radioGender.add(RbtnFemale);
        RbtnFemale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RbtnFemale.setForeground(new java.awt.Color(255, 102, 153));
        RbtnFemale.setText("Female");
        RbtnFemale.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdhaarNo)
                            .addComponent(lblLastName)
                            .addComponent(lblEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(lblCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnUpdate)
                                .addGap(38, 38, 38)
                                .addComponent(btnCancel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtAdhaarNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                            .addComponent(txtContactNo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCustomerID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearch))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(RbtnMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RbtnFemale))))))
                    .addComponent(lblGender))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFirstName)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RbtnMale)
                        .addComponent(RbtnFemale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdhaarNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdhaarNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
           
        int id = Integer.parseInt( txtCustomerID.getText() );
        String query1="select * from customerdata where id=" + id;
        
        btnUpdate.setEnabled(true);
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        RbtnMale.setEnabled(true);
        RbtnFemale.setEnabled(true);
        txtContactNo.setEnabled(true);
        txtAdhaarNo.setEnabled(true);
        txtEmailAddress.setEnabled(true);
        
        try{
            rs=st.executeQuery(query1);
            if(rs.next())
            {
               txtFirstName.setText(rs.getString("fname"));
               txtLastName.setText(rs.getString("lname"));
               
               if(rs.getString("gender").equals("Male"))
                {
                RbtnMale.setSelected(true);
                }
                else if(rs.getString("gender").equals("Female"))
                {
               //rdoMale.setSelected(false);
                RbtnFemale.setSelected(true);
                }
               txtContactNo.setText(rs.getString("mobile"));
                txtAdhaarNo.setText(rs.getString("adhaar"));
                txtEmailAddress.setText(rs.getString("email"));
                btnSearch.setEnabled(true);
            
            }
            else
            { 
                JOptionPane.showMessageDialog(this," Record not found");
             txtFirstName.setEnabled(false);
             txtFirstName.setText("");
             txtLastName.setEnabled(false);
             txtLastName.setText("");
             RbtnMale.setEnabled(false);
             RbtnFemale.setEnabled(false);
             radioGender.clearSelection();
             //lblRoll.setText("");
             btnSearch.setEnabled(true);
             btnUpdate.setEnabled(false);
             txtCustomerID.enable(true);
             txtCustomerID.requestFocus();
             txtContactNo.setEnabled(false);
             txtContactNo.setText("");
             txtAdhaarNo.setEnabled(false);
             txtAdhaarNo.setText("");
             txtEmailAddress.setEnabled(false);
             txtEmailAddress.setText("");
            }
        }
            catch(Exception ex)
            {
                System.out.print(ex.getMessage());
            }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         String id = txtCustomerID.getText();
        String fname = txtFirstName.getText();
        String lname = txtLastName.getText();
        String Gender = "";
        String mobile = txtContactNo.getText();
        String adhaar = txtAdhaarNo.getText();
        String email = txtEmailAddress.getText();
        
        if (fname.equals("")) {
            
           JOptionPane.showMessageDialog(null,"Please provide First Name");
            txtFirstName.requestFocus();
           
            
        }
         if (lname.equals("")) {
            
           JOptionPane.showMessageDialog(null,"Please provide Last Name");
            txtLastName.requestFocus();
            
            
        }
         
         if(RbtnMale.isSelected()){
             Gender = "Male";
         }
         else if(RbtnFemale.isSelected()){
             Gender = "Female";
         }
         else{
             JOptionPane.showMessageDialog(null, "Please Select Gender");
             RbtnMale.requestFocus();
         }
         
         if (mobile.equals("")) {
            
           JOptionPane.showMessageDialog(null,"Please provide Contact Number");
            txtContactNo.requestFocus();
            return;
            
        }
        
         if (adhaar.equals("")) {
            
           JOptionPane.showMessageDialog(null,"Please provide Adhaar Number");
            txtAdhaarNo.requestFocus();
            
            
        }
           if (email.equals("")) {
            
           JOptionPane.showMessageDialog(null,"Please provide Email Address");
            txtEmailAddress.requestFocus();
        }
           
        String query="update customerdata set fname='" + fname + "',lname='" + lname +"',gender='" + Gender +"',mobile='" + mobile  +"',adhaar='"+ adhaar + "',email = '" + email + ",' where id= " + id;
        try{
        int i=st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Updated successfully");
            txtFirstName.setEnabled(false);
             txtFirstName.setText("");
             txtLastName.setEnabled(false);
             txtLastName.setText("");
             RbtnMale.setEnabled(false);
             RbtnFemale.setEnabled(false);
             radioGender.clearSelection();
             //lblRoll.setText("");
             btnSearch.setEnabled(true);
             btnUpdate.setEnabled(false);
             txtCustomerID.enable(true);
             txtCustomerID.requestFocus();
             txtContactNo.setEnabled(false);
             txtContactNo.setText("");
             txtAdhaarNo.setEnabled(false);
             txtAdhaarNo.setText("");
             txtEmailAddress.setEnabled(false);
             txtEmailAddress.setText("");
       
        }
        catch(Exception ex){
          System.out.print(ex.getMessage());
        }  
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnFemale;
    private javax.swing.JRadioButton RbtnMale;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdhaarNo;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.ButtonGroup radioGender;
    private javax.swing.JTextField txtAdhaarNo;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
