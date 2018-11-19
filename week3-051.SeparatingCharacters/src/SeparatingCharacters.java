
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text;
        int a = 0;
        text = reader.nextLine();
        char c;
        
        
        while (text.length() > a){
            c = text.charAt(a);
            System.out.println((a+1) + ". character: "+c);
            a++;
        }
        
        
        
    }
    
}
