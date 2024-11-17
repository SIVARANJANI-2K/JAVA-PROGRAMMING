import java.util.Scanner;

public class anagram_3045 {
    public boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int[] count=new int[26];
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=' ')
                count[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)!=' ')
                count[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0)
                return false;
        }
        return true;

    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string : ");
        String str2=sc.nextLine();
        anagram_3045 obj=new anagram_3045();
        if(obj.isAnagram(str1,str2))
            System.out.println("It is Anagram");
        else
            System.out.println("Not a Anagram");

    }
}
