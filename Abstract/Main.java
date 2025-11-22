
abstract class Car {

    public abstract void fly();

    public abstract void changeColor();

    public void drive() {
        System.out.println("Driving ...");
    }
}


abstract class WagonR extends Car {

    @Override
    public void fly() {

        System.out.println("The car is flying .....");
    }

}


class Maruti extends WagonR {

    @Override
    public void changeColor() {
        System.out.println("The Car changing the color ...");
    }
    
    @Override
    public void fly() {
        System.out.println("the car is flying under Maruti");
    }
}

public class Main {


    public static Car getObject() {
        return new Maruti();
    }

    public static void main(String[] args) {
        
        Car obj = new Maruti();

        obj.fly();
        obj.drive();

        Car another = getObject();
        another.fly();
        another.drive();;
        another.changeColor();;

    }
}
