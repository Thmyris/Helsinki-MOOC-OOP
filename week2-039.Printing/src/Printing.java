public class Printing {

    public static void printStars(int amount) {
       int temp= 0;
       while (temp < amount){
           System.out.print("*");
           temp++;
       }
        System.out.println("");
 
    }

    public static void printSquare(int sideSize) {
        int temp2 = 0;
        
        while(temp2 < sideSize){
        printStars(sideSize);
        temp2++;
        }
    }

    public static void printRectangle(int width, int height) {
        int a=0;
        while(a < height){
            printStars(width);
            a++;
        }
    }

    public static void printTriangle(int size) {
        int b=0;
        while (b < size){
            printStars(b+1);
            b++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
