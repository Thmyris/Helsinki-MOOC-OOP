import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text;
        int nb; 
        System.out.println("Type a word: ");
        text = reader.nextLine();
        System.out.println("Length of the end part: ");
        nb = Integer.parseInt(reader.nextLine());
        System.out.println("Result: "+ text.substring(text.length()-nb));
        
    }
}
