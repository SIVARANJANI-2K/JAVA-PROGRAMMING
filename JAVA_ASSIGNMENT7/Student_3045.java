import java.util.Scanner;

class InvalidMarkException extends Exception{
    int mark;
    public InvalidMarkException(int mark){
        this.mark=mark;
    }
    public String toString(){
        return "Invalid mark of Student "+mark;
    }
}
public class Student_3045 {
    String name;
    int mark;
    Student_3045(String name){
        this.name=name;
    }
    public void setMark(int mark) throws InvalidMarkException{
        if(mark<0||mark>100){
            throw new InvalidMarkException(mark);
        }
        this.mark=mark;
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani - 2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students:");
        int n=sc.nextInt();
        Student_3045[] students=new Student_3045[n];
        System.out.println("enter the names of students :");
        for(int i=0;i<n;i++){
            String s=sc.next();
            Student_3045 student=new Student_3045(s);
            students[i]=student;
        }
        System.out.println("enter the marks of each student :");
        for(int i=0;i<n;i++){
            Student_3045 student=students[i];
            System.out.print(student.name+": ");
            int mark=sc.nextInt();
          
            try{
            
            student.setMark(mark);
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("enter the correct mark again ");
                i=i-1;
            }
            
        }
    }
}
