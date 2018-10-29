// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application {

    public static void main(String[] args) {
        String name1 = "Anne";
        String name2 = "Green";
        greet( name1 + " " + name2 );

        int age = 24;
        greet("John " + age + " years");
       
    }
    
    public static void greet(String name) {
        System.out.println("Hi " + name + ", greetings from the world of methods!");
    }
}
