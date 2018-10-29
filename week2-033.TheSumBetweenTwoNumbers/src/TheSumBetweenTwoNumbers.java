
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        int top = 0;
        while (a<=b){
            
            top +=a;
            a++;
            
        }
        System.out.println(top);
    }
}
