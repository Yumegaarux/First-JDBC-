package classes;
import java.sql.*;
import javax.swing.JOptionPane;

public class CarRental extends javax.swing.JFrame {  

    public CarRental() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        tfPass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BTNcreateacc = new javax.swing.JButton();
        BTNclose = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysWiz Car Rental");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 350));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 350));
        jPanel3.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 140, 70, 15);

        tfUser.setBackground(new java.awt.Color(0, 0, 51));
        tfUser.setForeground(new java.awt.Color(255, 255, 255));
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        jPanel3.add(tfUser);
        tfUser.setBounds(90, 130, 269, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 210, 60, 15);

        btnLog.setBackground(new java.awt.Color(0, 51, 102));
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setText("Log-in");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel3.add(btnLog);
        btnLog.setBounds(30, 270, 80, 25);

        tfPass.setBackground(new java.awt.Color(0, 0, 51));
        tfPass.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(tfPass);
        tfPass.setBounds(90, 200, 270, 30);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SysWiz Car Rental System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 70);

        BTNcreateacc.setBackground(new java.awt.Color(0, 51, 102));
        BTNcreateacc.setForeground(new java.awt.Color(255, 255, 255));
        BTNcreateacc.setText("Create Account");
        BTNcreateacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcreateaccActionPerformed(evt);
            }
        });
        jPanel3.add(BTNcreateacc);
        BTNcreateacc.setBounds(140, 270, 120, 25);

        BTNclose.setBackground(new java.awt.Color(0, 51, 102));
        BTNclose.setForeground(new java.awt.Color(255, 255, 255));
        BTNclose.setText("Close");
        BTNclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcloseActionPerformed(evt);
            }
        });
        jPanel3.add(BTNclose);
        BTNclose.setBounds(290, 270, 80, 25);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserActionPerformed
    
    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        try{
            Connector.connect();
            String username = tfUser.getText();
            String password = tfPass.getText();
            
            ResultSet rs = Connector.logUser(username, password);
            
            if(rs.next()){
                int userID = rs.getInt("idusers"); 
                Users currentUser = new Users();
                currentUser.setID(userID);
                currentUser.setUsername(username);
                currentUser.setPassword(password);
                
                dispose();
                Homepage hpage = new Homepage(currentUser);
                hpage.show();
                
            }else{
                JOptionPane.showMessageDialog(this, "Wrong Password or Username");    
            }
            
            Connector.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnLogActionPerformed

    private void BTNcreateaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcreateaccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNcreateaccActionPerformed

    private void BTNcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTNcloseActionPerformed

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
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarRental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNclose;
    private javax.swing.JButton BTNcreateacc;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
