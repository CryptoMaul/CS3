public class Tweet{
    private String message;
    private int retweets;
    private int likes;

    public Tweet(String m, int r, int l){
        message = m;
        retweets = r;
        likes = l;
    }
    public void addLikes(int l){
        likes += l;
    }
    public void addRetweets(int r){
        retweets += r;
    }
    public boolean notLiked(){
        if(likes < 10){
            return true;
        }
        return false;
    }
    public boolean kindaLiked(){
        if(likes > retweets){
            return true;
        }
        return false;
    }
    public boolean isTrending(){
        if(likes + retweets > 75){
            return true;
        }
        return false;
    }
    public String toString(){
        return "msg " + message + " rt " + retweets + " lk " + likes ; 
    }
}