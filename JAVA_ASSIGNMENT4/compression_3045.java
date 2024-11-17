import java.util.Scanner;

public class compression_3045 {
    public String compressed(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char temp = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != temp) {
                sb.append(temp);
                sb.append(count);
                temp = str.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(temp);
        sb.append(count);
        if(sb.length()<str.length())
            return sb.toString();
        return str;
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        compression_3045 obj=new compression_3045();
        System.out.println("The compressed string is "+obj.compressed(str));
    }
}
