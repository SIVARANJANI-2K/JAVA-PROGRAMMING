import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exceptions_3045 {
    int size_of_array=10;
    int[] array=new int[size_of_array];
    Object[] a=new Double[10];
    public void display(){
        System.out.println("From exceptions class..");
    }
    public int getElement(int index){
        try{
            int element=array[index];
            return element;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound the size is only "+size_of_array);
        }
        return -1;
    }
    public void IncompatipleType(){
       try {
           a[4] = 8;
       }
       catch(ArrayStoreException e){
           System.out.println(e+"  Incompatiple type");
       }
    }
    public void classCasting(){
        Exceptions_3045 exceptionObj=new Exceptions_3045();

        try{
            sample sampleobj=(sample)exceptionObj;
            sampleobj.display();

        }
        catch(ClassCastException e){
            System.out.println("Invalid Casting");
        }

    }
    public void indexOutofbound(List<Integer> list,int index) {
        try {
            System.out.println("the element is " + list.get(index));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("the list size is only "+list.size());
        }
    }
    public void declareNegativeArray(){
        try{
            array=new int[-2];
        }
        catch(NegativeArraySizeException e){
            System.out.println("You declared a array with negative size "+e);
        }
    }
    public void comparingWithNull(String str){
        String compare=null;
        try {
            if (compare.compareTo(str) == 0) {
                System.out.println("hii");
            } else {
                System.out.println("bye");
            }
        }
        catch(NullPointerException e){
            System.out.println("The compared string is null "+e);
        }
    }
    public void illegalArgument(String name,String collegeName){
        if(name==null||collegeName==null){
            throw new IllegalArgumentException("Sorry! Both name and collegeName necessary!");
        }
        System.out.println("Name :"+name +"College Name : "+collegeName);
    }
    public void convertToInt(String str){
        try{
            int word=Integer.parseInt(str);
            System.out.println(word);
        }
        catch(NumberFormatException e){
            System.out.println("String to convert is invalid "+e);
        }
    }
    public void getcharat(String str,int i){
        try{
            System.out.println(str.charAt(i));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("The string length is only "+str.length()+" "+e);
        }
    }
    public void convertoList(String str){
        try{
            String[] arr=str.split(" ");
            List<String> list= Arrays.asList(arr);
            list.add("added");

        }
        catch(UnsupportedOperationException e){
            System.out.println("Unsupported exception caught "+ e);
        }
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani - 2022503045");
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the index : ");
        int index=sc.nextInt();
        Exceptions_3045 obj=new Exceptions_3045();
        if(obj.getElement(index)!=-1){
            System.out.println(obj.getElement(index));
        }
        System.out.println();
        System.out.println("Storing Incompatiple type(int) in a double array in an array ");
        obj.IncompatipleType();
        System.out.println();
        System.out.println("Casting a parent object to a child object class ... ");
        obj.classCasting();
        System.out.println();
        System.out.println("Providing name or collegeName as null in the method for exception like this:");
        System.out.println("obj.illegalArgument(\"sivaranjani\",null);\n" +
                " obj.illegalArgument(null,null);");
        try {
            obj.illegalArgument("sivaranjani", null);
            obj.illegalArgument(null, null);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        List<Integer> list=new ArrayList<>(10);
        System.out.println("enter the index for a list : ");
        index=sc.nextInt();
        obj.indexOutofbound(list,index);
        System.out.println("Declaring an array with negative size of -2");
        System.out.println();
        obj.declareNegativeArray();
        String str;
        System.out.println("enter a string : ");
        str=sc.next();
        obj.comparingWithNull(str);
        System.out.println();
        obj.convertToInt(str);
        System.out.println();
        obj.getcharat(str,9);
        System.out.println();
        obj.convertoList(str);

    }
}
class sample extends Exceptions_3045{
    public void display(){
        System.out.println("from sample class..");
    }
}
