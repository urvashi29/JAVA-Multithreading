//Simple Duplex
//Server side
package multithreading;
import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) {
	try {
			ServerSocket ss= new ServerSocket(1998);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			ss.close();
		}
     catch(Exception e)
		{
            System.out.print("invalid");
		}
				
	}
}



