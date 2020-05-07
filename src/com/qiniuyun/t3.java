package com.qiniuyun;

import java.util.Scanner;

public class t3 {
    public static void findnum(int[] nums,int num){
        int st=-1,end=-1,flag=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num&&flag==0){
                st=i;
                end=i;
                flag=1;
            }
            if(nums[i]==num){
                end=i;
            }
        }
        System.out.println(st+" "+end);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] nums=new int[l];
        for(int i=0;i<l;i++){
            nums[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        findnum(nums,num);
    }
}
