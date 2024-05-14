package classes;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;

public class AddTransaction extends javax.swing.JFrame {
    private Homepage hp;
    public AddTransaction(Homepage hp) {
        this.hp = hp;
        initComponents();
        updateCombo(); // DropBox is updated by function not by button
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DBcar = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFexpense = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFpayment = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFdest = new javax.swing.JTextField();
        TFpu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TFcustname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TFcustnum = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BTNcancel = new javax.swing.JButton();
        TFdo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel4.setText("Date Returned:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 80, -1));

        jLabel5.setText("Date Rented:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        jLabel3.setText("Payment:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel4.add(TFexpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 90, -1));

        jLabel6.setText("P");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel7.setText("P");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel8.setText("Expense:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel4.add(TFpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 90, -1));

        jLabel9.setText("Destination: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel10.setText("Pick-up: ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel4.add(TFdest, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 120, -1));

        TFpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpuActionPerformed(evt);
            }
        });
        jPanel4.add(TFpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, -1));

        jLabel12.setText("Customer Age:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));
        jPanel4.add(TFcustname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 180, -1));

        jLabel13.setText("Customer Name:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));
        jPanel4.add(TFcustnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 180, -1));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 140, -1));
        jPanel4.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 150, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 580, 230));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        BTNcancel.setText("Cancel");
        BTNcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcancelActionPerformed(evt);
            }
        });
        getContentPane().add(BTNcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));
        getContentPane().add(TFdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 120, -1));

        jLabel11.setText("Drop-off:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DBcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBcarActionPerformed
              
    }//GEN-LAST:event_DBcarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String selectedCar = (String) DBcar.getSelectedItem();
            String[] carDetails = selectedCar.split(" "); // Splits CONCAT by spaces
            
            Car car = new Car();
            car.setPlate(carDetails[0]);
            car.setBrand(carDetails[1]);
            car.setName(carDetails[2]);
            car.setModel(Integer.parseInt(carDetails[3]));
            
            Date dateRented = jDateChooser1.getDate();
            Date dateReturned = jDateChooser2.getDate();
            
            java.sql.Date sqlDateRented = new java.sql.Date(dateRented.getTime());
            java.sql.Date sqlDateReturned = new java.sql.Date(dateReturned.getTime());
            
            double payment = Double.parseDouble(TFpayment.getText());
            double expense = Double.parseDouble(TFexpense.getText());
            String pickUp = TFpu.getText();
            String dropOff = TFdo.getText();
            String customerName = TFcustname.getText();
            String customerNum = TFcustnum.getText();
           
            int rowsInserted = Connector.AddTransaction(hp.getCurrentUser().getID(), car.getPlate(), sqlDateRented, sqlDateReturned, payment, expense, pickUp, dropOff, customerName, customerNum);
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(this, "Transaction Added Successfully!");
                TFpayment.setText("");
                TFexpense.setText("");
                TFpu.setText("");
                TFdo.setText("");
                TFcustname.setText("");
                TFcustnum.setText("");
            }
            
            else{
                JOptionPane.showMessageDialog(this, "Invalid Input");
            }
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){ // Only one | for or.
            System.out.println(e.getMessage());
        }
        // Used rowsInserted since this is going to be queried in a table
       // Tables that are queried usually need to be int rather than just ResultSet
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
        hp.retrieveTransactions();
        hp.show();
    }//GEN-LAST:event_BTNcancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    TFpayment.setText("");
    TFexpense.setText("");
    TFpu.setText("");
    TFdo.setText("");
    TFcustname.setText("");
    TFcustnum.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TFpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpuActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        jDateChooser2.setMinSelectableDate(jDateChooser1.getDate());
    }//GEN-LAST:event_jDateChooser1PropertyChange
    
    private void updateCombo(){
        try{
            ResultSet rs = Connector.comboUpdate(hp.getCurrentUser());
            
            while(rs.next()){
                DBcar.addItem(rs.getString("concated"));
                // Used Concated so since you cannot manually concatinate
                // The columns here
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            Connector.close();
        }
    }

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcancel;
    private javax.swing.JComboBox<String> DBcar;
    private javax.swing.JTextField TFcustname;
    private javax.swing.JTextField TFcustnum;
    private javax.swing.JTextField TFdest;
    private javax.swing.JTextField TFdo;
    private javax.swing.JTextField TFexpense;
    private javax.swing.JTextField TFpayment;
    private javax.swing.JTextField TFpu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
