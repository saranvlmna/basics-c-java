package this_sample;

public class Class {
    // global variable
    int c, d;

    Class(int a, int b) {
        // assin local variable to global variable. localvariable only access in function or costructor
        this.c = a;
        this.d = b;
        System.out.println("" + c + d);

    }
}
