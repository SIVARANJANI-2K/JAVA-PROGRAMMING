import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_ServerEmail_45 {
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
        try(ServerSocket server=new ServerSocket(9200)){
            System.out.println("Server started "+server.getInetAddress());
            while(true){
                try(Socket client=server.accept()){
                    System.out.println("Client connected "+client.getInetAddress());
                    DataInputStream from_client=new DataInputStream(client.getInputStream());
                    DataOutputStream to_client =new DataOutputStream(client.getOutputStream());
                    String mail=from_client.readUTF();
                    boolean isValid=isValidEmail(mail);
                    to_client.writeBoolean(isValid);
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
