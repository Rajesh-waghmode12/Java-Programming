class Pen {

    // member of class
    String name;
    String type;

    // Member function fo class
    void print() {
        System.out.println("Writing something");
    }

}

class Student {

    String name;
    int age;

    // Constructer
    Student() {
        System.out.println("this is constructer");
    }

    // Copy Constructer
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

}

public class Opps {

    public static void main(String[] args) {

        // Pen pen = new Pen();
        // pen.name = "Boll Pen";
        // pen.type = "Pointer";
        // pen.print();

        // Student s1 = new Student();
        // System.out.println(s1.age);
        // System.out.println(s1.name);

        Student s1 = new Student();
        s1.name = "Rajesh Waghmode";
        s1.age = 23;

        Student s2 = new Student(s1);
        System.out.println(s1.name);
        System.out.println(s2.name);
        s2.name = "Ganesh Thengal";
        System.out.println(s2.name);
        System.out.println(s1.name);
        
        Student s3 = s2;
        s3.name = "Avinash Waghmode";
        System.out.println(s2.name);



    }

}
