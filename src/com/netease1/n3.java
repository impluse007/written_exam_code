package com.netease1;

import java.util.Arrays;
import java.util.Scanner;

public class n3 {
    public static int deal(int []nums,int len){
        if(len<2)
            return 0;
        long sum=nums[0];
        int[] dp=new int [len];
        int max=0;
        Arrays.fill(dp,1);
        for(int i=1;i<len;i++){
            if(nums[i]>sum){
                dp[i]=dp[i-1]+1;
                sum=sum+nums[i];
            }
            else{
                sum=nums[i];
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int []nums=new int[m];
        for(int i=0;i<m;i++){
            int len=sc.nextInt();
            int []temp=new int[len];
            for(int p=0;p<len;p++){
                temp[p]=sc.nextInt();
            }
            System.out.println(deal(temp,len));
        }

    }
}
