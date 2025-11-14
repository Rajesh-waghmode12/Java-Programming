
interface Random {

    int show(int i, int j);
    
    default String printName(String name) {
        return name;
    }
    
    default void printSomething() {
        
        System.out.println("i am in something method");
    }
}



public class Demo {
    

    public static void main(String[] args) {
        
        Random obj = (int i, int j) -> {
            if (i == 2) {
                return i + j + 23;
            }
            return 0;
        };
        
        System.out.println(obj.show(2, 5));
        // obj.printSomething();
    }
}