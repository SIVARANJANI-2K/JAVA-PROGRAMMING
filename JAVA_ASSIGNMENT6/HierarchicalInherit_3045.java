class AdministrativeStaffs extends Staffs{
    String role;
    String[] skills;
    String adminID;
    @Override
    public void print(){
        System.out.println("Administrative Staff at MIT");
    }
    public void adminDetails(String role,String[] skills,String adminID){
        this.role=role;
        this.skills=skills;
        this.adminID=adminID;
    }
    public void displayAdminDetails(){
        System.out.print("Role :"+role+"\n skills : ");
        for(String skill:skills){
            System.out.print(skill+",");
        }
        System.out.print("\n AdminID :"+adminID+"\n");
    }

}
class TechnicalStaffs extends Staffs{
    int[] lab_nos_incharged;
    String shiftTiming;
    String department;
    @Override
    public void print(){
        System.out.println("Technical Staff at MIT");
    }
    public void techDetails(String shiftTiming,int[] lab_nos_incharged,String department){
        this.shiftTiming=shiftTiming;
        this.lab_nos_incharged=lab_nos_incharged;
        this.department=department;
    }
    public void techStaffDetails(){
        System.out.print("ShiftTiming :"+shiftTiming+"\n Labs Incharge : ");
        for(int lab:lab_nos_incharged){
            System.out.print("lab"+lab+",");
        }
        System.out.print("\n department:"+department+"\n");
    }

}
public class HierarchicalInherit_3045 {
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        AdministrativeStaffs admin=new AdministrativeStaffs();
        admin.print();
        admin.Details("gokul","TS2762A","9857286611", 2022);
        admin.adminDetails("Office Manager",new String[]{"Communication","MS EXCEL","MSWORD"},"174@ADMIN");
        admin.displayDetails();
        admin.displayAdminDetails();
        System.out.println();
        System.out.println();
        TechnicalStaffs techStaff=new TechnicalStaffs();
        techStaff.print();
        techStaff.techDetails("9AM-5PM", new int[]{2,45,1}, "IT");
        techStaff.techStaffDetails();
    }
    

}
