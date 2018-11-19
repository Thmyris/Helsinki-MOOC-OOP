
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.println("Type a word: ");
            String w;
            w = reader.nextLine();
            if(words.contains(w)){
                System.out.println("You gave the word "+w+"twice.");
                break;
            }
            words.add(w);
        }
        
        
    }
}
