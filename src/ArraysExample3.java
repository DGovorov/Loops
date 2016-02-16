/**
 * Created by User on 16.02.2016.
 */
public class ArraysExample3 {
    public static void main(String[] args) {

        int[] array = {3, 5, 9, 1, 8};

        int min = array[0];      // Integer.MAX_VALUE

        for (int element : array){
            min = (element < min) ? element : min;    // min = Math.min(element, min);
        }
        System.out.println(min);

    }
}
