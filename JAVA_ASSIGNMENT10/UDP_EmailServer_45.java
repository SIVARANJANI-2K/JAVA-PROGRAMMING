import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_EmailServer_45 {
    public static boolean isValidEmail(String email){
        if(email==null||email.isEmpty())
            return false;
        int atIndex=email.indexOf('@');
        int dotIndex=email.lastIndexOf('.');
        if(atIndex>0 && dotIndex>atIndex){
            String localPart=email.substring(0,atIndex);
            String domainPart=email.substring(atIndex+1);
            boolean isValidLocal=isValidLocal(localPart);
            boolean isValidDomain=isValidDomain(domainPart);
            return isValidDomain && isValidLocal;
        }
        return false;
    }
    public static boolean isValidLocal(String localPart){
        for(char ch:localPart.toCharArray()){
            if(!Character.isLetterOrDigit(ch)||ch=='.'||ch=='_'){
                return false;
            }
        }
        return true;
    }
    public static boolean isValidDomain(String domainPart){
        for(char ch:domainPart.toCharArray()){
            if(!Character.isLetterOrDigit(ch) && ch!='.'){
                return false;
            }
        }
        return !domainPart.endsWith(".") && !domainPart.startsWith(".");
    }
    public static void main(String[] args){
        try(DatagramSocket socket=new DatagramSocket(9999)){
            System.out.println("Server started ...");
            byte[] from_client=new byte[1024];
            byte[] to_client=new byte[1024];
            DatagramPacket dr=new DatagramPacket(from_client,from_client.length);
            socket.receive(dr);
            String from=new String(dr.getData(),0,dr.getLength());
            System.out.println("mail from  client :"+from);
            boolean valid=isValidEmail(from);
            String to;
            if(valid)
                to="Valid";
            else
                to="Invalid";


            to_client=to.getBytes();
            DatagramPacket ds=new DatagramPacket(to_client,to_client.length,dr.getAddress(),dr.getPort());
            socket.send(ds);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
