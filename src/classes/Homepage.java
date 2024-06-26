package classes;
import java.awt.Color;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Homepage extends javax.swing.JFrame {
    private final Users currentUser;
    public Homepage(Users currentUser) { //This allows the homepage to know the userID taken in the CarRental class.
        this.currentUser = currentUser;
        initComponents();
        retrieveCars();           
        retrieveTransactions();
        carNetDisplay();


                            // Adding connector to the constructor is bad.
                           // Functions can be added here so the moment the window is opened
                          // The Functions are now called.
    }
    public Users getCurrentUser(){
        return currentUser;
    }
    
    private void carNetDisplay(){
        TFcarNet.disable();
        TFcarNet.setBackground(Color.white);
        TFcarNet.setForeground(Color.black);
    }
    
    public void retrieveCars(){
        int q, i;
        try{
            ResultSet rs = Connector.retrieveCarsData(this.currentUser); // The rs is equal to the function 'retrieveCarsData'
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){ //rs.next() until the table is empty
                Vector columnData = new Vector();
                
                for(i = 1 ; i <= q ; i++){
                    
                    // rs.getString is used to get column name from the table
                    
                    columnData.add(rs.getString("carplate"));
                    columnData.add(rs.getString("carbrand"));
                    columnData.add(rs.getString("carname"));
                    columnData.add(rs.getString("yrmodel"));
                    columnData.add(rs.getString("status"));
                }
                RecordTable.addRow(columnData);
            }
            
            Connector.close();
         }catch(SQLException e){
              System.out.println(e.getMessage());
         }
    } 
    
    public void retrieveTransactions(){
        int q, i;
        try{
            ResultSet rs = Connector.retrieveTransactionsData(this.currentUser); // The rs is equal to the function 'retrieveCarsData'
            ResultSetMetaData stData = rs.getMetaData();
            
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){ //rs.next() until the table is empty
                Vector columnData = new Vector();
                
                for(i = 1 ; i <= q ; i++){
                    
                    // rs.getString is used to get column name from the table
                    
                    columnData.add(rs.getString("carplate"));
                    columnData.add(rs.getString("date_rented"));
                    columnData.add(rs.getString("date_returned"));
                    columnData.add(rs.getString("payment"));
                    columnData.add(rs.getString("expense"));
                    columnData.add(rs.getString("net"));
                    columnData.add(rs.getString("customername"));
                    columnData.add(rs.getString("customernum"));
                    
                }
                RecordTable.addRow(columnData);
            }
            
            Connector.close();
         }catch(SQLException e){
              System.out.println(e.getMessage());
         }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BTNadd = new javax.swing.JButton();
        BTNaddtrans = new javax.swing.JButton();
        BTNedit = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        LBLcarImg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LBLcarName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFcarNet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFcarBookings = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BTNlogout = new javax.swing.JButton();
        BTNstats = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(243, 243, 243));
        jPanel4.setPreferredSize(new java.awt.Dimension(948, 500));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 948, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 232, 232));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BTNadd.setBackground(new java.awt.Color(204, 51, 0));
        BTNadd.setText("Add Car");
        BTNadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNaddActionPerformed(evt);
            }
        });

        BTNaddtrans.setBackground(new java.awt.Color(204, 51, 0));
        BTNaddtrans.setText("Add Transaction");
        BTNaddtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNaddtransActionPerformed(evt);
            }
        });

        BTNedit.setBackground(new java.awt.Color(204, 51, 0));
        BTNedit.setText("Edit Car");
        BTNedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeditActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(204, 102, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate", "Brand", "Name", "Model", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jTabbedPane1.addTab("Cars", jScrollPane2);

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate", "Date Rented", "Date Returned", "Income", "Expense", "Net profit", "Customer Name", "Customer Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        jTabbedPane1.addTab("Transactions", jScrollPane1);

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setForeground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLcarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLcarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(246, 246, 246));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LBLcarName.setBackground(new java.awt.Color(0, 0, 0));
        LBLcarName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        LBLcarName.setForeground(new java.awt.Color(0, 0, 0));
        LBLcarName.setText("Select Row");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total Earnings: ");

        TFcarNet.setEditable(false);
        TFcarNet.setBackground(new java.awt.Color(255, 255, 255));
        TFcarNet.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Total Bookings: ");

        TFcarBookings.setEditable(false);
        TFcarBookings.setBackground(new java.awt.Color(255, 255, 255));
        TFcarBookings.setForeground(new java.awt.Color(0, 0, 0));
        TFcarBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcarBookingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LBLcarName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFcarNet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFcarBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLcarName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFcarNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFcarBookings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNaddtrans)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNadd)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BTNedit)
                                .addComponent(BTNadd))
                            .addComponent(BTNaddtrans, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BTNlogout.setBackground(new java.awt.Color(255, 255, 255));
        BTNlogout.setForeground(new java.awt.Color(0, 0, 0));
        BTNlogout.setText("Log-out");
        BTNlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlogoutActionPerformed(evt);
            }
        });

        BTNstats.setBackground(new java.awt.Color(255, 255, 255));
        BTNstats.setForeground(new java.awt.Color(0, 0, 0));
        BTNstats.setText("Reporting");
        BTNstats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNstatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNstats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNlogout)
                .addGap(18, 18, 18)
                .addComponent(BTNstats)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNaddActionPerformed
        this.dispose();
        AddCar ac = new AddCar(this);
        ac.show();
    }//GEN-LAST:event_BTNaddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel carTable = (DefaultTableModel)jTable1.getModel();
        DefaultTableModel inventoryTable = (DefaultTableModel)jTable2.getModel();
        Car car = new Car();
        int selectedRow = jTable1.getSelectedRow();

        Object plate = carTable.getValueAt(selectedRow, 0);
        Object brand = carTable.getValueAt(selectedRow, 1);
        Object name = carTable.getValueAt(selectedRow, 2);
        Object model = carTable.getValueAt(selectedRow, 3);
        
        car.setPlate("" + plate);
        LBLcarName.setText("" + brand + " " + name + " " + model);
        
        ResultSet rs = null;
        
        try{
            rs = Connector.retrieveSum(car.getPlate());
            if (rs != null && rs.next()) {
                double carNet = rs.getDouble("carNet");
                TFcarNet.setText(String.valueOf(carNet));
            } else {
                TFcarNet.setText("0"); // or handle it as you need
            }
            
            rs.close();
            
            rs = Connector.retrieveCount(car.getPlate());
            if (rs != null && rs.next()) {
                int rentCount = rs.getInt("rentals");
                TFcarBookings.setText(String.valueOf(rentCount));
            } else {
                TFcarBookings.setText("0"); // or handle it as you need
            }
            
            rs.close();
            
            rs = Connector.retrieveImage(car.getPlate());
            if(rs != null && rs.next()){
                String path = rs.getString("car_image_path");
                Blob image = rs.getBlob("car_image");
                if (image != null && path != null){
                    byte[] bytes = image.getBytes(1, (int) image.length());

                    try(FileOutputStream fos = new FileOutputStream(path)){
                        fos.write(bytes);
                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                    
                    ImageIcon icon = new ImageIcon(bytes);
                    Image img = icon.getImage().getScaledInstance(251, 147, Image.SCALE_SMOOTH);
                    LBLcarImg.setIcon(new ImageIcon(img));
                }else{
                    LBLcarImg.setIcon(null);
                }
            }
            Connector.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void BTNaddtransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNaddtransActionPerformed
        this.dispose();
        SelectTransaction st = new SelectTransaction(currentUser);
        st.show();
    }//GEN-LAST:event_BTNaddtransActionPerformed

    private void BTNlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CarRental logIn = new CarRental();
        logIn.show();
    }//GEN-LAST:event_BTNlogoutActionPerformed

    private void BTNeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeditActionPerformed
        EditCar editcar = new EditCar(this);
        editcar.show();
    }//GEN-LAST:event_BTNeditActionPerformed

    private void TFcarBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcarBookingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcarBookingsActionPerformed

    private void BTNstatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNstatsActionPerformed
        Reporting reporting = new Reporting(currentUser);
        reporting.show();
    }//GEN-LAST:event_BTNstatsActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNadd;
    private javax.swing.JButton BTNaddtrans;
    private javax.swing.JButton BTNedit;
    private javax.swing.JButton BTNlogout;
    private javax.swing.JButton BTNstats;
    private javax.swing.JLabel LBLcarImg;
    private javax.swing.JLabel LBLcarName;
    private javax.swing.JTextField TFcarBookings;
    private javax.swing.JTextField TFcarNet;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
