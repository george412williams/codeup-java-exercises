//package OopLecture;
import java.util.Date;

//example to demonstrate static
public class Post {

    //what is in a blog:
    public Date createdAt;
    public Date editedAt;
    public String title;
    public String content;
    //number of characters, meta data that is built in data we're tracking already, like counting in content
    public String category;
    //username, ex of own custom type to be kept track of by a property
    public Person author;

    //need a method that can summarize all this and verify the info of this particular obj
        //similar with Dish to printSummary()

    public void printSummary() {
        System.out.printf("Title: %s%nContent: %s", this.title, this.content);
    }
    //so we've added an instance method, will need access to properties unique to it created in the application
    //lets use it: in OopLecture.java

    //silly static example, between two blog posts, which has longest title, something that is not specific to an instance bc of mult posts

    public static String returnLongerPostTitle(Post p1, Post p2){
   //not only custom classes, can create methods that accept own methods and return also
        if (p1.title.length() > p2.title.length()) {
            return p1.title;
        }else{
            return p2.title;
        }
    }

    public static void main(String[] args) {
        //returnLongerPostTitle()
                //don't use this w static meths and properties
        Post post1 = new Post();
        post1.title = "Flipper Returns";

        Post post2 = new Post();
        post2.title = "Oh no we crashed";
        String longerTitle = Post.returnLongerPostTitle(post1, post2);
        System.out.println(longerTitle);

            //example of one tool, if many, pull returnLonger... and put into toolbag, lots that can be done
                //search for posts on certain date
                //make method that searches through and pulls out that info, all kinds of special things with posts

        //note again static field particulart to the app, and nonstatic is specific to that post, unique
    }

}
