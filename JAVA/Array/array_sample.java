
import java.util.Scanner;

public class array_sample {

    public static void main(String ar[]) {
        // input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Limit");
        // get limit
        int limit = s.nextInt();
        System.out.println("Enter Values");
        // get values
        // declare array
        int[] value = new int[100];
        for (int i = 0; i < limit; i++) {
            // save values of array position
            value[i] = s.nextInt();
        }
        // print
        System.out.println("Values are:");
        // print value
        for (int i = 0; i < limit; i++) {
            System.out.println("" + value[i]);
        }
    }
}