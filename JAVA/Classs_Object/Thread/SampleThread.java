package Thread;

//create thread class
public class SampleThread extends Thread{
    //override run method
@Override
public void run() {
    // TODO Auto-generated method stub

    super.run();
    //create manula task
    for(int i=0;i<10;i++){
        System.out.print("Thread count \n"+i);
        try {
            //sleep for 10 second
            Thread.sleep(1000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
}