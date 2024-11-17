interface techStaff{
     default void display(){
        System.out.println("Technical Staff at Mit");        
     }
}
interface adminStaff{
    default void print(){
        System.out.println("Administrative Staff at MIT");
    }
}
class SupportingStaffs implements techStaff,adminStaff{
    public void joinDisplay(){
        techStaff.super.display();
        adminStaff.super.print();
    }

}
public class MultipleInherit_3045 {
    public static void main(String[] args){
        SupportingStaffs Sf=new SupportingStaffs();
        System.out.println("SIVARANJANI -2022503045");
        Sf.joinDisplay();
        
    }
}
