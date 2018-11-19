import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text;
        int a = 1;
        System.out.println("Type your name: ");
        text=reader.nextLine();
        System.out.print("In reverse order: ");
        
        while (a < text.length()+1){
            System.out.print(text.charAt(text.length()-a));
            a++;
        }
        System.out.println("");
        
        
    }
}
