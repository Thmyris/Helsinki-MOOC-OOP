public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
       int temp= 0;
       while (temp < amount){
           System.out.print("*");
           temp++;
       }
        System.out.println("");
 
    }

    public static void printWhitespaces(int amount) {
        int a=0;
        while(a<amount){
            System.out.print(" ");
            a++;
        }
    }

    public static void printTriangle(int size) {
        int b=0;
        int c=size;
        while(b<size){
            printWhitespaces(c-1);
            printStars(b+1);
            b++;
            c--;
        }
    }

    public static void xmasTree(int height) {
        int d=0;
        int e=height;
        int whileCounter=0;
        while(whileCounter<height){
            printWhitespaces(e-1);
            printStars(d+1);
            d+=2;
            e--;
            whileCounter++;
            
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
        
        

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(7);
    }
}
