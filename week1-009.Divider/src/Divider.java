
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        double nb1 = reader.nextDouble();
        System.out.println("Type another number: ");
        double nb2 = reader.nextDouble();
        double result;
        System.out.println("Division: "+ nb1 +("/")+ nb2 +("=")+ (nb1 / nb2));
        
        
        // Implement your program here. Remember to ask the input from user.
    }
}
