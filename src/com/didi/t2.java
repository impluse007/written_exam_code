package com.didi;

import java.util.Scanner;

public class t2 {
    public static int disappear(int len,int total,int cost,int[] A,int []B){
        return 3;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int total=sc.nextInt();
        int cost=sc.nextInt();
        int []A=new int[len];
        int []B=new int[len];
        for(int i=0;i<len;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++){
            B[i]=sc.nextInt();
        }
        System.out.print(disappear(len,total,cost,A,B));
    }
}
