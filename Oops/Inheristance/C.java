
public class C extends B {

    public String name = "Ganseh Thengal";

    public void print() {
        super.print();
        System.out.println("this is C method");
    }


    public static void main(String[] args) {
        
        C obj = new C();

        obj.print();
    }
    
}
