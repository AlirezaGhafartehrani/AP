import java.util.*;
public class OddChecking {
    public static void main (String [] args) {
        System.out.println("Please input two integers");
        Scanner inputStream = new Scanner(System.in);
        int num1 = inputStream.nextInt();
        int num2 = inputStream.nextInt();
        if (num1 > num2 && num1 % num2 == 0)
            System.out.println("Two numbers are divisible");
        else if (num2 >= num1 && num2 % num1 == 0)
            System.out.println("Two numbers are divisible");
        else System.out.println("Two numbers are NOT divisible");
    }
}
