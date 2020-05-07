package com.shunf;

import java.util.Scanner;

public class t1 {
    public static int calc(int num,int lan,int info,int [][]temp){
        return info;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int lan=sc.nextInt();
        int info=sc.nextInt();
        int [][]temp=new int[info][2];
        for(int i=0;i<info;i++){
            for(int j=0;j<2;j++){
               temp[i][j]=sc.nextInt();
            }
        }
        System.out.println(calc(nums,lan,info,temp));
    }
}
