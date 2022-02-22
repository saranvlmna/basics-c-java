package sum_object_class;

public class main_sum {
    public static void main(String[] args) {
        // create object of class
        sample_sum a = new sample_sum();
        sample_sum b = new sample_sum();
        // assin values
        a.num1 = 10;
        a.num2 = 20;
        b.num1 = 50;
        b.num2 = 90;
        // call calculate function of objects
        a.calculateSum();
        b.calculateSum();
        // call print display function
        a.display();
        b.display();

    }

}
