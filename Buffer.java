package Java_ConsoleWays;

// Java Program to implement
// Buffer Reader Class
import java.io.*;
class Buffer {
    public static void main(String[] args)
        throws IOException
    {
        // Enter data using BufferReader
        BufferedReader read = new BufferedReader(
            new InputStreamReader(System.in));
        // Reading data using readLine
        String x = read.readLine();
        // Printing the read line
        System.out.println(x);
    }
}