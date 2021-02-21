package test.tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8001);
            System.out.println("server loaded");
            Socket s=ss.accept();//进入阻塞
            InputStream ips=s.getInputStream();
            OutputStream ops=s.getOutputStream();
            ops.write("hello client".getBytes());
            BufferedReader br=new BufferedReader(new InputStreamReader(ips));

            System.out.println("Client said :"+br.readLine());
            ips.close();
            ops.close();
            s.close();
            ss.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
