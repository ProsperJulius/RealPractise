package onlineproblems;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
    Twitter twitter=null;

    @BeforeEach
    public void setUp(){
         twitter=new Twitter();
    }

    @Test
    public  void getUserFeeds(){
        twitter.postTweet(1,2);
        twitter.postTweet(1,3);
        twitter.follow(2,1);
        twitter.follow(3,1);
        twitter.postTweet(3,8);
        twitter.postTweet(2,5);
        assertEquals(twitter.getNewsFeed(1).size(),4);

    }

}
