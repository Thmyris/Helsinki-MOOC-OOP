import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int x=0;
        for(Integer i: list){
            x+=i;
        }
        return x;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double x;
        x = ((double) sum(list))/(list.size());
        return x;
    }

    public static double variance(ArrayList<Integer> list) {
        double x = average(list);
        double var=0.0;
        for(Integer i: list){
            var+=Math.pow((((double)i)-x),2);
            
        }
        return var/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
