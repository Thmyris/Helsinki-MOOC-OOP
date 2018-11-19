import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text;
        char letter;
        System.out.println("Type your name: ");
        text = reader.nextLine();
        letter = lastCharacter(text);
        System.out.println("Last character: "+letter);
    }
    public static char lastCharacter(String t){
        return t.charAt(t.length()-1);
    }
}
