package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wanyu on 2018/3/27.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(9087);//服务器端SOCKET
            Socket socket=serverSocket.accept();//监听 等待客户端的请求
            InputStream in=socket.getInputStream();//获取输入流 读客户端信息
            InputStreamReader inr=new InputStreamReader(in);
            BufferedReader br=new BufferedReader(inr);
            String text=null;
            while((text=br.readLine())!=null){
                System.out.println("服务器小明收到，小红客户端说："+text);
            }
            socket.shutdownInput();//只关闭输入流 不关闭socket
            OutputStream os=socket.getOutputStream();
            PrintStream write=new PrintStream(os);
            write.print("你是个萨比");
           write.flush();
            write.close();
            os.close();
            br.close();
            inr.close();
            in.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
