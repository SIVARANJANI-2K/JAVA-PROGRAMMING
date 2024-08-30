import java.util.Scanner;
import java.util.HashMap;
public class NumberToText {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     HashMap<Integer,String> number=new HashMap<>();
     number.put(1,"One");
     number.put(2,"Two");
     number.put(3,"Three");
     number.put(4,"Four");
     number.put(5,"Five");
     number.put(6,"Six");
     number.put(7,"Seven");
     number.put(8,"eight");
     number.put(9,"nine");
     number.put(10,"Ten");
     number.put(11,"eleven");
     number.put(12,"twelve");
     number.put(13,"thirteen");
     number.put(14,"fourteen");
     number.put(15,"fifteen");
     number.put(16,"sixteen");
     number.put(17,"seventeen");
     number.put(18,"eighteen");
     number.put(19,"nineteen");
     number.put(20,"twenty");
     number.put(30,"thirty");
     number.put(40,"fourty");
     number.put(50,"fifty");
     number.put(60,"sixty");
     number.put(70,"seventy");
     number.put(80,"eighty");
     number.put(90,"ninety");
     
     System.out.print("\nEnter the number :");
     int num=sc.nextInt();
     String text="";
     if(num/100>0){
        text+=number.get(num/100)+" hundred";
        num=num%100;
        if(num>0){
            text+=" and ";
        }
     }
     if(num>=10 && num<20){
        text+=number.get(num);
     }
     else{
        if(num>=20){
            text+=number.get((num/10)*10)+" ";
            if(num%10>0){
                text+=number.get(num%10)+" ";
            }
        }
        else{
            text+=number.get(num)+" ";
        }
     }
     System.out.println(text);
     
      sc.close();
    }
    
}
