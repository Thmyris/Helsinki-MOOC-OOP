
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        if (a % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");

    }
}
