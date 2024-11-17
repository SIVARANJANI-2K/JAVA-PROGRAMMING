import java.util.Scanner;

public class stringExtract_3045 {
    public String extractNumber(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                sb.append(str.charAt(i));
            }
        }
        return sb.isEmpty()?"": sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Sivaranjani -2022503045");
        System.out.println("Enter a string :");
        String str=sc.nextLine();
        stringExtract_3045 obj=new stringExtract_3045();
        String res=obj.extractNumber(str);
        if(!res.isEmpty())
            System.out.println("The extracted number string is : "+res);
        else
            System.out.println("There is no numbers in the string");
    }
}
