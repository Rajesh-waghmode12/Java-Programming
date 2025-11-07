class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        // System.out.println("hellow world I am Rajesh Waghmode !");


        // System.out.println(Byte.SIZE / 8);
        // System.out.println(Short.SIZE / 8);
        // System.out.println(Integer.SIZE / 8);
        // System.out.println(Long.SIZE / 8);
        // System.out.println(Float.SIZE / 8);
        // System.out.println(Double.SIZE / 8);


        // byte so = 34;
        // short som = 353;
        // int some = 3465;
        // long somet = 34556;
        // float someth = 34.34f;
        // double somethi = 3245.45345;


        // System.out.println(so);
        // System.out.println(som);
        // System.out.println(som);
        // System.out.println(some);
        // System.out.println(somet);
        // System.out.println(someth);

        int[] scores = { 23, 53, 62 };

        Student s1 = new Student("Rajesh", scores);
        Student s2 = new Student(s1.name, s1.marks);

        System.out.println(s1);
        System.out.println(s2);
        
        s1.marks[0] = 1000;
        s1.name = "Ravi";
        System.out.println(s2.marks[0]);
        System.out.println(s2.name);
        System.out.println(s1.name);

        
    }
}
