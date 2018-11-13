/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c325_project;

/**
 *
 * @author Jon
 */
import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
/**
 *
 * @author Jon
 */
public class TwitterAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("iARj2yVmPwMMHaEo9PJgc9R60")
                .setOAuthConsumerSecret("ATeQfjwGt0GGy2tbttXguIFkRe7H7OZC7RcpPiPH9LaNwzDsdJ")
                .setOAuthAccessToken("1059604074994249729-CffFKaWxv4cgD80gBpSIRkNhpdkdjy")
                .setOAuthAccessTokenSecret("hE4V8KmJrpf8gdDBus63hZYDIYdSMYhRHFIE6rAabh6MI");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = tf.getInstance();
        
        //get username, status
        
       List<Status> status = twitter.getHomeTimeline();
       for(Status st : status){
           System.out.println(st.getUser().getName()+"------"+st.getText());
       }
        
    }
    
}
