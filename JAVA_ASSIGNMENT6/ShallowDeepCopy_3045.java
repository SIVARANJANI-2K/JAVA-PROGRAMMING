public class ShallowDeepCopy_3045 {
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        lecturer l_original=new lecturer();
        l_original.addInfo("full-time", 10,90000,11);
        //modification in deepcopy doesn't effect original
        lecturer l_deepcopy=new lecturer();
        l_deepcopy.addInfo(l_original.contractType, l_original.noOfCourses_assigned, l_original.MonthlySalary,l_original.workingHoursPerWeek);
        l_deepcopy.contractType="Part-time";
        System.out.println("DEEP COPY after modification ");
        l_deepcopy.displayDetails();;
        System.out.println("Original : ");
        l_original.displayDetails();;
        System.out.println();
        lecturer l_shallowcopy=l_original;
        l_shallowcopy.MonthlySalary=70000.65;
        System.out.println("SHALLOW COPY :");
        l_shallowcopy.displayDetails();;
        System.out.println("Original now : ");
        l_original.displayDetails();;

        
    }
}
