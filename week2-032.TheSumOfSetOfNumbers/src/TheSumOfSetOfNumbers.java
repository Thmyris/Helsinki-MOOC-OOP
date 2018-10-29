
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nereye kadar dogal sayilar toplansin?: ");
        int a = Integer.parseInt(reader.nextLine());
        int b = 1;
        int top=0;
        
        while (b<=a){
            top= top + b;
            b++;
            
            
        }
        System.out.println(top);
    }
}
