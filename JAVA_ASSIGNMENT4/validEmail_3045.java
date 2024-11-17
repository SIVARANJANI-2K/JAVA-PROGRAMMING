import java.util.Scanner;

public class validEmail_3045 {
    public boolean isValid(String str){
        if(!str.contains("@"))
            return false;
        String[] after_amper=str.split("@");
        String username=after_amper[0];
        if(username.length()>25)
            return false;
        
        if(after_amper.length!=2)
             return false;
        for(int i=0;i<username.length();i++){
            char c=str.charAt(i);
            if(!(c>='a' && c<='z'||c>='A' && c<='Z'||c=='_'||c=='-'||c=='.'||c>='0' && c<='9'))
                return false;
        }
        
        String[] domain=after_amper[1].split("\\.");
        if(domain.length!=2)
             return false;
        System.out.println("Username:"+username);
        System.out.println("Domain: "+after_amper[1]);

        
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Sivaranjani -2022503045");
        System.out.println("Enter the mail:");
        String str=sc.nextLine();
        validEmail_3045 obj=new validEmail_3045();
        if(obj.isValid(str))
             System.out.println("It is a Valid mail");
        else
            System.out.println("Not a valid mail");
    }
}
