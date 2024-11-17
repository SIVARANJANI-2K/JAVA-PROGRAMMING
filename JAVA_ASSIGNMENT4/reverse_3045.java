import java.util.Scanner;

public class reverse_3045 {
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        int start=0;
        int end=str.length()-1;
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        System.out.println("The reversed string is "+sb.toString());
    }
}
