import java.util.Scanner;
public class Counter_3045{
      int frequency=0;
      String paragraph;
      String key;
      public void getInputs(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the paragraph :");
        paragraph=sc.nextLine();
        System.out.println("enter the key:");
        key=sc.nextLine();
        sc.close();
      }
      public void count(){
        String[] words=paragraph.split(" ");
        for(String str:words){
            if(str.equals(key)){
                frequency+=1;
            }
        }
      }
      public static void main(String[] args){
        Counter_3045 obj=new Counter_3045();
        System.out.println("Sivaranjani -2022503045");
        obj.getInputs();
        obj.count();
        System.out.println(obj.frequency);

      }
}