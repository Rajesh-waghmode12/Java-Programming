import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Find {
    

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("Random", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hi Random");
        
        if (matcher.find()) {
            System.out.println("the pattern found ... ");
        }
        else {
            System.out.println("the pattern not found");
            
        }


    }

}
