package Oops.Polymorphism;


class Student {
    String name;
    int age;
    boolean isValid;
    

    Student(String name, int age, boolean isValid) {
        this.name =  name;
        this.age = age;
        this.isValid = isValid;
    }
    
    void printInfo(String name) {
        System.out.println(this.name);
    }

    void printInfo(int age) {
        System.out.println(this.age);
    }

    void printInfo(boolean isValid) {
        System.out.println(this.isValid);
    }
}



public class Main {
    
    public static void main(String[] args) {
        
        Student s1 = new Student("Rajesh Waghmode", 34, true);

        s1.printInfo("Avinash");
        
    }
}
