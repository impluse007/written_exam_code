package com.beike;

import java.util.Arrays;
import java.util.Scanner;

public class t2 {
    public static int deal(int[] nums,int n) {
        int res = 0;
        int[] dp = new int[n];
        for(int i=0;i<n;i++) {
            int st = 0, end = res;
            while(st < end) {
                int mid = st+(end-st)/2;
                if(dp[mid] < nums[i])
                    st = mid+1;
                else
                    end = mid;
            }
            dp[st] = nums[i];
            if(st == res)
                res++;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res=deal(nums,n);

        System.out.print(res);

    }
}
