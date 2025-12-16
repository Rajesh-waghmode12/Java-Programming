
abstract class Another {

    public abstract void abstractMethod();

    public  void show(){
        System.out.println("this show");
    }
}


public class Abstract {
    
    
    public static void main(String[] args) {

        Another obj = new Another() {

            @Override
            public void abstractMethod() {
                System.out.println("this is abstract method");
            }
            
        };

        obj.abstractMethod();
        obj.show();
        
    }
}
