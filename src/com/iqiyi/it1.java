package com.iqiyi;

import java.util.Scanner;

public class it1 {
    public static int calc(int[] nums,int isone,int iszero){
        int len=nums.length;
        int num=Math.min(isone,iszero);
        int res=1;
        for(int i=0;i<num;i++)
        {
            res*=len-i;
        }
        return res%(1000000007);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n-1];
        int iszero=0;
        int isone=0;
        for(int i=0;i<n-1;i++){
            nums[i]=sc.nextInt();
            if(nums[i]==0)
                iszero++;
            else
                isone++;
        }
        System.out.println(calc(nums,isone,iszero));
    }
}
