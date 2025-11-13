


/*
    A method is a block of code which only runs when it is called.
    You can pass data, known as parameters, into a method.
    Methods are used to perform certain actions, and they are also known as functions.
    Why use methods? To reuse code: define the code once, and use it many times.
*/


public class Method {

    void myMethod() {
        System.out.println("this is  my method");
    }

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Parameters and Arguments with Method
    void printTheParameters(int age, String name, String bio) {
        System.out.println("age:" + age);
        System.out.println("age:" + name);
        System.out.println("bio: " + bio);
    }
    
    
    public static void main(String[] args) {
        
        Method obj = new Method();
        obj.myMethod();

        int[] array = {34,65,77,523,454,45};
        obj.printArray(array);

        obj.printTheParameters(34,"Rajesh Waghmode", "Computer Engineer");

        

    }

}
