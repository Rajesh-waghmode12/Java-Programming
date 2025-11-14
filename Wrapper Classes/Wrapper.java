
public class Wrapper {
    

    public static <L> void printArray(L[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        

        Integer number = 34234;
        System.out.println(number.toString().length());

        String name = "Rajesh Waghmode             ";
        System.out.println(name.equals("something"));
        System.out.println(name.length());
        name = name.trim(); 
        System.out.println(name.length());
        String[] names = name.split("");

        Byte num = 34;
        printArray(names);


        

    }
}
