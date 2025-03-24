import java.util.*;

public class RepeatString
{
    public static void main(String[] args) {
        String text = "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
        //String text = "Abhijit Mondal";
        List<String> list = Arrays.asList(text.split(" "));
        Set<String> uniqueWord = new HashSet<String>(list);
        for(String word:uniqueWord){
            System.out.println(word +" : "+ Collections.frequency(list, word));
        }
    }
}
