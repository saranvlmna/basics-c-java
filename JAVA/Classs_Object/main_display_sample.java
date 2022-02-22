public class main_display_sample {
    public static void main(String[] args) {
        // create object of class
        display_sample a1 = new display_sample();
        // create other object of same class
        display_sample a2 = new display_sample();
        display_sample a3 = new display_sample();
        // assinnig values in objects
        a1.a = 20;
        a1.b = 40;
        a2.a = 10;
        a2.b = 30;
        a3.a = 40;
        a3.b = 90;
        a3.c = 60;
        // print
        // access function of class
        a1.display();
        a2.display();
        a3.display();
    }
}
