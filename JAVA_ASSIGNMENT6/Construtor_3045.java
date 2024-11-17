class LibraryStaffs extends Staffs{
    int no_of_staffs;
    String last_updated_date;
    LibraryStaffs(){
        System.out.println("Library Staffs class is created empty");
    }
    LibraryStaffs(int no_of_staffs,String last_updated_date){
            this.no_of_staffs=no_of_staffs;
            this.last_updated_date=last_updated_date;
            System.out.println("No of Staffs :"+no_of_staffs+"\t --- last Updated :"+last_updated_date +"\n Library created with parameters");
    }
}
public class Construtor_3045 {
    public static void main(String[] args){
        System.out.println("Sivaranjani - 2022503045");
        LibraryStaffs lb1=new LibraryStaffs();
        LibraryStaffs lb2=new LibraryStaffs(10,"19/09/2024");

    }
}
