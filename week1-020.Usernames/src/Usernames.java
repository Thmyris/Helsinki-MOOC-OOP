
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String id1 = "alex";
        String id2 = "emily";
        String pw1 = "mightyducks";
        String pw2 = "cat";
        
        System.out.println("Type your username: ");
        String idInput = reader.nextLine();
      
        System.out.println("Type your password: ");
        String pwInput = reader.nextLine();
        
        if(idInput.equals("alex") && pwInput.equals("mightyducks"))
            System.out.println("You are now logged into the system!");
        else if(idInput.equals("emily") && pwInput.equals("cat"))
            System.out.println("You are now logged into the system!");
        else
            System.out.println("Your username or password was invalid!");
    }
}
