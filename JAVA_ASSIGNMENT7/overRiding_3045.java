import java.io.FileNotFoundException;
import java.io.IOException;

public class overRiding_3045 {
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        checkedOverloading co=new checkedOverloading();
        try{
            co.checkedException1();
            co.checkedException2();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        UncheckedOverriding uo=new UncheckedOverriding();
        try{
            uo.uncheckedException1();
            uo.uncheckedException2();
        }
        catch(ArithmeticException e){
            System.out.println("Unchecked Exception overrided by a different exception in derived class"+e);
        }
    }
}
class baseClass{
    public void checkedException1() throws IOException{
        throw new IOException("checked exception1 from base class");
    }
    public void checkedException2() throws IOException{
        throw new IOException("checked exception1 from base class");
    }
    public void uncheckedException1() throws NullPointerException{
        String str=null;
        int length=str.length();
    }
    public void uncheckedException2() throws NullPointerException{
        String str=null;
        int length=str.length();
    }
}
class checkedOverloading extends baseClass{
    public void checkedException1(){
        System.out.println("checkedException1 overRided by a derived class without throwing any exception");
    }
    public void checkedException2()  throws FileNotFoundException{
         throw new FileNotFoundException("throws filenotfoundexception overrided the IOexception of checkedException2");
    }
}
class UncheckedOverriding extends baseClass{
    public void uncheckedException1(){
        System.out.println("UncheckException 1 with no exception");
    }
    public void uncheckedException2() throws ArithmeticException{
        
        int a=7/0;

    }
}
