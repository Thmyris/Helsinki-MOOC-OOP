
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does not print anything, it RETURNS the reversed string
        //get the string, find out its length, print it 1 by 1 backwards
        //then add the chars to a new helper string
        String helper="";
        int a=0;
        
        
        while (a < text.length()){
            helper = helper + text.charAt(text.length() - (1+a));
            a++;
        }
        return helper;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
