package c325_project;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterAPIForm extends javax.swing.JFrame {

    //VARIABLES ================================================================
    String[] TwitterAPIOutput = new String[50];
    int count = 0;
    
    //CONSTRUCTOR ==============================================================
    public TwitterAPIForm() {
        initComponents();

    }

    //GENERATED CODE ===========================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        txtAreaOutput = new javax.swing.JTextArea();
        btnShowTweets = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("Financial Advice and Links:");

        txtAreaOutput.setColumns(20);
        txtAreaOutput.setRows(5);
        jScrollPane.setViewportView(txtAreaOutput);

        btnShowTweets.setText("Show Tweets");
        btnShowTweets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTweetsActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(35, 35, 35)
                        .addComponent(btnShowTweets)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(0, 270, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnShowTweets)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnShowTweetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTweetsActionPerformed
        try {
            ConfigurationBuilder cb = new ConfigurationBuilder();

            cb.setDebugEnabled(true)
                    .setOAuthConsumerKey("iARj2yVmPwMMHaEo9PJgc9R60")
                    .setOAuthConsumerSecret("ATeQfjwGt0GGy2tbttXguIFkRe7H7OZC7RcpPiPH9LaNwzDsdJ")
                    .setOAuthAccessToken("1059604074994249729-CffFKaWxv4cgD80gBpSIRkNhpdkdjy")
                    .setOAuthAccessTokenSecret("hE4V8KmJrpf8gdDBus63hZYDIYdSMYhRHFIE6rAabh6MI");

            TwitterFactory tf = new TwitterFactory(cb.build());
            twitter4j.Twitter twitter = tf.getInstance();

            //Get Username and Tweet from Twitter
            List<Status> status = twitter.getHomeTimeline();
            for (Status st : status) {
                String tweetMessage = st.getUser().getName() + "\t------\t" + st.getText() + "\n\n";
                txtAreaOutput.append(tweetMessage);
            }
        } catch (TwitterException ex) {
            Logger.getLogger(TwitterAPIForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowTweetsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Go back to previous form
        CreateBudgetScreen BS = new CreateBudgetScreen();
        dispose();
        BS.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    //MAIN METHOD FOR DEBUG ====================================================
    public static void main(String args[]) throws TwitterException {
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
            java.util.logging.Logger.getLogger(TwitterAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwitterAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwitterAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwitterAPIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Display the Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwitterAPIForm().setVisible(true);
            }
        });
    }

    //JFRAME VARIABLES =========================================================
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnShowTweets;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtAreaOutput;
    // End of variables declaration//GEN-END:variables
}
