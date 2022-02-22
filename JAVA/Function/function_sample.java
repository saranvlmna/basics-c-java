import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class function_sample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Tow Number");
        // get two numbers
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        // result
        // calling function
        int result = sum(num1, num2);
        // print
        System.out.println("Result is: " + result);
    }

    // function defnition
    static int sum(int a, int b) {
        int result = a + b;
        // return value
        return result;
    }
}