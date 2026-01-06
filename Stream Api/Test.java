import java.util.ArrayList;
import java.util.List;


class Normal {
    
    String name;

    public Normal(String name) {
        this.name = name;
    }

    public String printSomething() {
        return this.name;
    }
}


public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Rajesh", "Sumit", "Avinash"));

        List<String> anList = list.stream()
                .map(String::trim)
                .toList();

        System.out.println(anList);

        List<Normal> nList = new ArrayList<>(List.of(
            new Normal("Rajesh"),
                new Normal("Karan"),
            new Normal("Ravi")
        ));

        List<String> reList = nList.stream().map(Normal::printSomething).toList();
        System.out.println(reList);
        
        List<Normal> dList = list.stream().map(Normal::new).toList();

        for (Normal obj : dList) {
            System.out.println(obj.printSomething());
        }

    }

}
