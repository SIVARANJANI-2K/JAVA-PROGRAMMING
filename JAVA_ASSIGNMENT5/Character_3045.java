import java.util.HashMap;
import java.util.Scanner;

public class Character_3045 {
    HashMap<Character,Integer> characters=new HashMap<>();
    public void count(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                characters.put(str.charAt(i),characters.getOrDefault(str.charAt(i),0)+1);
            }
        }
    }
    public void display(){
        int i=1;
        for(char c:characters.keySet()){
            System.out.print(c+":"+characters.get(c));
            if(i!=characters.size()){
                System.out.print(", ");
                i++;
            }
        }
    }
    public static void main(String[] args){
        Character_3045 obj=new Character_3045();
        System.out.println("Sivaranjani -2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String input=sc.nextLine();
        obj.count(input);
        obj.display();

    }
}
