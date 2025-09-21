import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // task 1:
        System.out.println(task1.spinWords("Hey fellow warriors"));
        System.out.println(task1.spinWords("This is a test"));
        System.out.println(task1.spinWords("This is another test"));

        //task 2:
        int number = 1234;
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Count of 1s: " + task2.countBits(number));
    }
}
