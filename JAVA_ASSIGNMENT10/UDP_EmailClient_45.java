import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDP_EmailClient_45 {
    public static void main(String[] args) {
        try (DatagramSocket client = new DatagramSocket()) {
            System.out.println("Client started..");
            byte[] from_server = new byte[1024];
            byte[] to_server = new byte[1024];
            Scanner sc = new Scanner(System.in);
            System.out.println("Sivaranjani -2022503045");
            System.out.println("Enter the mail to server :");
            String to = sc.nextLine();
            to_server = to.getBytes();
            InetAddress ip = InetAddress.getByName("localhost");
            DatagramPacket dr = new DatagramPacket(to_server, to_server.length, ip, 9999);
            client.send(dr);

            DatagramPacket ds = new DatagramPacket(from_server, from_server.length);
            client.receive(ds);
            String from = new String(ds.getData(), 0, ds.getLength());
            System.out.println("Your email is "+from);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
