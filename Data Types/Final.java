import java.util.ArrayList;
import java.util.List;

class Students {
    final int data;
    final String name;
    int age = 23;

    public Students(int data, String name) {
        this.name = name;
        this.data = data;
    }
    
    final void printName() {
        System.out.print(name);
    }

    void printSomething(){
        System.out.println(" hellow world");
    }
}

public class Final extends Students {

    int age = 3232;

    public Final(int data, String name) {
        super(data, name);

    }

    public void print() {
        System.out.println(age);
        System.out.println(super.age);
    }
    
    public static void main(String[] args) {
        
        Final obj = new Final(23, "Rajesh");

        // obj.name = "Ganesh";
        // obj.printName();
        // Final.printSomething();
        // System.out.println("hellow world");
        // Final.printSomething();
        // Final.printName();
        // System.out.println(Final.data);
        // System.out.println(super.printSomething());
        // super.printSomething();

        
        // System.out.println(super.age);
        // Final.print();
        
        // Students object = new Students(45, "ravi");
        // System.out.println(object.age);
        // System.out.println(obj.name);
        // obj.print();

    }

}
