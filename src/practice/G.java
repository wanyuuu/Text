package practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by wanyu on 2018/4/9.
 */
public class G {
    public static void main(String[] args) {
//        String arr[]={"wanyu","yuzhou","hahah","xixixi","hu"};
        String str=(String)null;
        if("txt".equals(null)){
            System.out.println("equals中可以为null");
        }
        String val=String.valueOf(null);//Null指针异常
    }
    @Test
    public void test(){
        ArrayList<String> list=new ArrayList<String>();
        list.add("wanyu");
        list.add("yuzhou");
        list.add("hahah");
        list.add("xixixi");
        Iterator<String> it=list.iterator();//用迭代器删除 用for循环删除时 size大小会变
        while(it.hasNext()){
            if(it.next().contains("u")){
                it.remove();
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
