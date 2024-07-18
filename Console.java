package Java_ConsoleWays;

// Java program to implement input
// Using Console Class
public class Console {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String x = System.console().readLine();
        System.out.println("You entered string " + x);
    }
}