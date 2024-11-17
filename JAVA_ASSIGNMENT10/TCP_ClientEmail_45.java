import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCP_ClientEmail_45 {
    public static  void main(String[] args){
        try(Socket s=new Socket("localhost",9200);){
            System.out.println("Client requesting server connection...");
            DataInputStream from_server=new DataInputStream(s.getInputStream());
            DataOutputStream to_server=new DataOutputStream(s.getOutputStream());

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the email : ");
            String to=sc.nextLine();

            to_server.writeUTF(to);

            if(from_server.readBoolean())
                System.out.println("It is valid email");
            else
                System.out.println("It is Invalid email");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
