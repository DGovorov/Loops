/**
 * Created by User on 16.02.2016.
 */
public class Switch {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        String operation = "add";

        int result = 0;


        switch(operation){
            case "add":
                result = a + b;
                break;
            case "aubtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                result = a / b;
                break;
            default:
                System.out.println("Unknown operation");

        }

        System.out.println(result);


    }
}
