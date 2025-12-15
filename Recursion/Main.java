
import java.util.concurrent.TimeUnit;

public class Main {
    
    public static int  hello(int number) {
        if (number > 10) {
            return number + 1;
        }

        System.out.println(number);
        System.out.println(number);
        return hello(number+1);
    }
    public static void main(String[] args) {
    
        System.out.println(hello(1));
    }
}
