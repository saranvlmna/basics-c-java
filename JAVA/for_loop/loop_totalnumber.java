package for_loop;

import java.util.Scanner;

public class loop_totalnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Value");
        int value = s.nextInt();
        int sum = 0;
        for (int i = 0; i < value; i++) {
            sum = sum + i;
        }
        System.out.println("Result is; " + sum);
    }
}
