package com.wangyihuyu;

import java.util.Scanner;


public class wyhyt1 {
    public static int[] calc(int n1,int n2){
        int[] nums=new int[10];
        add(nums,n1);
        add(nums,n2);
        int temp=n2;
        int sum=0;
        while(temp!=0){
            int m=temp%10;
            add(nums,m*n1);
            temp=temp/10;
        }
        add(nums,n2*n1);

        return nums;
    }
    public static void add(int[]nums,int num){
        int temp=num;
        while(temp!=0){
            if(temp%10!=0){
                nums[temp%10]++;
            }
            temp=temp/10;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int [][]nums=new int[len][2];
        for(int i=0;i<len;i++){
            for(int j=0;j<2;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int[] sum=new int[10];
        for(int i=0;i<len;i++){
            int []res=calc(nums[i][0],nums[i][1]);
            for(int t=1;t<10;t++){
                sum[t]+=res[t];
                System.out.print(res[t]+" ");
            }
            System.out.println();
        }
        int index=1,max=0;
        for(int i=1;i<10;i++){
            if(sum[i]>max){
                max=sum[i];
                index=i;
            }
        }
        System.out.print(index);

    }
}
