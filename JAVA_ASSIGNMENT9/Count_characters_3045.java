import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
public class Count_characters_3045 {
    public int count_character(char c){
        int count=0;
        try(FileInputStream f=new FileInputStream("input.txt"); InputStreamReader in_str=new InputStreamReader(f);){
            int t;
            count=0;
            while((t=in_str.read())!=-1){
                char ch=(char)t;
                if(ch==c){
                    count+=1;
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception caught :"+e);
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sivaranjani - 2022503045");
        System.out.println("enter the character to count : ");
        char c=sc.nextLine().charAt(0);
        Count_characters_3045 obj=new Count_characters_3045();

        System.out.println("Count of "+c+" in input.txt file is "+obj.count_character(c));
    }
}
