
public class Threading extends Thread {

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("the line");
        }
    }

    public static void main(String[] args) {

        Threading obj = new Threading();
        obj.start();
        obj.run();
        System.out.println("Hey I am there");

    }
}
