import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_serverCap_45 {

    public static void main(String[] args){
        try(DatagramSocket socket=new DatagramSocket(9999)){
            System.out.println("Server started ...");
            byte[] from_client=new byte[1024];
            byte[] to_client=new byte[1024];
            DatagramPacket dr=new DatagramPacket(from_client,from_client.length);
            socket.receive(dr);
            String from=new String(dr.getData(),0,dr.getLength());
            System.out.println("Message from  client :"+from);
            String to=from.toUpperCase();
            to_client=to.getBytes();
            DatagramPacket ds=new DatagramPacket(to_client,to_client.length,dr.getAddress(),dr.getPort());
            socket.send(ds);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
