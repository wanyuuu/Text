package Socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by wanyu on 2018/3/27.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",9087);//指定服务器和端口
            OutputStream os=socket.getOutputStream();//输出流
            PrintWriter writer=new PrintWriter(os);
            writer.print("你是个宝宝");
            writer.flush();
            InputStream in=socket.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(in));//只有字符流才能缓冲
            String text="";
            while((text=br.readLine())!=null){
                System.out.println("客户端小红收到回应,服务器小明说："+text);
            }
            br.close();
            in.close();
            writer.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
