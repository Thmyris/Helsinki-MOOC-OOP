import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text;
        char ch1,ch2,ch3;
        System.out.println("Type your word: ");
        text = reader.nextLine();
     
        
        if (text.length()>2){
            ch1 = text.charAt(0);
            ch2 = text.charAt(1);
            ch3 = text.charAt(2);
            System.out.println("1. character: "+ ch1);
            System.out.println("2. character: "+ ch2);
            System.out.println("3. character: "+ ch3);
            
        }
        
    }
}
