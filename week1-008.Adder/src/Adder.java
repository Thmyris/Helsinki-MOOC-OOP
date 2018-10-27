
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int nb1 = reader.nextInt();
        System.out.println("Type another number: ");
        int nb2 = reader.nextInt();
        System.out.println("Sum of the numbers: "+ (nb1 + nb2));
        
        // Implement your program here. Remember to ask the input from user
    }
}
