import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;


public class encrypt_buffer_3045 {
    public void encryptBuffer(){
        
        long startTime=System.currentTimeMillis();
        try(FileInputStream f=new FileInputStream("input.txt"); BufferedInputStream bf=new BufferedInputStream(f); FileOutputStream out=new FileOutputStream("output.txt"); BufferedOutputStream outb=new BufferedOutputStream(out); ){
            int ch;

            while((ch=bf.read())!=-1){
                outb.write(ch+5);
            }
        }
        catch(Exception e){
            System.out.println("exception caught : "+e);
        }
        long TotalTime=System.currentTimeMillis()-startTime;
    
        System.out.println("Total time for bufferedInput/OutputStream : "+TotalTime+"ms");
    }
    public void encryptWithoutBuffer(){
    
        long startTime=System.currentTimeMillis();
        try(FileInputStream f=new FileInputStream("input.txt"); FileOutputStream out=new FileOutputStream("output.txt");){
            int c;
            

            while((c=f.read())!=-1){
                out.write(c+7);

            }
        }
        catch(Exception e){
            System.out.println("exception caught : "+e);
        }
        long TotalTime=System.currentTimeMillis()-startTime;
    
        System.out.println("Total time for FileInput/outputstream: "+TotalTime+"ms");

    }
    
    public static void main(String[] args){
        encrypt_buffer_3045 obj=new encrypt_buffer_3045();
        System.out.println("Sivaranjani -2022503045");
        obj.encryptBuffer();
        obj.encryptWithoutBuffer();

    }
}

