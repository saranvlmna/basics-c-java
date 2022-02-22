import java.util.Scanner;

public class if_else {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = s.nextInt();
        // System.out.println("Enterd Values are : "+num);
        if (num < 0) {
            System.out.println("Enterd Number Negative" + num);
        } else {
            System.out.println("Enterd Number is Positive"+num);
        }
    }
}
