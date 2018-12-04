package c325_project;

public class EmailAPIForm extends javax.swing.JFrame {

    //CONSTRUCTOR===============================================================
    public EmailAPIForm() {
        initComponents();
    }

    //GENERATED CODE============================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtemailAddress = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email Address:");

        btnSend.setLabel("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSend)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtemailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtemailAddress.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        //retrieves amount spent for each category from the database
        double Total = main.database.SumTotal();
        double homeExpensesTotal = main.database.SumTableCategories("Home Expenses");
        double transportationTotal = main.database.SumTableCategories("Transportation");
        double healthTotal = main.database.SumTableCategories("Health");
        double charityTotal = main.database.SumTableCategories("Charity");
        double dailyLivingTotal = main.database.SumTableCategories("Daily Living");
        double entertainmentTotal = main.database.SumTableCategories("Entertainment");
        double financialTotal = main.database.SumTableCategories("Financial");

        //manipulates retrieved data to find percentage spent on each category
        double homeExpensePercentage = Math.round(homeExpensesTotal / Total * 10000.0) / 100.0;
        double transportationPercentage = Math.round(transportationTotal / Total * 10000.0) / 100.0;
        double healthPercentage = Math.round(healthTotal / Total * 10000.0) / 100.0;
        double charityPercentage = Math.round(charityTotal / Total * 10000.0) / 100.0;
        double dailyLivingPercentage = Math.round(dailyLivingTotal / Total * 10000.0) / 100.0;
        double entertainmentPercentage = Math.round(entertainmentTotal / Total * 10000.0) / 100.0;
        double financialPercentage = Math.round(financialTotal / Total * 10000.0) / 100.0;

        //Sets up Paramaters, Instantiates EmailAPI and sends Email to User
        String Recipient = txtemailAddress.getText();
        String Subject = "Financial Tracker Budget Breakdown";
      
        String Message = "As requested here is your budget breakdown:\nHome Expenses: " + Double.toString(homeExpensePercentage)
                + "%\nTransportation: " + Double.toString(transportationPercentage) + "%\nHealth: "
                + Double.toString(healthPercentage) + "%\nCharity: " + Double.toString(charityPercentage) + "%\nDaily Living: "
                + Double.toString(dailyLivingPercentage) + "%\nEntertainment: " + Double.toString(entertainmentPercentage)
                + "%\nFinancial: " + Double.toString(financialPercentage) + "%\nTotal Money Spent: " + Double.toString(Total);
      
        EmailAPI Email = new EmailAPI();
        Email.sendEmail(Recipient, Subject, Message);
    }//GEN-LAST:event_btnSendActionPerformed

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
            java.util.logging.Logger.getLogger(EmailAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailAPIForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtemailAddress;
    // End of variables declaration//GEN-END:variables
}
