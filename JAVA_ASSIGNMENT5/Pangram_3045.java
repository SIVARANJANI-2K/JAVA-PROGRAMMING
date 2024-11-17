import java.util.Scanner;

public class Pangram_3045 {
    boolean[] alphabets=new boolean[26];
    public boolean isPangram(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                alphabets[str.charAt(i)-'a']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(alphabets[i]==false)
                return false;
        }
        return true;
    }
    public void missingLetters(){
        for(int i=0;i<26;i++){
            if(alphabets[i]==false){
                System.out.print((char)(i+97)+",");
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.nextLine();
        Pangram_3045 obj=new Pangram_3045();
        if(obj.isPangram(input)){
            System.out.println("Yes, the string is a pangram.");
        }
        else{
            System.out.print("No, the string is NOT a pangram. Missing letter(s) is(are) ");
            obj.missingLetters();
        }
    }
}
