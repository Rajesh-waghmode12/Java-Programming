import java.util.ArrayList;
import java.util.List;

public class Main {

    private String name;

    public Main(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        /*
         * List<Integer> list = new ArrayList<>();
         * list.add(12);
         * list.add(15);
         * list.add(62);
         * 
         * // list.forEach(obj -> System.out.println(obj));
         * 
         * 
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
         * 
         * System.out.println(
         * list.stream()
         * .map(n -> n % 2 == 0)
         * .toList()
         * );
         * 
         * System.out.println(
         * list.stream()
         * .flatMap(n -> )
         * );
         * 
         * 
         * 
         * System.out.println(
         * list.stream()
         * .parallel()
         * .toList()
         * );
         */

        List<String> list = new ArrayList<>(List.of("Rakesh", "Suresh", "Ramesh", "Ganesh"));
        Main obj = new Main("Person");

        // list.forEach(System.out::println);
        // list.forEach(obj::print);

        List<String> anList = new ArrayList<>(List.of("34", "33", "67", "66"));
        List<Integer> numbers = anList.stream()
                .map(Integer::parseInt)
                .toList();

        numbers.forEach(ele -> System.out.println(ele.getClass()));
    }

    public void print(String ele) {
        System.out.println("[" + name + "] LOG: " + ele);
    }

}
