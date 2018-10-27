
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //1st person
        System.out.println("Type your name: ");
        String name1 = reader.nextLine();
        System.out.println("Type your age: ");
        int age1 = reader.nextInt();
        reader.nextLine(); //EITHER DO THIS FOR NEXTINT OR (21st line)
        
        //Scanner reader2 = new Scanner(System.in);
        //2nd person
        System.out.println("Type your name: ");
        String name2 = reader.nextLine();
        System.out.println("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine()); //OR USE THIS
         
		
        System.out.println(name1 + " and " + name2 + " are " +(age1+age2)+ " years old in total.");




       
        
        //int b;
        //a= "ahmet";
        //b= 2;
        //System.out.println(b);
        //System.out.println(a);
        
        // Implement your program here
    }
}
