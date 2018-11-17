package c325_project;

public class PurchaseViewerScreen extends javax.swing.JFrame {

    //BudgetScreen CONSTRUCTOR =================================================
    public PurchaseViewerScreen() {
        initComponents();

        //Set Username Label
        lblUsername.setText(main.currentUser.getUserID());
        //Set Account Amount Display
        lblAmount.setText(main.currentUser.getCheckingAccount().getBalance().toString());

        //SystemOutput the ArrayList DEBUG
        for (int index = 0; index < main.currentUser.getPurchaseArrayList().size(); index++) {
            System.out.println(main.currentUser.getPurchaseArrayList().get(index).getName());
        }
    }

    //GENERATED CODE ===========================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogSavings = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblSavingsBalance = new javax.swing.JLabel();
        txtNewSavingsBalance = new javax.swing.JTextField();
        btnSavingsBalanceOK = new javax.swing.JButton();
        dialogChecking = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblCheckingBalance = new javax.swing.JLabel();
        txtNewCheckingBalance = new javax.swing.JTextField();
        btnCheckingBalanceOK = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        cboxBankAccount = new javax.swing.JComboBox();
        btnEnter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        cboxSort = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchases = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnTips = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFix = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();

        dialogSavings.setMinimumSize(new java.awt.Dimension(354, 170));
        dialogSavings.setResizable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fix your SAVINGS account balance");

        jLabel10.setText("Current balance:");

        jLabel11.setText("New balance:");

        lblSavingsBalance.setText("balance");

        btnSavingsBalanceOK.setText("OK");
        btnSavingsBalanceOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavingsBalanceOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogSavingsLayout = new javax.swing.GroupLayout(dialogSavings.getContentPane());
        dialogSavings.getContentPane().setLayout(dialogSavingsLayout);
        dialogSavingsLayout.setHorizontalGroup(
            dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogSavingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogSavingsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSavingsBalanceOK))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addGroup(dialogSavingsLayout.createSequentialGroup()
                        .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSavingsBalance)
                            .addComponent(txtNewSavingsBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dialogSavingsLayout.setVerticalGroup(
            dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogSavingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblSavingsBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNewSavingsBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSavingsBalanceOK)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        dialogChecking.setMinimumSize(new java.awt.Dimension(354, 170));
        dialogChecking.setResizable(false);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Fix your CHECKING account balance");

        jLabel12.setText("Current balance:");

        jLabel13.setText("New balance:");

        lblCheckingBalance.setText("balance");

        btnCheckingBalanceOK.setText("OK");
        btnCheckingBalanceOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckingBalanceOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCheckingLayout = new javax.swing.GroupLayout(dialogChecking.getContentPane());
        dialogChecking.getContentPane().setLayout(dialogCheckingLayout);
        dialogCheckingLayout.setHorizontalGroup(
            dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dialogCheckingLayout.createSequentialGroup()
                        .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCheckingBalance)
                            .addComponent(txtNewCheckingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCheckingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCheckingBalanceOK)))
                .addContainerGap())
        );
        dialogCheckingLayout.setVerticalGroup(
            dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblCheckingBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNewCheckingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCheckingBalanceOK)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Planner");
        setResizable(false);

        lblUsername.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("username");

        cboxBankAccount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Checking", "Savings" }));
        cboxBankAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxBankAccountActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter Purchase");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Purchase Viewer");

        jLabel3.setText("Select your account:");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnSearch.setText("Search Purchases");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Search");

        jToggleButton1.setText("View All");

        jLabel7.setText("Sort by");

        cboxSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "Category", "Price" }));

        tblPurchases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "Amount", "Category", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPurchases);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxSort, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(cboxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setText("Amount   $");

        btnSend.setText("Send Email");

        btnTips.setText("Financial TIps");
        btnTips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipsActionPerformed(evt);
            }
        });

        btnLog.setText("Log Out");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnFix.setText("Fix Amount");
        btnFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixActionPerformed(evt);
            }
        });

        lblAmount.setText("<amount>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFix, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(cboxBankAccount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLog))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboxBankAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnSend)
                            .addComponent(lblAmount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFix)
                            .addComponent(btnTips))))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SEARCH BUTTOM ============================================================
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO Budget Screen Search Button
    }//GEN-LAST:event_btnSearchActionPerformed

    //LOG OUT BUTTON ===========================================================
    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed

        if (evt.getSource() == btnLog) {
            //Save User Information
            main.WriteObjectToFile(main.currentUser, main.currentUserFile);

            //Go to next screen
            LogInScreen MainScreen = new LogInScreen();
            this.dispose();
            MainScreen.setVisible(true);
        }
    }//GEN-LAST:event_btnLogActionPerformed

    //ACCOUNT COMBO BOX ========================================================
    private void cboxBankAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxBankAccountActionPerformed

        //Select checking items if checking is selected
        if (cboxBankAccount.getSelectedItem() == "Checking") {
            lblAmount.setText(main.currentUser.getCheckingAccount().getBalance().toString());
        }

        //Select savings items if savings is selected
        if (cboxBankAccount.getSelectedItem() == "Savings") {
            lblAmount.setText(main.currentUser.getSavingsAccount().getBalance().toString());
        }
    }//GEN-LAST:event_cboxBankAccountActionPerformed

    //FIX ACCOUNT BALANCE BUTTON ===============================================
    private void btnFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixActionPerformed

        //load checking settings and dialog box
        if (cboxBankAccount.getSelectedItem() == "Checking") {
            lblCheckingBalance.setText(main.currentUser.getCheckingAccount().getBalance().toString());
            dialogChecking.setVisible(true);
        }

        //load savings settings and dialog box
        if (cboxBankAccount.getSelectedItem() == "Savings") {
            lblSavingsBalance.setText(main.currentUser.getSavingsAccount().getBalance().toString());
            dialogSavings.setVisible(true);
        }
    }//GEN-LAST:event_btnFixActionPerformed

    //SAVINGS ACCOUNT BALANCE FIX DIALOG BOX ===================================
    private void btnSavingsBalanceOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavingsBalanceOKActionPerformed

        //set balance, reset data for database, reset index, close dialog box
        main.currentUser.getSavingsAccount().setBalance(Double.parseDouble(txtNewSavingsBalance.getText()));
        main.database.GenericStatement("DELETE FROM BANK_ACCOUNTS WHERE ACCOUNT_NAME = 'Savings'");
        main.database.InsertStatement("BANK_ACCOUNTS", "'Savings', " + txtNewSavingsBalance.getText());

        cboxBankAccount.setSelectedIndex(1);
        dialogSavings.dispose();
    }//GEN-LAST:event_btnSavingsBalanceOKActionPerformed

    //CHECKING ACCOUNT BALANCE FIX DIALOG BOX ==================================
    private void btnCheckingBalanceOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckingBalanceOKActionPerformed

        //set balance, reset index, close dialog box
        main.currentUser.getCheckingAccount().setBalance(Double.parseDouble(txtNewCheckingBalance.getText()));
        main.database.GenericStatement("DELETE FROM BANK_ACCOUNTS WHERE ACCOUNT_NAME = 'Checking'");
        main.database.InsertStatement("BANK_ACCOUNTS", "'Checking', " + txtNewCheckingBalance.getText());

        cboxBankAccount.setSelectedIndex(0);
        dialogChecking.dispose();
    }//GEN-LAST:event_btnCheckingBalanceOKActionPerformed

    //ENTER PURCHASE BUTTON ====================================================
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        //Open the EnterPurchaseScreen Window
        EnterPurchaseScreen purchase = new EnterPurchaseScreen();
        dispose();
        purchase.setVisible(true);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnTipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipsActionPerformed

        //Open the TwitteAPI Window
        TwitterAPIForm TwitterForm =  new TwitterAPIForm();
        dispose();
        TwitterForm.setVisible(true);
    }//GEN-LAST:event_btnTipsActionPerformed

    //MAIN METHOD ==============================================================
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
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseViewerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Display Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseViewerScreen().setVisible(true);
            }
        });
    }

    //JFRAME VARIABLES =========================================================
    // <editor-fold defaultstate="collapsed" desc=" JFrame Variables ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckingBalanceOK;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnFix;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnSavingsBalanceOK;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnTips;
    private javax.swing.JComboBox cboxBankAccount;
    private javax.swing.JComboBox cboxSort;
    private javax.swing.JDialog dialogChecking;
    private javax.swing.JDialog dialogSavings;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCheckingBalance;
    private javax.swing.JLabel lblSavingsBalance;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblPurchases;
    private javax.swing.JTextField txtNewCheckingBalance;
    private javax.swing.JTextField txtNewSavingsBalance;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
