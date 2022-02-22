public class main_class_sample {

    public static void main(String[] args) {
        // create object of class
        class_sample s1 = new class_sample();
        // create athor object of same class
        class_sample s2 = new class_sample();
        // assinig values in object
        s1.a = 20;
        s2.a = 50;
        s1.b = 100;
        s2.b = 200;
        // print values
        System.out.println("S1 -a" + s1.a + "  S2 -a" + s2.a + "  S1 -b" + s1.b + "   S2 -b" + s2.b);

    }
}
