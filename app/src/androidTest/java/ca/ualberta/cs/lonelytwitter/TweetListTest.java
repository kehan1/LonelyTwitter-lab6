package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by kehanwang on 2018/2/15.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

   /* public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }*/



    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(tweet.getDate(),tweet.getDate());
    }


    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        try{
            tweets.add(tweet);
        }catch (IllegalArgumentException e){
            assertEquals(e.getClass(), IllegalArgumentException.class);
        }
    }



    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        Tweet tweet2 = new NormalTweet("adding another noraml Tweet");
        tweets.add(tweet2);
        Tweet returnedTweet1 = tweets.getTweet(0);
        Tweet returnedTweet2= tweets.getTweet(1);
        assertEquals(returnedTweet1, tweet);
        assertEquals(returnedTweet2, tweet2);
    }


    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        ArrayList<Tweet> countAllList = tweets.getAllTweet();
        assertEquals(countAllList.size(),tweets.tweetSize());
    }
}
