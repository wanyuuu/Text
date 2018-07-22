package Socket;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by wanyu on 2018/3/26.
 */
public class inetAddress {
    public static void main(String args[]){
        //InetAddress类用于标识网络上的硬件资源，标识互联网协议(IP)地址。
        //获取本地主机实例
        InetAddress inetAddress=InetAddress.getLoopbackAddress();
        System.out.println(inetAddress.getHostName());//主机名
        System.out.println(inetAddress.getHostAddress());//IP地址
        byte bytes[]=inetAddress.getAddress();
        System.out.println(bytes);
    }
    @Test
    public void test(){
        //URL(Uniform Resource Locator)统一资源定位符，表示Internet上某一资源的地址，协议名：资源名称
        try {
            URL hupu=new URL("https://nba.hupu.com");
           System.out.println(hupu.getProtocol());//协议
            System.out.println(hupu.getHost());//获取主机
            System.out.println(hupu.getPort());
            //使用URL读取网页内容
           InputStream in=hupu.openStream();
            InputStreamReader is=new InputStreamReader(in,"UTF-8");//将字节流转为字符输入流
            BufferedReader br=new BufferedReader(is);//为字符输入流提供缓冲
            String data=br.readLine();
            while(data!=null){
                System.out.println(data);
                data=br.readLine();
            }
            br.close();
            is.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
