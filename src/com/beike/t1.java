package com.beike;

import java.util.Scanner;

public class t1 {
    public static long[] deal(long[] nums, int n) {
        long[] res = new long[2];
        long min = Math.abs(nums[0] - nums[1]);
        res[0] = nums[0];
        res[1] = nums[1];
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) < min) {
                min = Math.abs(nums[i] - nums[i + 1]);
                res[0] = nums[i];
                res[1] = nums[i + 1];
            }
        }
    return res;
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long[] nums = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextLong();
            }
            long []res=deal(nums,n);
            for(int i=0;i<2;i++){
                System.out.print(res[i]);
            }

        }
    }
