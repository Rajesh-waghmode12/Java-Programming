
interface Car {

    String name = "Rajesh Waghmode";

    void show();

    void config();
}



class Another implements Car {
    
    public void show() {
        System.out.println("show");
    }

    public void config() {
        System.out.println("config");
    }
}


public class Main {
    

    public static void main(String[] args) {
        
        Car obj = new Another();
        obj.config();
        obj.show();

        System.out.println(Car.name);
        System.out.println(obj.name);
        
        Car obj2 = new Car() {
            
            public void show() {
                System.out.println("Aother show");
            }
            
            public void config() {
                System.out.println("Another config");
            }
        };
        
        obj2.show();
        obj2.config();
        System.out.println(obj2.name);
    }
}