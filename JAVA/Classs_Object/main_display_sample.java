public class main_display_sample {
    public static void main(String[] args) {
        display_sample a1=new display_sample();
        display_sample a2=new display_sample();
        
        a1.a=20;
        a2.b=30;
        a1.b=40;
        a2.a=10;

        a1.display();
        a2.display();
    }
}
