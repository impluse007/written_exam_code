package com.didi;

import java.util.Scanner;

public class t1 {
    public static String swapchar(int[] nums,char[] op ,int n){
        int[] status=new int[n];
        status[0]=op[0]=='+'||op[0]=='-'?1:2;
        status[n-1]=op[n-2]=='+'||op[n-2]=='-'?1:2;
        for(int i=1;i<n-1;i++){
            if((op[i-1]=='+'||op[i-1]=='-')&&(op[i]=='+'||op[i]=='-')){
                status[i]=1;
            }
            else status[i]=2;
        }
        for(int i=1;i<4;i++){
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]&&status[j+1]==status[j]){
                    swap(nums,j,j+1);
                }

            }
        }
        String s="";
        for(int i=0;i<n-1;i++){
            s=s+nums[i];
            s=s+op[i];
        }
        s=s+nums[n-1];
        return s;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        char[] op=new char[n];
        for(int i=0;i<n*2-1;i++){
            String temp=sc.next();
            if(i%2==0)
            {
                nums[i/2]=Integer.valueOf(temp);
            }
            else{
                op[(i-1)/2]=temp.charAt(0);
            }

        }


       System.out.println(swapchar(nums,op,n));
    }
}
