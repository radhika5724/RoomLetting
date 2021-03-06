import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        btnCustomerReport = new javax.swing.JButton();
        btnBookingReport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mBarReport = new javax.swing.JMenuBar();
        mHome = new javax.swing.JMenu();
        mItemMaster = new javax.swing.JMenuItem();
        mReport = new javax.swing.JMenu();
        mItemCustomer = new javax.swing.JMenuItem();
        mItemBooking = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(null);

        btnCustomerReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCustomerReport.setText("Customer Status");
        btnCustomerReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerReportMouseClicked(evt);
            }
        });
        btnCustomerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerReportActionPerformed(evt);
            }
        });
        jPanel2.add(btnCustomerReport);
        btnCustomerReport.setBounds(150, 60, 200, 50);

        btnBookingReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBookingReport.setText("Room Status");
        btnBookingReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookingReportMouseClicked(evt);
            }
        });
        btnBookingReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingReportActionPerformed(evt);
            }
        });
        jPanel2.add(btnBookingReport);
        btnBookingReport.setBounds(510, 60, 230, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select a report to view !");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(340, 10, 250, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 260, 900, 130);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Report Panel");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 30, 390, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/art-black-background-blur-1040499.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 930, 630);

        mBarReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mBarReport.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mBarReport.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mBarReport.setMinimumSize(new java.awt.Dimension(90, 40));
        mBarReport.setPreferredSize(new java.awt.Dimension(157, 36));

        mHome.setText("Home");
        mHome.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        mItemMaster.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mItemMaster.setText("Master Form");
        mItemMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemMasterActionPerformed(evt);
            }
        });
        mHome.add(mItemMaster);

        mBarReport.add(mHome);

        mReport.setText("Report");
        mReport.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        mItemCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mItemCustomer.setText("Customer");
        mItemCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCustomerActionPerformed(evt);
            }
        });
        mReport.add(mItemCustomer);

        mItemBooking.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mItemBooking.setText("Booking");
        mItemBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemBookingActionPerformed(evt);
            }
        });
        mReport.add(mItemBooking);

        mBarReport.add(mReport);

        setJMenuBar(mBarReport);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mItemCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemCustomerActionPerformed

    private void mItemMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemMasterActionPerformed
        MasterForm call = new MasterForm();
        call.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mItemMasterActionPerformed

    private void btnCustomerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerReportActionPerformed
        CustomerReport t= new CustomerReport();
       t.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCustomerReportActionPerformed

    private void btnBookingReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingReportActionPerformed
        BookingReport b= new BookingReport();
       b.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBookingReportActionPerformed

    private void btnCustomerReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerReportMouseClicked
       CustomerReport t= new CustomerReport();
       t.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnCustomerReportMouseClicked

    private void btnBookingReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingReportMouseClicked
       BookingReport b= new BookingReport();
       b.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBookingReportMouseClicked

    private void mItemBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemBookingActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookingReport;
    private javax.swing.JButton btnCustomerReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar mBarReport;
    private javax.swing.JMenu mHome;
    private javax.swing.JMenuItem mItemBooking;
    private javax.swing.JMenuItem mItemCustomer;
    private javax.swing.JMenuItem mItemMaster;
    private javax.swing.JMenu mReport;
    // End of variables declaration//GEN-END:variables
}
