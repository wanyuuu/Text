package Socket;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by wanyu on 2018/4/3.
 */
public class MyServer{
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        DataInputStream in=null;
        DataOutputStream out=null;
        Scanner cin=new Scanner(System.in);
        try {
            serverSocket=new ServerSocket(9089);
            System.out.println("等待客户呼叫");
            socket=serverSocket.accept();
            in=new DataInputStream(socket.getInputStream());
            out=new DataOutputStream(socket.getOutputStream());
            String str=in.readUTF();
            System.out.println("服务器收到客户端提问："+str);
            out.writeUTF("服务器说："+cin.next());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
                socket.close();
                serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
