package c325_project;

import java.io.*;

public class LogInScreen extends javax.swing.JFrame {

    //MainScreen CONSTRUCTOR ===================================================
    public LogInScreen() {
        initComponents();
    }

    //GENERATED CODE ===========================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogFileNotFoundLoginError = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        btnOK_dialogFileNotFoundLoginError = new javax.swing.JButton();
        dialogCreateAccountError = new javax.swing.JDialog();
        lblCreateAccountError = new javax.swing.JLabel();
        btnOK_dialogCreateAccountError = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtUserIDCreate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUserIDLogin = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        dialogFileNotFoundLoginError.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogFileNotFoundLoginError.setTitle("File not found");
        dialogFileNotFoundLoginError.setSize(new java.awt.Dimension(450, 150));

        jLabel8.setText("The username provided does not exist! Please register a new account!");

        btnOK_dialogFileNotFoundLoginError.setText("OK");
        btnOK_dialogFileNotFoundLoginError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK_dialogFileNotFoundLoginErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogFileNotFoundLoginErrorLayout = new javax.swing.GroupLayout(dialogFileNotFoundLoginError.getContentPane());
        dialogFileNotFoundLoginError.getContentPane().setLayout(dialogFileNotFoundLoginErrorLayout);
        dialogFileNotFoundLoginErrorLayout.setHorizontalGroup(
            dialogFileNotFoundLoginErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFileNotFoundLoginErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogFileNotFoundLoginErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOK_dialogFileNotFoundLoginError)
                    .addComponent(jLabel8))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        dialogFileNotFoundLoginErrorLayout.setVerticalGroup(
            dialogFileNotFoundLoginErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFileNotFoundLoginErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnOK_dialogFileNotFoundLoginError)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        dialogCreateAccountError.setTitle("Create Account Error");
        dialogCreateAccountError.setSize(new java.awt.Dimension(450, 150));

        lblCreateAccountError.setText("ERROR MESSAGE");

        btnOK_dialogCreateAccountError.setText("OK");
        btnOK_dialogCreateAccountError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK_dialogCreateAccountErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCreateAccountErrorLayout = new javax.swing.GroupLayout(dialogCreateAccountError.getContentPane());
        dialogCreateAccountError.getContentPane().setLayout(dialogCreateAccountErrorLayout);
        dialogCreateAccountErrorLayout.setHorizontalGroup(
            dialogCreateAccountErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCreateAccountErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateAccountError)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCreateAccountErrorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK_dialogCreateAccountError)
                .addGap(43, 43, 43))
        );
        dialogCreateAccountErrorLayout.setVerticalGroup(
            dialogCreateAccountErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCreateAccountErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateAccountError)
                .addGap(18, 18, 18)
                .addComponent(btnOK_dialogCreateAccountError)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register / Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("createProfile"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Financial Tracker");

        jLabel2.setText("First Name");

        jLabel3.setText("UserID");

        jLabel4.setText("Last Name");

        btnNext.setLabel("Next");
        btnNext.setName(""); // NOI18N
        btnNext.setNextFocusableComponent(txtUserIDLogin);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtFirstName.setFocusCycleRoot(true);
        txtFirstName.setNextFocusableComponent(txtLastName);

        txtLastName.setNextFocusableComponent(txtUserIDCreate);

        jLabel5.setText("Create Account");

        jLabel6.setText("Log In");

        jLabel7.setText("UserID");

        txtUserIDLogin.setNextFocusableComponent(btnLogin);

        btnLogin.setText("Log In");
        btnLogin.setNextFocusableComponent(btnCancel);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName)
                            .addComponent(txtUserIDCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserIDLogin)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtUserIDLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUserIDCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(24, 24, 24)
                .addComponent(btnNext)
                .addGap(32, 32, 32)
                .addComponent(btnCancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //NEXT BUTTON ==============================================================
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        //Next button event source
        if (evt.getSource() == btnNext) {

            if (txtFirstName.getText().equals("")) {
                dialogCreateAccountError.setVisible(true);
                lblCreateAccountError.setText("Please Enter your First Name!");
                System.out.println("First Name Textbox Empty");
                return;
            } else if (txtLastName.getText().equals("")) {
                dialogCreateAccountError.setVisible(true);
                lblCreateAccountError.setText("Please Enter your Last Name!");
                System.out.println("Last Name Textbox Empty");
                return;
            } else if (txtUserIDCreate.getText().equals("")) {
                dialogCreateAccountError.setVisible(true);
                lblCreateAccountError.setText("Please Enter a username!");
                System.out.println("Username Textbox Empty");
                return;
            }

            //Setup File Path to use to test if the user already exists
            File existTest = new File("./users/" + txtUserIDCreate.getText());
            //Check if the username already exists
            if (existTest.exists()) {
                dialogCreateAccountError.setVisible(true);
                lblCreateAccountError.setText("That username already exists!");
                System.out.println("Username already exists");
                return;
            }

            //Set the Current User's variables
            main.currentUser.setFirstName(txtFirstName.getText());
            main.currentUser.setLastName(txtLastName.getText());
            main.currentUser.setUserID(txtUserIDCreate.getText());
            
            //Dispose this current window and move on to the next Window
            CreateBudgetScreen CreateBudgetScreen = new CreateBudgetScreen();
            dispose();
            CreateBudgetScreen.setVisible(true);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    //LOGIN BUTTON =============================================================
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        //Set the Variables needed in this method
        String userID;
        Object tempObj;

        //Try to read the user's file
        try {
            //Grab Username from txtBox
            userID = txtUserIDLogin.getText();
            //Setup Filepaths using the username provided
            main.currentUserFile = new File("./users/" + userID + "/" + userID + ".dat");

            //Read Object and save into a temporary Object
            tempObj = main.ReadObjectFromFile(main.currentUserFile);

            //Checking the null of temp object
            if (tempObj == null) {
                dialogFileNotFoundLoginError.setVisible(true);
                return;
            }

            //Cast the tempObject into the current user
            main.currentUser = (User) tempObj;

            //Instantiate Database
            main.database = new Database();

            //Show next Screen
            PurchaseViewerScreen PurchaseViewerWindow = new PurchaseViewerScreen();
            dispose();
            PurchaseViewerWindow.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    //CANCEL BUTTON ============================================================
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        if (evt.getSource() == btnCancel) {
            dispose();
            System.exit(0);
        }

    }//GEN-LAST:event_btnCancelActionPerformed

    //FILE NOT FOUND DIALOG BOX OK BUTTON ======================================
    private void btnOK_dialogFileNotFoundLoginErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK_dialogFileNotFoundLoginErrorActionPerformed
        dialogFileNotFoundLoginError.dispose();
    }//GEN-LAST:event_btnOK_dialogFileNotFoundLoginErrorActionPerformed

    //CREATE ACCOUNT DIALOG BOX OK BUTTON ======================================
    private void btnOK_dialogCreateAccountErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK_dialogCreateAccountErrorActionPerformed
        dialogCreateAccountError.dispose();
    }//GEN-LAST:event_btnOK_dialogCreateAccountErrorActionPerformed

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
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Display Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInScreen().setVisible(true);
            }
        });
    }

    //JFRAME VARIABLES =========================================================
    // <editor-fold defaultstate="collapsed" desc=" JFrame Variables ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOK_dialogCreateAccountError;
    private javax.swing.JButton btnOK_dialogFileNotFoundLoginError;
    private javax.swing.JDialog dialogCreateAccountError;
    private javax.swing.JDialog dialogFileNotFoundLoginError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCreateAccountError;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtUserIDCreate;
    private javax.swing.JTextField txtUserIDLogin;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
