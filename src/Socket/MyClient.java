package Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by wanyu on 2018/4/3.
 */
public class MyClient {
    public static void main(String[] args) {
        Socket socket=null;
        DataInputStream in=null;
        DataOutputStream out=null;
        Scanner cin=new Scanner(System.in);
        try {
            socket=new Socket("127.0.0.1",9089);
            System.out.println("客户发起提问");
            in=new DataInputStream(socket.getInputStream());
            out=new DataOutputStream(socket.getOutputStream());
            out.writeUTF(cin.next());
            String str=in.readUTF();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
