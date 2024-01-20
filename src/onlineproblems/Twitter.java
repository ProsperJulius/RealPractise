package onlineproblems;

import java.util.*;

class Twitter {

    /** Initialize your data structure here. */
    Map<Integer,List<Integer>> tweets=null;
    Map<Integer, Set<Integer>> followerFollowee=null;
    public Twitter() {
      tweets=  new LinkedHashMap<>();
      followerFollowee=new LinkedHashMap<>();

    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        List<Integer> userTweets=tweets.get(userId);
        if(userTweets!=null){
            userTweets.add(tweetId);
        }else {
            userTweets=new ArrayList<>();
            userTweets.add(tweetId);
            tweets.put(userId,userTweets);
        }
    }
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> userTweets=getUserTweets(userId);
        List<Integer> followersTweets=getFollowersTweets(userId);
        if(userTweets!=null && followersTweets!=null){
            userTweets.addAll(followersTweets);
            return userTweets;
        }else if(userTweets==null){
            return followersTweets;
        }else {
            return userTweets;
        }


    }
    public List<Integer> getUserTweets(int userId){
        List<Integer> userTweets=tweets.get(userId);
        Set<Integer> followers=followerFollowee.get(userId);
        if(userTweets!=null){

            return userTweets;
        }
        return null;
    }
    public List<Integer> getFollowersTweets(int userId){
        Set<Integer> followers=followerFollowee.get(userId);
        ArrayList<Integer> followersTweets=new ArrayList<>();
        for(Integer follower : followers){
            List<Integer> userTweets= getUserTweets(follower);
        if(userTweets!=null) {
            followersTweets.addAll(userTweets);
        }

        }
        return followersTweets;

    }
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        Set<Integer> follersList=followerFollowee.get(followeeId);
        if(follersList!=null){
            follersList.add(followerId);
         followerFollowee.put(followeeId,follersList);
        }else{
            follersList=new HashSet<>();
            follersList.add(followerId);
            followerFollowee.put(followeeId,follersList);
        }
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> followersList=followerFollowee.get(followeeId);
        if(followersList!=null){
            followersList.remove(followerId);
        }

    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */