


interface InnerInter {

    String name = "Rajesh Waghmode";

    void show();

    default void multer() {
        System.out.println("in interface ");
    }

    static void any() {
        System.out.println("this is any");
    }
}

interface Another {
    void show();

    void another();
}



public class Inter implements InnerInter, Another {
    
    public void show() {
        System.out.println("this is an implemented  method");
    }

    public static void main(String[] args) {

        InnerInter obj = new Inter();
        Another obj1 = new Inter();
        obj.show();
        obj1.another();

    }

    @Override
    public void another() {
        System.out.println("this is another");
    }
}
