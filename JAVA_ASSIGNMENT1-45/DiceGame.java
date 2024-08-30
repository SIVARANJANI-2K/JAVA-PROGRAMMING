import java.util.Random;
public class DiceGame {
    public static void main(String[] args){
        int currentCredit=1000;
        DiceGame player1=new DiceGame();
        player1.Play(currentCredit, 1);

    }
    public void Play(int credits,int player){
        Random rand=new Random();
        int max=12;
        int min=2;
        System.out.println("Player "+player+" starts playing with "+credits+" credits");
        while(credits>0 && credits<2000){
           System.out.println("Rolling the dice....");
           int n=rand.nextInt(max-min+1)+min;
           System.out.println("Dice sum :"+n);
           if(n==7||n==11){
              credits+=100;
              System.out.println("You won 100 credits!\nNew credits : "+credits);
             
           }
           else if(n==2||n==3||n==12){
            credits-=100;
            System.out.println("Oops! You lost 100 credits!\n New credits: "+credits);
           }
           else{
            System.out.println("No change in the credits New Credits :"+credits);
           }
        }
        System.out.println("Game Over ...");
        System.out.println("Final credits :"+credits);
        System.out.println("Thank you Player"+player);
        
    }
}
