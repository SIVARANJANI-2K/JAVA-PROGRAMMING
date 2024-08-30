import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year :");
        int year = sc.nextInt();
        if(leap(year)){
            System.out.println(year+" is  a leap year");
            int nextYear=year+4;
            while(!leap(nextYear)){
                nextYear=nextYear+4;
            }
            System.out.print("Next Leap year is "+nextYear);
        }
        else{
            System.out.println(year +" is not leap year");
            int nextYear=year+1;
            while(!leap(nextYear)){
                nextYear=nextYear+1;
            }
            System.out.print("Next Leap year is "+nextYear);

        }
    }
    static boolean leap(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    return true;
                else
                    return false;
            }
            return true;
        }
        return false;
    }
}
