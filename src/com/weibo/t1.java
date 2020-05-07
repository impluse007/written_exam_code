package com.weibo;

public class t1 {

    public static String getMinVersion(String[] list){
        int len=list.length;
        return list[0];
    }
    public static int scompare(String s1,String s2){
        String[] temp1= s1.split("\\.");
        String[] temp2= s2.split("\\.");
        int len=temp1.length;
        int len2=temp2.length;
        int lenmin=Math.min(len,len2);
        for(int i=0;i<lenmin;i++){
            if(Integer.valueOf(temp1[i])<Integer.valueOf(temp2[i])){
                return 1;
            }
            else if(Integer.valueOf(temp1[i])>Integer.valueOf(temp2[i])){
                return -1;
            }
        }
        return len2>len?1:-1;
    }
    public static void main(String[] args){


    }
}
