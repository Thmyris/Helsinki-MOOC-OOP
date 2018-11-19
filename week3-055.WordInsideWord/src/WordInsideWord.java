
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String txt1,txt2;
        int a,b;
        System.out.println("Type the first word: ");
        txt1 = reader.nextLine();
        
        System.out.println("Type the second word: ");
        txt2 = reader.nextLine();
        
        a=txt1.length();
        b=txt2.length();
        
        
        if (txt1.indexOf(txt2) != -1){
            System.out.println("The word '"+ txt2 + "' is found in the word '" +txt1 +"'.");
        }
        
        else {
            System.out.println("The word '"+ txt2 + "' is not found in the word '" +txt1 +"'.");

        }
        
    }
}
