package CCF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wanyu on 2018/3/16.
 * 挂钥匙问题
 */
public class F {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        List<Teacher> tea=new ArrayList<Teacher>();//存教师
        List<Integer> key=new ArrayList<>(); //存要归还的钥匙
        int N=cin.nextInt();
        int K=cin.nextInt();
        int arr[]=new int[N+1];//初始化钥匙序列
        int time=1;
        for(int i=1;i<=N;i++){
            arr[i]=i;
        }
        for(int i=1;i<=K;i++){
            Teacher t=new Teacher(cin.nextInt(),cin.nextInt(),cin.nextInt());
            tea.add(t);
        }
        while(time<=getMaxTime(tea)){ //直到当前时间超过最后一个归还的时间
            returnKey(time,tea,key,arr);
            borrowKey(time,tea,arr);
            time++;
        }
        for(int j=1;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    public static void returnKey(int time,List<Teacher> tea,List<Integer> key,int arr[]){
        key.clear();
        for(int i=0;i<tea.size();i++){
            if(tea.get(i).sc==time){  //归还钥匙
                key.add(tea.get(i).w);
            }
        }
        if(key.isEmpty()){
            return ;
        }else
        {
            Collections.sort(key); //将要归还的钥匙从小到大排序
        }
        for(int i=1,j=0;i<arr.length;i++){ //将钥匙归还
            if(arr[i]==0){
                arr[i]=key.get(j);
                if(key.size()-1==j){
                    break;
                }else
                {
                    j++;
                }
            }
        }
    }
    public static void borrowKey(int time,List<Teacher> tea,int arr[]){
        for(int i=0;i<tea.size();i++){
            if(time==tea.get(i).s){
                for (int j=1;j<arr.length;j++){
                    if(arr[j]==tea.get(i).w){
                        arr[j]=0;     //借走钥匙
                    }
                }
            }
        }
    }
    public static int getMaxTime(List<Teacher> list){ //获取老师还钥匙的最晚时间
        int maxTime=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).sc>maxTime){
                maxTime=list.get(i).sc;
            }
        }
        return maxTime;
    }
}
class Teacher{
    int w;
    int s;
    int c;
    int sc;
    public Teacher(int w,int s,int c){
        this.w=w;
        this.s=s;
        this.c=c;
        this.sc=s+c;
    }
}
