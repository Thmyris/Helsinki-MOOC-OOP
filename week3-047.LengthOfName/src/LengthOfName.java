
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        String word;
        int nb;
        System.out.println("Type your name: ");
        word = reader.nextLine();
        nb = calculateCharacters(word);
        System.out.println(nb);
        
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        System.out.println("Number of characters: ");
        return text.length();
        
    }
    
}
