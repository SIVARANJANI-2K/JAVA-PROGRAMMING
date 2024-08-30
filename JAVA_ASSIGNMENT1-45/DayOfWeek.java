import java.util.HashMap;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
        HashMap<Integer,String> days=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        days.put(0,"Sunday");
        days.put(1,"Monday");
        days.put(2,"Tuesday");
        days.put(3,"Wednesday");
        days.put(4,"Thursday");
        days.put(5,"Friday");
        days.put(6,"Saturday");
        System.out.print("Enter the month (1 for jan,2 for feb and so on):");
        int m=sc.nextInt();
        System.out.println();
        System.out.print("Enter the day (1 to 31):");
        int d=sc.nextInt();
        System.out.println();
        System.out.print("Enter the year");
        int y=sc.nextInt();
        System.out.println();
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+(31*m0)/12)%7;
        System.out.print(days.get(d0));


    }
}
