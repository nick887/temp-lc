package test.tcp;

import java.io.*;
import java.net.Socket;

public class Worker implements Runnable{
    Socket s;
    public Worker(Socket s)
    {
        this.s=s;
    }
    public void run()
    {
        try {
            InputStream ips=s.getInputStream();
            OutputStream ops=s.getOutputStream();
            ops.write("hello client".getBytes());
            BufferedReader br=new BufferedReader(new InputStreamReader(ips));
            DataOutputStream dos=new DataOutputStream(ops);
            while (true) {
                String strWord=br.readLine();
                System.out.println("Client said :" + strWord+":"+strWord.length());
                if(strWord.equalsIgnoreCase("quit"))
                    break;
                String strEcho=strWord+" 666 ";
                System.out.println("server said:"+strWord+"---->"+strEcho);
                dos.writeBytes(strWord+"--->"+strEcho+System.getProperty("line.separator"));
            }
            br.close();
            dos.close();
            ips.close();
            ops.close();
            s.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
