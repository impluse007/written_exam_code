package com.tencent2;

import java.util.Arrays;
import java.util.Scanner;

public class tt4 {
    public static int[] dealmin(int[] nums){
        int len=nums.length;
        int[] dp=new int[len];
        dp[0]=nums[0];
        for(int i=1;i<len;i++)
        {
            dp[i]=nums[i]-nums[i-1];
            if(dp[i]==0)
            {
                dp[i]=dp[i-1];
            }
        }
        return dp;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int []nums=new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int []res=dealmin(nums);
        for(int i=0;i<n;i++){
            if(i<m){
                System.out.println(res[i]);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
