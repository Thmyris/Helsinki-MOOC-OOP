
import java.util.ArrayList;

public class AverageOfNumbers {

    
    public static int sum(ArrayList<Integer> list) {
        int x=0;
        for(Integer i: list){
            x+=i;
        }
        return x;
    }
    

    public static double average(ArrayList<Integer> list) {
        double x;
        x = ((double) sum(list))/(list.size());
        return x;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
