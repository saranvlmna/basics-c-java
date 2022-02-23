public class non_static {
    int b=10;
    public static void main(String[] args) {
        //create object
        non_static hi=new non_static();
        hi.hello();
        hi.b=10;
    }
    void hello(){
        System.out.println("Hello");
    }
}
