import java.util.Scanner;

public class SumOfArray_3045{
    int[][] arr1;
    int[][] arr2;
    int[][] sum;
    int[] columnSum;
    int n;
    Scanner sc=new Scanner(System.in);
    public void readArrays(){
        System.out.println("\n enter the dimension of n*n arrays:");
        n=sc.nextInt();
        arr1=new int[n][n];
        arr2=new int[n][n];
        System.out.println("Enter the elements of first array :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                   
                   arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                  
                   arr2[i][j]=sc.nextInt();
            }
        }
        
    }
    public void sumArray(){
       sum=new int[n][n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            sum[i][j]=arr1[i][j]+arr2[i][j];
        }
       }
       System.out.println("Sum Array before sorting:");
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(sum[i][j]+" ");
        }
        System.out.println();
       }
       columnSum();
    }
    public void columnSum(){
         columnSum=new int[n];
         for(int j=0;j<n;j++){
            int temp=0;
            for(int i=0;i<n;i++){
                temp+=sum[i][j];
            }
            columnSum[j]=temp;
         }
         sort();
    }
    public void sort(){
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(columnSum[j]>columnSum[j+1]){
                    int temp=columnSum[j];
                    columnSum[j]=columnSum[j+1];
                    columnSum[j+1]=temp;
                    swapColumn(j,j+1);
                    swapped=true;
                }

            }
            if(!swapped)
               break;
        }
    }
    public void swapColumn(int j,int k){
        for(int i=0;i<n;i++){
            int temp=sum[i][j];
            sum[i][j]=sum[i][k];
            sum[i][k]=temp;
        }
    }
    public void displaySorted(){
        System.out.println("Sum array after sorted by columnSum:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("\nSivaranjani - 2022503045");
        SumOfArray_3045 obj=new SumOfArray_3045();
        obj.readArrays();
        obj.sumArray();
        obj.displaySorted();
    }
}