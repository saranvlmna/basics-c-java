
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        try {
            
            // input 
            Scanner s=new Scanner(System.in);
            //print
            System.out.println("Enter Tow Numbers");
            //onput value assin
            int a=s.nextInt();
            int b=s.nextInt();
        }
        catch (Exception e) {
            System.out.println("Only allowed number");
        }
            //sum
            int result=a+b;
            //print result
            System.out.println("Sum of Two Numbers is:"+result);
            finally{
                System.out.println("Done")
            }
        
    }
    
}