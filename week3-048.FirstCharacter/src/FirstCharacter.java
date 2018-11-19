import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text;
        char character;
        System.out.println("Type your name: ");
        text = reader.nextLine();
        character = firstCharacter(text);
        System.out.println("First character: ");
        System.out.println(character);
        
    }
    public static char firstCharacter(String t){
        
        return t.charAt(0);
    }
}
