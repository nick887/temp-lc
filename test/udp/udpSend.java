package test.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpSend {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        Scanner input=new Scanner(System.in);
        while (true) {
            String info = input.next();
            DatagramPacket dp = new DatagramPacket(info.getBytes(), info.length(), InetAddress.getByName("127.0.0.1"), 3000);
            System.out.println("udpSend : will send");
            ds.send(dp);
            System.out.println("udpSend: send over");
            Thread.sleep(1000);
            byte[] buf = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(buf, 1024);
            System.out.println("udpSend: i am receving");
            ds.receive(dp2);
            System.out.println("udpSend: receved");
            String str2 = new String(dp2.getData(), 0, dp2.getLength()) + " from " + dp2.getAddress().getHostAddress() + ":" + dp2.getPort();
            System.out.println(str2);
        }
    }
}
