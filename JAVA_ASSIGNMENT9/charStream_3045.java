import java.io.FileReader;
import java.io.FileWriter;

public class charStream_3045 {
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        try(FileReader in=new FileReader("input.txt"); FileWriter out=new FileWriter("output.txt");){
            int c;
            while((c=in.read())!=-1){

                out.write(Character.toUpperCase((char)c));
            }

        }
        catch(Exception e){
            System.out.println("exception caught");
        }

        long TotalTime=System.currentTimeMillis()-startTime;
        System.out.println("Total Time : "+TotalTime+"ms");
    }
}

