import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class palindrome_buffer {
    public void palindromBuffer(){
        int palindromCount=0;
        long startTime=System.currentTimeMillis();
        try(FileReader f=new FileReader("input.txt"); BufferedReader bf=new BufferedReader(f);){
            String str;

            while((str=bf.readLine())!=null){
                String[] words=str.split(" ");
                for(String word: words){
                    if(isPalindrome(word.toLowerCase())){
                        palindromCount++;

                    }
                }
            }
        }
        catch(Exception e){
            System.out.println("exception caught : "+e);
        }
        long TotalTime=System.currentTimeMillis()-startTime;
        System.out.println("Palindrom count using BufferedReader : "+palindromCount);
        System.out.println("Total time for bufferedReader : "+TotalTime+"ms");
    }
    public void palindromWithoutBuffer(){
        int palindromCount=0;
        long startTime=System.currentTimeMillis();
        try(FileReader f=new FileReader("input.txt");){
            int c;
            StringBuilder sb=new StringBuilder();

            while((c=f.read())!=-1){
                if((char)c!=' ' && (char)c!='\n'){
                    sb.append((char)c);
                }
                else{
                    if(isPalindrome(sb.toString().toLowerCase())){
                        palindromCount++;

                    }
                    sb=new StringBuilder();
                }


            }
        }
        catch(Exception e){
            System.out.println("exception caught : "+e);
        }
        long TotalTime=System.currentTimeMillis()-startTime;
        System.out.println("Palindrom count using FileReader : "+palindromCount);
        System.out.println("Total time for FileReader: "+TotalTime+"ms");

    }
    public boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;

        while(start<=end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        palindrome_buffer obj=new palindrome_buffer();
        System.out.println("Sivaranjani -2022503045");
        obj.palindromWithoutBuffer();
        obj.palindromBuffer();

    }
}
