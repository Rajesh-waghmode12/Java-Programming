
// java does not support float for accepting the valuse because it make precision low and that could cause bugs


public class Overloading {


    static void printSum(int num, int num2) {
        System.out.println("This is float Integer");
        System.out.println(num + num2);
    }

    static void printSum(float num, float num2) {
        System.out.println("This is float method");
        System.out.println(num + num2);
    }
    
    public static void main(String[] args) {
        
        printSum(34,324);
        printSum((float)34.6, (float)3.8);
    }
}
