package Polymophism.Super;

public class super_second extends super_sample {
    // super sample parent
    // int a = 20;
    super_second() {
        System.out.println("its Constructor of child");
    }

    super_second(int a) {
        // call super then work parent constructor print
        // super only support top line
        super(10);
        System.out.println("this construcor argument constructor of child");
    }

    // sub class function
    void display() {
        System.out.println("hello");
        // call parent class function
        // super.display();
    }

    // create function
    void basecall() {
        // call base class function
        super.display();
    }

    void sum() {
        int a = 20;
        // call parent class variable
        super.sample = sample;
        int c = a + sample;
        System.out.println("" + c);
    }

    public static void main(String[] args) {
        // create object sub class
        super_second s = new super_second(10);

        // function
        // s.basecall();
        // s.sum
        // s.display

    }
}
