


class Outer {

    String name = "Rajesh Waghmode";
    
    
    public void show() {
        System.out.println("Inside Outer class");
    }

    class Inner {

        String name = "Avinash Waghmode";
        
        public void show() {
            System.out.println("Inside a Inner class");
        }

        public void another() {
            System.out.println("This is method of inner class another");
        }
    }

    
}





public class Main {
    
    public static void main(String[] args) {
        
        Outer obj = new Outer();
        obj.show();
        System.out.println(obj.name);
        
        Outer.Inner object = obj.new Inner();
        
        object.another();
        object.show();;
        System.out.println(object.name);
    }

}
