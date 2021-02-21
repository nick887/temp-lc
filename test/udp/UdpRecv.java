package test.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpRecv {
    public static void main(String[] args)throws Exception {
        DatagramSocket ds=new DatagramSocket(3000);
        byte[] buf=new byte[1024];
        DatagramPacket dp=new DatagramPacket(buf,1024);
        while (true) {
            System.out.println("udpRecv: waiting");
            ds.receive(dp);

            System.out.println("udpRecv: received");

            String strRecv = new String(dp.getData(), 0, dp.getLength()) + " from " + dp.getAddress().getHostAddress() + ":" + dp.getPort();
            System.out.println(strRecv);

            Thread.sleep(1000);
            System.out.println("udpRecv: sending");
            String str = "hello world 222";
            DatagramPacket dp2 = new DatagramPacket(str.getBytes(), str.length(), dp.getAddress(), dp.getPort());
            ds.send(dp2);
            System.out.println("udpRecv : sended");
        }
    }
}
