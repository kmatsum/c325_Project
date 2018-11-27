package c325_project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EnterPurchaseScreen extends javax.swing.JFrame {

    //DEFAULT CONSTRUCTOR ======================================================
    public EnterPurchaseScreen() {
        initComponents();
    }

    //GENERATED CODE ===========================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogAmountWrong = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        btnAmountOK = new javax.swing.JButton();
        dialogDateWrong = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        btnDateOK = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dialogAmountNegative = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        btnAmountNegativeOK = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboxCategory = new javax.swing.JComboBox();
        btnEnter = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnChecking = new javax.swing.JRadioButton();
        btnSavings = new javax.swing.JRadioButton();

        dialogAmountWrong.setResizable(false);
        dialogAmountWrong.setSize(new java.awt.Dimension(200, 100));
        dialogAmountWrong.setType(java.awt.Window.Type.POPUP);

        jLabel8.setText("Your amount must be a valid double.");

        btnAmountOK.setText("OK");
        btnAmountOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmountOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAmountWrongLayout = new javax.swing.GroupLayout(dialogAmountWrong.getContentPane());
        dialogAmountWrong.getContentPane().setLayout(dialogAmountWrongLayout);
        dialogAmountWrongLayout.setHorizontalGroup(
            dialogAmountWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAmountWrongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogAmountWrongLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAmountOK)
                .addContainerGap())
        );
        dialogAmountWrongLayout.setVerticalGroup(
            dialogAmountWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAmountWrongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAmountOK)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        dialogDateWrong.setResizable(false);
        dialogDateWrong.setSize(new java.awt.Dimension(200, 100));
        dialogDateWrong.setType(java.awt.Window.Type.POPUP);

        jLabel9.setText("Your date must be entered with");

        btnDateOK.setText("OK");
        btnDateOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateOKActionPerformed(evt);
            }
        });

        jLabel10.setText("exact formatting as shown.");

        javax.swing.GroupLayout dialogDateWrongLayout = new javax.swing.GroupLayout(dialogDateWrong.getContentPane());
        dialogDateWrong.getContentPane().setLayout(dialogDateWrongLayout);
        dialogDateWrongLayout.setHorizontalGroup(
            dialogDateWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDateWrongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogDateWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogDateWrongLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogDateWrongLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDateOK)))
                .addContainerGap())
        );
        dialogDateWrongLayout.setVerticalGroup(
            dialogDateWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDateWrongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dialogDateWrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogDateWrongLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDateOK))
                    .addGroup(dialogDateWrongLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        dialogAmountNegative.setMinimumSize(new java.awt.Dimension(350, 150));
        dialogAmountNegative.setResizable(false);
        dialogAmountNegative.setSize(new java.awt.Dimension(350, 150));
        dialogAmountNegative.setType(java.awt.Window.Type.POPUP);

        jLabel11.setText("You do not have enough money in your account.");

        btnAmountNegativeOK.setText("OK");
        btnAmountNegativeOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmountNegativeOKOKActionPerformed(evt);
            }
        });

        jLabel12.setText("Enter a lower amount or cancel the purchase");

        jLabel13.setText("and fix the account balance.");

        javax.swing.GroupLayout dialogAmountNegativeLayout = new javax.swing.GroupLayout(dialogAmountNegative.getContentPane());
        dialogAmountNegative.getContentPane().setLayout(dialogAmountNegativeLayout);
        dialogAmountNegativeLayout.setHorizontalGroup(
            dialogAmountNegativeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAmountNegativeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogAmountNegativeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogAmountNegativeLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogAmountNegativeLayout.createSequentialGroup()
                        .addGroup(dialogAmountNegativeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnAmountNegativeOK)))
                .addContainerGap())
        );
        dialogAmountNegativeLayout.setVerticalGroup(
            dialogAmountNegativeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAmountNegativeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAmountNegativeOK)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter New Purchase");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("New Purchase");

        jLabel2.setText("Amount");

        jLabel4.setText("Description");

        jLabel5.setText("Date");

        txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel6.setText("MMM d, yyyy (Ex: Jan 1, 2000)");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel3.setText("Name");

        jLabel7.setText("Category");

        cboxCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Home Expenses", "Transportation", "Health", "Charity", "Daily Living", "Entertainment", "Financial" }));

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnChecking);
        btnChecking.setSelected(true);
        btnChecking.setText("Checking");

        buttonGroup1.add(btnSavings);
        btnSavings.setText("Savings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(22, 22, 22)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChecking)
                            .addComponent(btnSavings))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSavings)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnter)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ENTER BUTTON =============================================================
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        //Create balance and purchase object
        Purchase purchase = new Purchase();
        double newBalance;

        //VALIDATION CHECKS ====================================================
        //Check amount validity
        if (main.doubleIsParsable(txtAmount.getText()) == false) {
            dialogAmountWrong.setVisible(true);
            return;
        }

        //Check date validity, if valid, then add to purchase, else return
        try {
            Date purchaseDate = new SimpleDateFormat("yyyy-MM-dd").parse(txtDate.getText());
            purchase.setDateTime(purchaseDate);
        } catch (ParseException e) {
            dialogDateWrong.setVisible(true);
            e.printStackTrace();
            return;
        }

        //Update balances of checking or savings
        if (btnChecking.isSelected() == true) {
            //Subtract entered amount from current balance to get new balance
            newBalance = main.currentUser.getCheckingAccount().getBalance() - Double.parseDouble(txtAmount.getText());
            //check new balance validity
            if (newBalance < 0) {
                dialogAmountNegative.setVisible(true);
                return;
            }
            //Set new balance
            main.currentUser.getCheckingAccount().setBalance(newBalance);
            //Update database
            main.database.GenericStatement("DELETE FROM BANK_ACCOUNTS WHERE ACCOUNT_NAME = 'Checking'");
            main.database.InsertStatement("BANK_ACCOUNTS", "'Checking', " + newBalance);
        }

        if (btnSavings.isSelected() == true) {
            //Subtract entered amount from current balance to get new balance
            newBalance = main.currentUser.getSavingsAccount().getBalance() - Double.parseDouble(txtAmount.getText());
            //check new balance validity
            if (newBalance < 0) {
                dialogAmountNegative.setVisible(true);
                return;
            }
            //Set new balance
            main.currentUser.getSavingsAccount().setBalance(newBalance);
            //Update database
            main.database.GenericStatement("DELETE FROM BANK_ACCOUNTS WHERE ACCOUNT_NAME = 'Savings'");
            main.database.InsertStatement("BANK_ACCOUNTS", "'Savings', " + newBalance);
        }

        //Set the rest of the purchase variables
        purchase.setAmount(Double.parseDouble(txtAmount.getText()));
        purchase.setCategory(cboxCategory.getSelectedItem().toString());
        purchase.setDescription(txtDescription.getText());
        purchase.setName(txtName.getText());

        //Set the Bank of the Purchase Object
        if (btnChecking.isSelected() == true) {
            purchase.setBank("Checking");
        }
        if (btnSavings.isSelected() == true) {
            purchase.setBank("Savings");
        }

        //Add purchase to purchase array, increase index
        main.currentUser.getPurchaseArrayList().add(purchase);

        //Add purchase to database
        main.database.InsertStatement("PURCHASES", purchase.getAmount() + ", '" + purchase.getDescription() + "', "
                + this.convertUtilToSql(purchase.getDateTime()) + ", '" + purchase.getName() + "', '" + purchase.getBank() + "', '" + purchase.getCategory() + "'");

        //Go back to budget screen
        PurchaseViewerScreen PurchaseViewerWindow = new PurchaseViewerScreen();
        dispose();
        PurchaseViewerWindow.setVisible(true);

    }//GEN-LAST:event_btnEnterActionPerformed

    //CANCEL BUTTON ============================================================
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        //Go back to budget screen
        PurchaseViewerScreen PurchaseViewerWindow = new PurchaseViewerScreen();
        dispose();
        PurchaseViewerWindow.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    //DIALOG AMOUNT WRONG OK BUTTON ============================================
    private void btnAmountOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmountOKActionPerformed

        //Close the Dialog Window
        dialogAmountWrong.dispose();
    }//GEN-LAST:event_btnAmountOKActionPerformed

    //DIALOG DATE WRONG OK BUTTON ==============================================
    private void btnDateOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateOKActionPerformed

        //Close the Dialog Window
        dialogDateWrong.dispose();
    }//GEN-LAST:event_btnDateOKActionPerformed

    //DIALOG AMOUNT NEGATIVE OK BUTTON =========================================
    private void btnAmountNegativeOKOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmountNegativeOKOKActionPerformed

        //Close the Dialog Window
        dialogAmountNegative.dispose();
    }//GEN-LAST:event_btnAmountNegativeOKOKActionPerformed

    //MAIN METHOD FOR THIS CLASS ===============================================
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
            java.util.logging.Logger.getLogger(EnterPurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterPurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterPurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterPurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Display Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterPurchaseScreen().setVisible(true);
            }
        });
    }
    
    //METHOD FOR CONVERTING DATE 
    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }


    //JFRAME VARIABLES =========================================================
    //<editor-fold defaultstate="collapsed" desc=" JFrame Varables ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmountNegativeOK;
    private javax.swing.JButton btnAmountOK;
    private javax.swing.JButton btnCancel;
    private javax.swing.JRadioButton btnChecking;
    private javax.swing.JButton btnDateOK;
    private javax.swing.JButton btnEnter;
    private javax.swing.JRadioButton btnSavings;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboxCategory;
    private javax.swing.JDialog dialogAmountNegative;
    private javax.swing.JDialog dialogAmountWrong;
    private javax.swing.JDialog dialogDateWrong;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
