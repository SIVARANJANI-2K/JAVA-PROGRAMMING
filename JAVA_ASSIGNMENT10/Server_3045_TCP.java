import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;

public class Server_3045_TCP {
    public static void main(String[] args){
        try(ServerSocket ss=new ServerSocket(9100);){
            System.out.println("Server started "+ss.getInetAddress());

                try(Socket socket=ss.accept()){
                    System.out.println("Client connected :"+socket.getInetAddress());
                    while(true) {
                        DataInputStream from_client = new DataInputStream(socket.getInputStream());
                        DataOutputStream to_client = new DataOutputStream(socket.getOutputStream());
                        String from = from_client.readUTF();
                        System.out.println("Message from client : " + from);
                        System.out.println("Enter your message :");
                        String to;
                        Scanner sc = new Scanner(System.in);
                        to = sc.nextLine();
                        to_client.writeUTF(to);
                    }
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
