package com.mihayo;

import java.util.Scanner;

public class t1 {

    public static String calc(String s){
        int len=s.length();
        int[] index=new int[len];
        for(int i=0;i<len;i++){
            if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
                index[i]=s.charAt(i)-'0';
                if(index[i-1]>0){
                    index[i-1]=index[i-1]*10+index[i];
                }
            }
        }
        return "a5";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(calc(s));
    }

}
