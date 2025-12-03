import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(62);

        // list.forEach(obj -> System.out.println(obj));

        /*
         * System.out.println(list.stream()
         * .filter(n -> n % 2 ==0)
         * .map(n -> n * 2)
         * .toList()
         * );
         * 
         * 
         * System.out.println(
         * list.stream()
         * .filter(n -> n % 2 == 0)
         * .toList()
         * );
         * 
        
         * 
         * System.out.println(
         * list.stream()
         * .map(n -> n % 2 == 0)
         * .toList()
         * );
        
         * System.out.println(
         * list.stream()
         * .flatMap(n -> )
         * );
         * 
         */
        
        //  System.out.println(
        // list.stream()
        //     .parallel()
        //     .toList()
        //  );


       
    }

}
