import java.util.Scanner;

public class nested_if {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Largest Number is: " + num1);
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("Largest Number is: " + num2);
            }
        }
        if (num3 > num1) {
            if (num3 > num2) {

                System.out.println("Largest number is : " + num3);
            }
        }
    }
}
