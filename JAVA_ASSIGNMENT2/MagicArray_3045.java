import java.util.Scanner;
public class MagicArray_3045 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers(1 to 9):");
        int [][] arr = new int[3][3];
        System.out.println("Enter Middle Element:");
        int m = sc.nextInt();
        System.out.println("Sivaranjani-2022503045");

            arr[0][0] = m+1;
            arr[0][2] = m+3;
            arr[2][0] = m-3;
            arr[2][2] = m-1;
            arr[1][1] = m;
            int diagSum = m + arr[0][0] + arr[2][2];
            arr[0][1] = diagSum - (arr[0][0] + arr[0][2]);
            arr[1][0] = diagSum - (arr[0][0] + arr[2][0]);
            arr[2][1] = diagSum - (arr[2][0] + arr[2][2]);
            arr[1][2] = diagSum - (arr[0][2] + arr[2][2]);

            for(int i =0;i < 3 ; i++){
                for(int j =0; j< 3; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }



    }
}