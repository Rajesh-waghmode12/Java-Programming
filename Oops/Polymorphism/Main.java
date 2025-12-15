

class Animal {

    public int num = 34;

    public void makeSound() {
        System.out.println("the is animal Method");
    }
}

class Dog extends Animal {

    public int num = 4;
    
    @Override
    public void makeSound() {
        System.out.println("this is dog method");
    }
}

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
        
        // Student s1 = new Student("Rajesh Waghmode", 34, true);

        // s1.printInfo("Avinash");
        
        Animal obj = new Dog();
        obj.makeSound();
        System.out.println(obj.num);
    }
}
