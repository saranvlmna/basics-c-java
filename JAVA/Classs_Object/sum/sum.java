package sum;

public class sum {
    public static void main(String[] args) {
        // decalre object value
        int num1 = 50;
        int num2 = 60;
        int num3 = 40;
        int num4 = 90;
        // declare object
        sum_class sum = new sum_class();
        // call funtion sum & passing parameter
        sum.calculateSum(num1, num2);
        // call print
        sum.display();
        sum.calculateSum(num3, num4);
        sum.display();
    }
}
