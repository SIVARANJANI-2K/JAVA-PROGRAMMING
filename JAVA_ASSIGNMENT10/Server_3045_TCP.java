import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class Server_3045_TCP {
    public static void main(String[] args){
        try(ServerSocket ss=new ServerSocket(9100);){
            System.out.println("Server started "+ss.getInetAddress());
            while(true){
                try(Socket socket=ss.accept()){
                    System.out.println("Client connected :"+socket.getInetAddress());
                    DataInputStream from_client=new DataInputStream(socket.getInputStream());
                    DataOutputStream to_client=new DataOutputStream(socket.getOutputStream());
                    String from=from_client.readUTF();
                    System.out.println("Message from client : "+from);
                    String to=from.toUpperCase();
                    to_client.writeUTF(to);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
