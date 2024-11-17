class SalaryforStaff{
  double total_salary;
  public double Salary(double base_salary,double bonus_amount){
    total_salary=base_salary+bonus_amount;
    return total_salary;
  }
  public double Salary(double base_salary,double bonus_amount,double allowance ){
    return base_salary+bonus_amount-allowance;
  }
  public void print(){
    System.out.println("calculating Salary for the Staff");
  }
}
public class Polymorphism_3045 extends SalaryforStaff{
    public void print(){
        System.out.println("salary calculated using polymorphism");
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        SalaryforStaff s=new SalaryforStaff();
        //overloading at compile-time
        System.out.println("Salary without allowance :"+s.Salary(10000.38,5000.5));
        System.out.println("Salary with allowance :"+s.Salary(10000.38, 50000.5,1000));
        //overriding
        Polymorphism_3045 obj=new Polymorphism_3045();
        obj.print();
    }
}
