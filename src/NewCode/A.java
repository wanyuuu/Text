package NewCode;

import java.util.*;

/*
设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
 */
public class A {
    public static void main(String args[]){
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            List<Integer> list=new ArrayList<Integer>();
            int n=cin.nextInt();
            for(int i=0;i<n;i++){
                list.add(cin.nextInt());
            }
            Collections.sort(list, new Comparator<Integer>() {//根据比较器规则排序
                @Override
                public int compare(Integer o1, Integer o2) {
                    String s1=String.valueOf(o1);
                    String s2=String.valueOf(o2);
                    return (s2+s1).compareTo(s1+s2);//大于参数值 返回正数
                }
            });

            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}
