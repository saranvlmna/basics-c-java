import java.util.Scanner;

public class funtion_Without_returnvalue {
    public static void main(String[] args) {
        System.out.println("Enter Two numbers");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        res(a, b);
    }

    static int res(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result is: " + result);
        return 0;
    }
}
