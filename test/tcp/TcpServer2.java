package test.tcp;
import java.net.ServerSocket;
import java.net.Socket;
import test.tcp.Worker;
public class TcpServer2 {
    public static void main(String[] args) {
        try
        {
            ServerSocket ss=new ServerSocket(8001);
            while (true)
            {
                Socket s=ss.accept();
                System.out.println("come a client");
                new Thread(new Worker(s)).start();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
