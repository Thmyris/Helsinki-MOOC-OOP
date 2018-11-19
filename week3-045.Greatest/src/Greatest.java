
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
    //MY SOLUTION AKA CRAPPIEST SOLUTION THIS WORLD HAS EVER SEEN. IT IS AS IF VARIABLES WERE NOT A THING WHEN I WROTE THIS.
    /*  if (number1 == number2)
            if (number2 > number3)
                return number2;
            else
                return number3;
        
        if (number1 == number3)
            if(number1 > number2)
                return number1;
            else
                return number2;
        if (number2 == number3)
            if(number2 > number1)
                return number2;
            else
                return number1;
        
        if (number1 > number2 && number1 > number3)            
            return number1;
        if (number2 > number3 && number2 > number1)
            return number2;
        if (number3 > number1 && number3 > number2)
            return number3;
    
        return 0;
   */
    
    //AND HERES TMC's SOLUTION:
        int greatest = number1;
        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }
        return greatest;
      
        
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
