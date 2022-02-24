//inhert abstract class
// not create object in abstract class only inheritns
public class Sample_abstract extends Main_abstract{
// Call Ontext in Fist_abstract class with parameter
//recive parameter with type
    void onText(String text){
//text = First_abstract passed String parameter
        System.out.println(text);

    }
    //Created constructor
    Sample_abstract(){
        //Create object in first_abstract and pass the object current value
         // this = current  object
        First_abstract s=new First_abstract(this);
        s.scan();
    }
    // main
    public static void main(String[] args) {
        //create object in the class
      Sample_abstract b=new Sample_abstract();
    }
}
