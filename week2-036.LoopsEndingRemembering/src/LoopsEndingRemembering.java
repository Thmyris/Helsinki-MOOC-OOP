import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type number: ");
        int sum = 0;
        int a;
        int counter=0; // (-1) has been added to the counter everytime it gets written into the terminal because I wanted to very simply avoid division by zero
        double avg=0.0;
        int evenCounter=0;
        
        while (true){
            counter+=1;
            a = Integer.parseInt(reader.nextLine());
            if (a%2==0){
                evenCounter+=1;
            }
            if (a == -1){
                break;
            }

            sum += a;
            avg = (double) sum / (double) counter;
        }
        if (a==-1){
            System.out.println("Thank you and see you later!");
        }
        System.out.println("How many numbers: "+ (counter-1) );
        System.out.println("Even numbers: "+ evenCounter);
        System.out.println("Odd numbers: "+ ((counter-1) - evenCounter));
        System.out.println("Average: "+avg);
        System.out.println("The sum is: "+ sum);
        
        
        //--------------------------------------------------------------------//
        
        
        
    }
}
