package Thread.runnable_interface;

public class Sample_Main implements Runnable {
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("Count"+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}
