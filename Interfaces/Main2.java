

@FunctionalInterface
interface A {
    void print();

    public static void another() {
        System.out.println("this is another");
    }

}


public class Main2 {


    public static void main(String[] args) {
        
        A obj = () -> System.out.println("printing .. "); 
        obj.print();
        A.another();

    }

}
