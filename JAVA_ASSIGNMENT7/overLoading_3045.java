import java.io.IOException;

public class overLoading_3045 {
    public static void main(String[] args) {
        CheckedException obj=new CheckedException();
        UncheckedException obj2=new UncheckedException();
    
        System.out.println("Sivaranjani -2022503045");
        System.out.println("Checked Exception with method overloading : ");
        try{
            obj.method1(5);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            obj.method1("parameter");
        }
        System.out.println();
        System.out.println("Unchecked exceptions with method overloading : ");
        try{
            obj2.method1(null);
        }
        catch(NullPointerException e){
            System.out.println("Null string as a parameter in unchecked exception");
        }
        try{
            obj2.method1(4);
        }
        catch(ArithmeticException e){
            System.out.println("Unchecked exception of same method with divide bye zero "+e);
        }
    }
}
class CheckedException{
    public void method1(int a) throws IOException{
             System.out.println(a);
             throw new IOException("exception from method 1 of checked Exception with int as parameter");
    }
    public void method1(String str){
           System.out.println("method1 with str as parameter");
    }
}
class UncheckedException{
    public void method1(int a) throws ArithmeticException{
        int d=a/0;

    }
    public void method1(String str) throws NullPointerException{
        int length=str.length();
    }
}
