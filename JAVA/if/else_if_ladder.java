
import java.util.Scanner;
public class else_if_ladder {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ente your choice\n 1) for porotta\n 2) for dhosa \n 3) chappathi \n 4) biriyani\n");
        int choice = s.nextInt();
        if (choice == 1) {
            System.out.println("Please Wait for Porotta \t Thanks");
        } else if (choice == 2) {
            System.out.println("Please Wait for Dhosa \t Thanks");
        } else if (choice == 3) {
            System.out.println("Please Wait for chappahti \t Thanks");
        } else if (choice == 4) {
            System.out.println("Please Wait for Biriyani\t Thanks");
        } else {
            System.out.println("Ok da monu!!");
        }
    }
}
