class lecturer extends TeachingStaff{
    String contractType;
    int noOfCourses_assigned;
    double MonthlySalary;
    int workingHoursPerWeek;
    @Override
    public void print(){
        System.out.println("Teaching Staff -Lecturer");
    }
    public void addInfo(String contractType,int noOfCourses_assigned,double MonthlySalary,int workingHours){
        this.contractType=contractType;
        this.noOfCourses_assigned=noOfCourses_assigned;
        this.MonthlySalary=MonthlySalary;
        workingHoursPerWeek=workingHours;
    }
    public void displayDetails(){
        System.out.println("contract Type: "+contractType+"\nno Of Courses Assigned : "+noOfCourses_assigned+"\nMonthly Salary : "+MonthlySalary+"Working hours per week : "+workingHoursPerWeek);
    }
    
}
public class MultilevelInheritance_3045 {
    public static void main(String[] args){
        System.out.println("Sivaranjani - 2022503045");
        lecturer l=new lecturer();
        l.print();
        l.Details("Neela","TS2004L","9875432124",2020);
        l.addInfo("Full-time", 3, 35000.3, 20);
        l.displayDetails();
    }

}
