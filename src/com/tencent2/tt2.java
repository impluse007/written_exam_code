package com.tencent2;

import java.util.Scanner;

public class tt2 {
    public static void deal(int [][]nums,int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(nums[i][1],min);
            max=Math.max(nums[i][1],max);
        }
        System.out.println(min+max);
    }

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [][] temp=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                temp[i][j]=sc.nextInt();
            }
    }
        deal(temp,n);
}
}
