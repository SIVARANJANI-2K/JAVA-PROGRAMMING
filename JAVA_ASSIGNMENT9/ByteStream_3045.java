import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream_3045 {
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
      try(FileInputStream in=new FileInputStream("input.txt"); FileOutputStream out=new FileOutputStream("output.txt");){
          int c;

          while((c=in.read())!=-1){
              char t=(char)c;
              out.write(Character.toUpperCase(t));
          }


      }
      catch(Exception e){
          System.out.println("exception caught");
      }
      long TotalTime=System.currentTimeMillis()-startTime;
        System.out.println("Total Time : "+TotalTime+"ms");
    }
}
