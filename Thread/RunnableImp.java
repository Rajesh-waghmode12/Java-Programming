

// class A implements Runnable{

//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("hi");
//         }
//     }
// }

// class B implements Runnable{

//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("hello");
//         }
//     }
// }



public class RunnableImp {

    public static void main(String[] args) {
        
        Runnable obj = new Runnable(){
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hi");
                }
            }
        };
        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("hello");
                }
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }

}
