public class HelloFriends {
    public static void main(String[] args){
        if(args.length==0) {
            System.out.print("No commands");
        }
        else{
            for(String str:args){
                System.out.print(str);
            }
        }
    }
}
