import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
public class trycatch_3045 {
    String a=null;
    public void methodA(){

        System.out.println("Try without catch occuring...");
        try {
            System.out.println("In try block..");
            System.out.println(a.length());
        }
        finally {
            System.out.println("I am a final block in methodA");
        }
    }
    public void methodB(){
        System.out.println("Try with a catch block and no final block");
        try{
            System.out.println("In try block of methodB");
            System.out.println(a.length());
        }
        catch(Exception e){
            System.out.println("At catch block with exception "+e);
        }
    }
    public void methodC(){
        System.out.println("Try with catch and finall block");
        try{
            System.out.println("In try block of methodC");
            System.out.println(a.length());
        }
        catch(Exception e){
            System.out.println("At catch block with exception "+e);
        }
        finally{
            System.out.println("At finally block of methodC");
        }
    }
    public void methodD(){
        System.out.println("Try with multiple catches");
        try{
            System.out.println("In try block of methodD");
            System.out.println(a.length());
            System.out.println(1/0);
        }
        catch(NullPointerException e){
            System.out.println("1ST catch block with exception "+e);
        }
        catch(Exception e){
            System.out.println("2nd exception is "+e);
        }

    }
    public void methodE(){
        System.out.println("Try with Nested catches and finally block");
        try{
            System.out.println("In try block of methodE");
             a="hello";
            System.out.println(a.length());
            try {
                System.out.println(1 / 0);
            }
            catch(ArithmeticException e){
                System.out.println("Nested exception divide by zero");
            }
            finally {
                System.out.println("Final block in nested try");
            }
        }
        catch(NullPointerException e){
            System.out.println("1ST catch block with exception "+e);
        }
       finally{
            System.out.println("final block in methodE outside");
        }
    }
    public void methodF(){
        System.out.println("Try with resources");
        try(FileInputStream fp=new FileInputStream("./example.txt")){
            System.out.println("In try block of methodF");
            int c;
            while((c=fp.read())!=-1){
                System.out.println(c);
            }

        }
        catch(IOException e){
            System.out.println("FILE NOT OPENED "+e);
        }

    }
    public static void main(String[] args) {
        System.out.println("Sivaranjani - 2022503045");
        Scanner sc = new Scanner(System.in);
        trycatch_3045 obj=new trycatch_3045();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
        obj.methodE();
        obj.methodF();
    }
}
