package com.kuaishou;

import java.util.Scanner;

public class kt4 {
    public static int longcalc(int []nums,int len){
        int[] temp=new int[1000];
        for(int i=0;i<len;i++){
            temp[nums[i]]++;
        }
        int res=0;
        int max=0;
        for(int i=0;i<1000;i++){
            if(res>0&&temp[i]>0)
                res++;
            else if(res==0&&temp[i]>0)
                res=1;
            else{
                res=0;
            }
            max=Math.max(max,res);
        }
        return max;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(longcalc(nums,len));
    }
}
