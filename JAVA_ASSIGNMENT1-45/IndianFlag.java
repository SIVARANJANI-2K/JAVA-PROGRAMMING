public class IndianFlag {
    public static void main(String[] args){
        part();
    }
    static void  part(){
        int t=3;
        while(t>0){
            int i;
            for(i=1;i<=30;i++){
                System.out.print('_');
            }
            int n=2;
            if(t==2){
                n=n+1;
            }
            while(n>0){
                System.out.println();
                for(int j=1;j<=30;j++){
                    if(j==1||j==30){
                        System.out.print("|");
                    }
                    if(t==2){
                        if(j>=12 && j<=17){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else{
                        System.out.print(" ");
                    }

                }

                n--;
            }
            System.out.println();
            t--;
        }
        int i;
        for(i=1;i<=30;i++){
            System.out.print('_');
        }
        System.out.println();
        for(i=1;i<=10;i++){
            System.out.println("|");
        }









    }
}
