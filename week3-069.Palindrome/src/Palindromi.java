import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String helper="";
        int a=0;
        while (a<text.length()){
            helper += text.charAt(text.length() - 1 - a);
            a++;
        }
        if(helper.equals(text)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
