


public class Main {
    


    
    public static void main(String[] args) {
        
        // normal string which is immutable and tread safety
        String name = "Rajesh Waghmode";
        String name1 = "Rajesh Waghmode";
        System.out.println(name == name1);


        //StringBuffer 

        StringBuffer str = new StringBuffer("Rajesh");
        StringBuffer str1 = new StringBuffer("Rajesh");

        str.append(" hello");
        String e = str.toString();
        str.append(" Navin");

        System.out.println(e);
        System.out.println(str);
        System.out.println(str == str1);

        
    }

}
