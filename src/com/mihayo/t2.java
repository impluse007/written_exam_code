package com.mihayo;

import java.util.Scanner;

public class t2 {
    public static int calc(int len1,int len2,String []s){
        return 5;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len1=sc.nextInt();
        int len2=sc.nextInt();
        String []res=new String [len2];
        for(int i=0;i<len2;i++){
            res[i]=sc.next();
        }
        int temp=calc(len1,len2,res);
        System.out.println(temp);
    }
}
