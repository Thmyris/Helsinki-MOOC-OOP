import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = Integer.parseInt(reader.nextLine());
        int b = 2;
        int fac = 1;
        
        
        while (b<=a){
            if(a == 1 || a == 0){
                System.out.println("1");
                break;
            }
            
            fac = fac * b;
            b++;
            
            
        }
        System.out.println(fac);
    }
}
