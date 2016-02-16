/**
 * Created by User on 16.02.2016.
 */
public class Factorial {
    public static void main(String[] args) {

        int i = 5;
        int numFactorial = 1;

        while (i > 0){
            numFactorial = numFactorial * i;
            i--;
        }
        System.out.println(numFactorial);

    }
}
