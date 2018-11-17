package c325_project;

import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterAPI {

    //METHODS ==================================================================
    public void ShowTweets() throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("iARj2yVmPwMMHaEo9PJgc9R60")
                .setOAuthConsumerSecret("ATeQfjwGt0GGy2tbttXguIFkRe7H7OZC7RcpPiPH9LaNwzDsdJ")
                .setOAuthAccessToken("1059604074994249729-CffFKaWxv4cgD80gBpSIRkNhpdkdjy")
                .setOAuthAccessTokenSecret("hE4V8KmJrpf8gdDBus63hZYDIYdSMYhRHFIE6rAabh6MI");

        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = tf.getInstance();
      
        //Get Username and Status from Twitter
        List<Status> status = twitter.getHomeTimeline();
        for (Status st : status) {
            System.out.println(st.getUser().getName() + "------" + st.getText());
        }
    }

    //MAIN METHOD FOR DEBUGGING ================================================
    public static void main(String[] args) throws TwitterException {
        TwitterAPI TwitterAPIObject = new TwitterAPI();
        TwitterAPIObject.ShowTweets();
    }
}
