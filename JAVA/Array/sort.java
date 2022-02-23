import java.util.Scanner;
public class sort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Limit");
        int limit = s.nextInt();
        System.out.println("Enter Values");
        int[] value = new int[100];
        for (int i = 0; i < limit; i++) {
            value[i] = s.nextInt();
        }
        // sort
        int temp;
        System.out.println("\n1)For assending \n2)for dessending\n");
        int choice=s.nextInt();
        for (int i = 0; i < limit - 1; i++) {
            for (int j = i + 1; j < limit; j++) {
                if(choice==1){

                    if (value[i] > value[j]) {
                        temp = value[i];
                        value[i] = value[j];
                        value[j] = temp;
                    }
                }else{
                    if (value[i] < value[j]) {
                        temp = value[i];
                        value[i] = value[j];
                        value[j] = temp;
                    }
                }
            }
        }
        System.out.print("Result is; ");
        for(int i = 0;i<limit;i++){
            System.out.print("\t"+value[i]);
        }
        

    }
}
