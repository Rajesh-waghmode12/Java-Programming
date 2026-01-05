abstract class AbstractClass {

    void Method() {
        System.out.println("hello world");
    }

    abstract void normal();
}


abstract class Randoms {
    abstract void normal();
}



public class Another {
    

    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass() {
            @Override
            public void normal() {
                System.out.println("this is abstract method");
            }
        };
       obj.Method();
       obj.normal();
       Randoms object = new Randoms() {
           @Override
           void normal() {
               System.out.println("hello world");
           }
       };

    }
    
}
