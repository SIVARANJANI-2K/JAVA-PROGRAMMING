import java.util.Scanner;

public class productVersion_3045 {
    public boolean greater(String s1,String s2){
        String[] s1_form=s1.split("\\.");
        String[] s2_form=s2.split("\\.");
        int n= s1_form.length;

        for(int i=0;i<n;i++){
            if(Integer.parseInt(s1_form[i])>Integer.parseInt(s2_form[i]))
                return true;

        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first product version string : ");
        String str1=sc.nextLine();
        System.out.println("Enter the second product version string : ");
        String str2=sc.nextLine();
        productVersion_3045 obj=new productVersion_3045();
        if(obj.greater(str1,str2))
            System.out.println(str1+"  is greater than  "+str2);
        else
            System.out.println(str1+"  is not greater than "+str2);
    }


}
