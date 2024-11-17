import java.util.Scanner;

public class Palindrome_3045 {
    public boolean isPalindrome(String str){
        int len=str.length();
        int start=0;
        int end=len-1;
        str=str.toLowerCase();
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String input=sc.nextLine();
        Palindrome_3045 obj=new Palindrome_3045();
        System.out.println(input+" "+obj.isPalindrome(input));
    }
}
