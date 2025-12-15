
class Random {

    protected String name = "Rajesh Waghmode";

    public void print() {
        System.out.println("printing");
    }

}


public class Main extends Random {

    public void print() {
        System.out.println("Printing in Main");
    }
    
    public static void main(String[] args) {
        
        Main obj = new Main();
        
        obj.print();
        System.out.println(obj.name);
    }
}
