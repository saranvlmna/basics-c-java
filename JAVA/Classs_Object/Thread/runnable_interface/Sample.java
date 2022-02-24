public class Sample {
    public static void main(String[] args) {
        // Create Object of sample_main
        Sample_Main s=new Sample_Main();
        //Create Thread Object. pass Sample_Main Object to  Thread Parameter
        Thread k=new Thread(s);
        //Call Function for Therd Object
        k.run();
    }
}
