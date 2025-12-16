
class Outer {

    String name = "Rajesh Waghmode";

    public void show() {
        System.out.println("Inside Outer class");
    }

    static class Inner {

        String name = "Avinash Waghmode";

        public void show() {
            System.out.println("Inside a Inner class");
        }

        public void another() {
            System.out.println("This is method of inner class another");
        }
    }

}

class Out {
    
    public void show() {
        System.out.println("in Out show");
    }

    public void any() {
        System.out.println("this is non static any");
    }
}

public class Main {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();
        System.out.println(obj.name);

        Outer.Inner object = new Outer.Inner();

        object.another();
        object.show();
        ;
        System.out.println(object.name);

        Out obj1 = new Out() {
            public void show() {
                System.out.println("in Anynomoues show");
            }

            @Override
            public  void any() {
                System.out.println("this is static method");
            }
        };

        obj1.show();
        obj1.any();
    }
    

}
