package com.kuaishou;

import java.util.Arrays;
import java.util.Scanner;

public class kt3 {
    public static int kcalc(int[] nums,int len){
        Arrays.sort(nums);
        int st=0,end=len-1;
        while(st<end){
            int mid=(st+end)/2;
            if(sumnum(nums,0,st)==sumnum(nums,st,end)){
                return 0;
            }
            else if(sumnum(nums,0,st)>sumnum(nums,st,end)){
                end=mid-1;
            }
            else st=mid+1;
        }
        int res=(st+end)/2;
        return 0;

    }
    public static int sumnum(int[] nums,int i,int j){
        int sum=0;
        for(int p=i;p<=j;p++){
            sum+=nums[p];
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(kcalc(nums,len));
    }


}
