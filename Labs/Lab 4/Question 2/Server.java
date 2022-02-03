import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.IOException;

class Server
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket serverSocket = new ServerSocket(555);
		Socket socket = serverSocket.accept();
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		System.out.println("Client says:" + dis.readLine());
		dis.close();
		serverSocket.close();
		socket.close();
	}
}