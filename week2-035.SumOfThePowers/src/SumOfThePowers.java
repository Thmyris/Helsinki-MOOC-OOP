
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //USE 
        //int result = (int)Math.pow(2, 3)
        //TODO calculate the powers of 2 until n and sum all of it up.
        
        int a = Integer.parseInt(reader.nextLine());
        int b = 0;
        int sum=0;
        
        while (b <= a){
            int result = (int)Math.pow(2, b);
            sum = sum + result;
            b++;
            
        }
        System.out.println(sum);
        
        //2^0+ 2^1 +...+ 2^n = 2^(n+1)-1  :D
        //just realized this
    }
}
