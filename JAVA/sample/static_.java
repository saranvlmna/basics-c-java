
public class static_ {

    // int a=5;     Error only access static method or static variable in a static method 
    public static void main(String[] args) {
        // System.out.println(""+a);
        // System.out.println(""+hi);
     sample();
     
    }

    // void sample(){    Error only access static method or static variable in a static method 
    //     // System.out.println("hi");
    // }

    static void sample(){
      System.out.println("hi");
    }
}
