/**
 * Created by User on 16.02.2016.
 */
public class ArraysExample2 {
    public static void main(String[] args) {

        int[] array = {3, 5, 9, 1, 8};

        int i = 0;
        int sum = 0;
        while (i <= 4){
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);


    }
}
