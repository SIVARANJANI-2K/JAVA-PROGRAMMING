public class Finalize_3045 {
    protected void finalize()  throws Throwable{
        try{
            System.out.println("Finalizing in main class");
        }
        catch(Throwable e){
            throw e;
        }
        finally{
            super.finalize();
        }
 
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani - 2022503045");
        Finalize_3045 obj=new Finalize_3045();
        try{
         obj.finalize();
        }
        catch(Throwable e){
            System.out.println(e);
        }
        System.gc();
    }
}
