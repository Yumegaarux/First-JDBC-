package classes;
import java.sql.*;

public class AddTransaction extends javax.swing.JFrame {
    public AddTransaction() {
        initComponents();
        updateCombo(); // DropBox is updated by function not by button
    }
    
    public static String dateRented;
    public static String dateReturned;
    public static double payment;
    public static double expense;
    public static double net;
    public static String pickUp;
    public static String dropOff;
    public static String customerName;
    public static String customerNum;
    public static String car;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DBcar = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TFdaterented = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFdatereturned = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFexpense = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFpayment = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TFdo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFdest = new javax.swing.JTextField();
        TFpu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TFcustname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TFcustnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Add Transaction");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 280, 55));

        jLabel2.setText("Choose Car:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, -1, -1));

        DBcar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Car" }));
        DBcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBcarActionPerformed(evt);
            }
        });
        getContentPane().add(DBcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 113, 230, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Date Returned(YYYY/MM/DD):");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));
        jPanel4.add(TFdaterented, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 120, -1));

        jLabel5.setText("Date Rented(YYYY/MM/DD):");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));
        jPanel4.add(TFdatereturned, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 120, -1));

        jLabel3.setText("Payment:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel4.add(TFexpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, -1));

        jLabel6.setText("P");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel7.setText("P");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel8.setText("Expense:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        jPanel4.add(TFpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, -1));

        jLabel9.setText("Destination: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel4.add(TFdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 120, -1));

        jLabel10.setText("Pick-up: ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel11.setText("Drop-off:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel4.add(TFdest, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, -1));
        jPanel4.add(TFpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, -1));

        jLabel12.setText("Customer Age:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));
        jPanel4.add(TFcustname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 180, -1));

        jLabel13.setText("Customer Name:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));
        jPanel4.add(TFcustnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 180, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 580, 230));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jButton2.setText("Clear");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jButton3.setText("Cancel");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DBcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBcarActionPerformed
              
    }//GEN-LAST:event_DBcarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Connector.connect();
            
            dateRented = TFdaterented.getText();
            dateReturned = TFdatereturned.getText();
            payment = Double.parseDouble(TFpayment.getText());
            expense = Double.parseDouble(TFexpense.getText());
            pickUp = TFpu.getText();
            dropOff = TFdo.getText();
            customerName = TFcustname.getText();
            customerNum = TFcustnum.getText();
           
            // VL : Add a string statement here
            
            PreparedStatement ps = Connector.con.prepareStatement("");
            ps.setString(1, dateRented); 
            ps.setString(2, dateReturned); 
            ps.setDouble(3, payment);
            ps.setDouble(4, expense);
            ps.setString(5, pickUp);
            ps.setString(6, dropOff); 
            ps.setString(7, customerName); 
            ps.setString(8, customerNum);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void updateCombo(){
        try{
        
        //VL: Enter SQL statement here to update combobox.    
        
        PreparedStatement ps = Connector.con.prepareStatement("");
        ResultSet rs = ps.executeQuery(); 
        
        while(rs.next()){
            DBcar.addItem(rs.getString("concated"));
            // Used Concated so since you cannot manually concatinate
            // The columns here
        }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DBcar;
    private javax.swing.JTextField TFcustname;
    private javax.swing.JTextField TFcustnum;
    private javax.swing.JTextField TFdaterented;
    private javax.swing.JTextField TFdatereturned;
    private javax.swing.JTextField TFdest;
    private javax.swing.JTextField TFdo;
    private javax.swing.JTextField TFexpense;
    private javax.swing.JTextField TFpayment;
    private javax.swing.JTextField TFpu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
