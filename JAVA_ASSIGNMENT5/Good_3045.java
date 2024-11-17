import java.util.Scanner;

public class Good_3045 {
    public String replaceGood(String str){
        int start=-1;
        int end=-1;
        int index=-1;
        String result=str;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '||!(str.charAt(i)>='a' && str.charAt(i)<='z'||str.charAt(i)>='A' && str.charAt(i)<='Z')){
               
                if(sb.toString().equalsIgnoreCase("not") && start==-1){
                    start=index;
                }
                else if(sb.toString().equalsIgnoreCase("bad") && start!=-1){
                    end=index +sb.length()-1;
                    String toreplace=str.substring(start, end+1);
                    result=result.replace(toreplace,"good");
                    start=-1;
                    end=-1;
                }
                
                index=-1;
                sb=new StringBuilder();
            }
            else{
                  sb.append(str.charAt(i));
                  if(index==-1){
                    index=i;
                  }
                   
            }
            
        }
        if(sb.toString().equalsIgnoreCase("bad") && start!=-1){
            end=index+sb.length()-1;
            String toreplace=str.substring(start, end+1);
            result=result.replace(toreplace,"good");
        }

       
        return result;
        
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Good_3045 obj=new Good_3045();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the line :");
        String input=sc.nextLine();
        System.out.println(obj.replaceGood(input));
    }
}
