class Staffs{
    String name;
    String ID;
    String contact_info;
    int year_joined;
    public void print(){
        System.out.println("Staff at  MIT");
    }
    public void Details(String name,String ID,String contact_info,int year_joined){
        this.name=name;
        this.ID=ID;
        this.contact_info=contact_info;
        this.year_joined=year_joined;
    }
    public void displayDetails(){
        System.out.println("Name : "+name+"\nID: "+ID+"\nyear Joined: "+year_joined+"\nContact :"+contact_info);
    }
}
class TeachingStaff extends Staffs{
    @Override
    public void print(){
        System.out.println("Teaching Staff at MIT");
    }
    String Department;
    String subjectExpertise;
    int experience;

    public void information(String Department,String subjectExpertise,int experience){
        this.Department=Department;
        this.subjectExpertise=subjectExpertise;
        this.experience=experience;

    }
    public void displayinfo(){
        System.out.println("Department : "+Department+"\nsubject Expertise : "+subjectExpertise+"\nexperience: "+experience);
    }
}
public class singleInheritance_3045 {
    public static void main(String[] args){
        System.out.println("2022503045 -Sivaranjani");
        TeachingStaff teachingStaff=new TeachingStaff();
        teachingStaff.print();
        teachingStaff.Details("Sindhuja","TS2022","9876543210",2018);
        teachingStaff.information("Computer Technology","Graphic Design",10);
        teachingStaff.displayDetails();
        teachingStaff.displayinfo();
    }
}
