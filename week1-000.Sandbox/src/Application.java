import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        /*        String name1 = "Anne";
        String name2 = "Green";
        greet( name1 + " " + name2 );

        int age = 24;
        greet("John " + age + " years");
         */

/*        String animal = "Dog";

        if (animal.equals("Dog")) {
            System.out.println(animal + " says bow-wow");
        } 
        else if (animal.equals("Cat")) {
            System.out.println(animal + " says meow meow");
        }

    }

    public static void greet(String name) {
        System.out.println("Hi " + name + ", greetings from the world of methods!");
    }
*/
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(2);
    for (Integer i: list){
        System.out.println(i);
    }
    list.remove(3);
    
    for (Integer i: list){
        System.out.println(i);
    }
    
        
    }
    
        
        
    
}
