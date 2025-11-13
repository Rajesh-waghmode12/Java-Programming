



public class Recursion {

    static int  addnumbers(int[] array , int i) {
        if (i >= array.length) {
            return 0;
        }
        return array[i] + addnumbers(array, i + 1);
    }

    public static void main(String[] args) {
        
        int[] array = { 23, 5, 56, 62, 32 };
        
        System.out.println(addnumbers(array, 0));

    }

}
