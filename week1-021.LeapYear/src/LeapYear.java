
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        reader.nextLine();
        if ((a % 100 != 0) && (a % 4 == 0)){
            System.out.println("The year is a leap year.");
        }
        else if (a % 100 == 0 && a % 400 == 0)
            System.out.println("The year is a leap year.");
        else
            System.out.println("The year is not a leap year.");
    }
}
