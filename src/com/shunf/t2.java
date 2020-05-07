package com.shunf;

import java.util.Arrays;
import java.util.Scanner;


public class t2 {
    public static int max(int[] nums) {
        int max = 0;
        int len=nums.length;
        int[] dp = new int[len];
        for(int num : nums) {
            int st = 0, end = max;
            while(st < end) {
                int mid = st+(end-st)/2;
                if(dp[mid] <= num)
                    st = mid+1;
                else
                    end = mid;
            }
            dp[st] = num;
            if(st == max)
                max++;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] nums =new int[len];
        for(int i=0;i<len;i++){

            nums[i]=sc.nextInt();
        }
        System.out.println(max(nums));
    }
}
