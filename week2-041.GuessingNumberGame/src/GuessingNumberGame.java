
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        //**********************************************//
        int counter = 0;
        while(true){
            System.out.println("Guess a number: ");
            int nb = Integer.parseInt(reader.nextLine());
            counter++;
            if (nb < numberDrawn){
                System.out.println("the number is greater, guesses made: "+ counter);
                continue;
            }
            else if (nb > numberDrawn){
                System.out.println("the number is lesser, guesses made: "+ counter);
                continue;
            }
            else if(nb == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
