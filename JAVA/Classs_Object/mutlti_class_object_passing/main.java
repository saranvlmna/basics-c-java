package mutlti_class_object_passing;

public class main {
    public static void main(String[] args) {
        // Create second class object
        Second obj = new Second();
        // Create fist class object
        First s = new First();
        // Call first class Function also passing parameter Second Class object
        s.displayf(obj);
    }
}
