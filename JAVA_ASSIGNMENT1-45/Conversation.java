import java.util.Scanner;
public class Conversation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String java;
        String[] Python={" I'm Python. Nice to meet you!"," I'm best for rapid development and scripting tasks.","I use dynamic typing for more flexibility."," I'm portable with the Python interpreter on any system."," Perfect for web development and data analysis.","I excel in ease of use and quick development cycles.","Use me for ease and speed in development.","Bye!"};

        for(String str:Python){
               System.out.print("Java:");
               java=sc.nextLine();
               System.out.println();
               System.out.print("Python:"+str);
               System.out.println();

        }

    }
}
