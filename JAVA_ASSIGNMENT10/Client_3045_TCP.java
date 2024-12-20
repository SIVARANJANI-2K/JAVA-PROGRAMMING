import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client_3045_TCP {
    public static  void main(String[] args){



            try (Socket s = new Socket("localhost", 9100);) {
                System.out.println("Client requesting server connection...");
                while(true) {
                    DataInputStream from_server = new DataInputStream(s.getInputStream());
                    DataOutputStream to_server = new DataOutputStream(s.getOutputStream());

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the message to server : ");
                    String to = sc.nextLine();

                    to_server.writeUTF(to);

                    String from = from_server.readUTF();
                    System.out.println("From server : " + from);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }
}
