import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

class Client
{
	public static void main(String[] args) throws IOException
	{
		Socket socket = new Socket("localhost",444);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("Hello, I am Shandip.");
		dos.flush();
		socket.close();
	}
}