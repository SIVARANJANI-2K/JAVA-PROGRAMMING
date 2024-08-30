import java.util.Random;
import java.util.Scanner;

public class Sort_3045 {
    int n;
    int[] randomArray;
    int comparison=0;
    public void readArray(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Enter the number of elements : ");
        n=sc.nextInt();
        randomArray=new int[n];
        for(int i=0;i<n;i++){
            if(rand.nextBoolean()){
                randomArray[i]=65+rand.nextInt(26);
            }
            else{
                randomArray[i]=97+rand.nextInt(26);
            }
        }
        sort();

    }
    public void sort(){
        boolean swapped;

        for(int i=0;i<randomArray.length;i++){
            swapped=false;
            for(int j=0;j<randomArray.length-i-1;j++){
                if(randomArray[j]>randomArray[j+1]){
                    int temp=randomArray[j];
                    randomArray[j]=randomArray[j+1];
                    randomArray[j+1]=temp;
                    comparison+=1;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }

    }
    public void displayContent(){
        printDashes();
        System.out.print("|");
        for(int i=0;i<n;i++){
            System.out.printf("%3d  |",i);
        }
        System.out.println();
        printDashes();
        System.out.print("|");
        for(int i=0;i<n;i++) {
            System.out.printf("%3d  |", randomArray[i]);
        }
        System.out.println();
        printDashes();
        System.out.print("|");
        for(int i=0;i<n;i++){
            System.out.printf("%3s  |",(char)randomArray[i]);
        }
        System.out.println();
        printDashes();
        System.out.print("No of comparisons: "+comparison);
    }
    public void printDashes(){
        for(int i=0;i<n;i++){
            System.out.print("------");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Sivaranjani-2022503045");
        Sort_3045 obj =new Sort_3045();
        obj.readArray();
        obj.displayContent();

    }


}
