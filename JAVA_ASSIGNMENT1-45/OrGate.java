import java.util.Scanner;
public class OrGate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double basis=0.5;
        double Y;
        double W0,W1;
        int X1,X2;
        for(int i=0;i<4;i++){
            System.out.println("\nEnter X1 AND X2 input :");
            X1=sc.nextInt();
            X2=sc.nextInt();
            //determine w0 w1
            W0=0.1;
            W1=0.2;
    
                Y=basis+W0*X1+W1*X2;
                if(Y>basis){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
    
        }
        
    }
}