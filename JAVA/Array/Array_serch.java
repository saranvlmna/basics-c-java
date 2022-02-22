import java.util.Scanner;

public class Array_serch {
    public static void main(String[] args) {
        // input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter limit");
        // get limit
        int limit = s.nextInt();
        System.out.println("Enter Values");
        // declare array
        int[] values = new int[100];
        // save value at position
        for (int i = 0; i < limit; i++) {
            values[i] = s.nextInt();
        }
        // get serch key
        System.out.println("Enter Serch Key");
        int serchkey = s.nextInt();
        // set a key & valu 0
        int flag = 0;
        // serch
        for (int i = 0; i < limit; i++) {
            if (serchkey == values[i]) {
                flag = 1;
                break;
            }

        }
        // print
        if (flag == 1) {
            System.out.println("Value founded");
        } else {
            System.out.println("Value Not Founded");
        }
    }
}
