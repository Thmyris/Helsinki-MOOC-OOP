
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            String w;
            System.out.println("Type a word: ");
            w=reader.nextLine();
            if(w.isEmpty()){
                System.out.println("You typed the following words: ");
                Collections.sort(words);
                
                     
                for(String i:words){
                    System.out.println(i);
                    
                }
                break;
            }
            words.add(w);
            
        }
    }
}
