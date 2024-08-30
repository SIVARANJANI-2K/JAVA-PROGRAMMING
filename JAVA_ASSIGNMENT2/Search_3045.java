import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Search_3045 {
    int n;
    int[] A;
    int[] B;
    Random rand=new Random();
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> frequencyB=new HashMap<>();
    public void readArrays(){
        System.out.print("enter the number of elements:");
        n=sc.nextInt();
        A=new int[n];
        B=new int[n];
        int max=20;
        int min=1;
        for(int i=0;i<n;i++){
            A[i]=rand.nextInt(max-min+1)+min;
            B[i]=rand.nextInt(max-min+1)+min;
            frequencyB.put(A[i],0);
        }
    }
    public void searchInA(){
        for(int a:A){
            frequencyB.put(a,frequencyB.get(a)+1);
        }

    }
    public void displayFrequency(){
        for(int b:B){
             System.out.println(b+" --> "+frequencyB.get(b));
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args){
        System.out.println("\nSivaranjani-2022503045");
        Search_3045 obj=new Search_3045();
        obj.readArrays();
        obj.searchInA();
        obj.displayFrequency();
    }
}
