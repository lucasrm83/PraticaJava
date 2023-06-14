package postsEComments;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip bro!");
        Comment c2 = new Comment("Enjoy it!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Travelling to new Zeland",
                "Im going to visits this wornderfull conuntry", 12);
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the force be with you!");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good Night guys!",
                "See you tomorrow", 5);
        p2.addComment(c3);
        p2.addComment(c4);
        System.out.println(p2);
    }

}
