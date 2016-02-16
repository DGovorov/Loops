/**
 * Created by User on 16.02.2016.
 */
public class Rating {
    public static void main(String[] args) {

        int amount = 100;
        String rating = "good";
        double result = 0;

        switch (rating){
            case "terrible":
                result = amount;
                break;
            case "good":
                result = amount + amount*0.05;
                break;
            case "nice":
                result = amount + amount*0.1;
                break;
            case "great":
                result = amount + amount*0.2;
                break;
            default:
                System.out.println("Unknown rating");

        }
        System.out.println(result);

    }
}
