package com.beike;

import java.util.Arrays;
import java.util.Scanner;

public class t3 {
    public static int deal(int[] nums, int n) {
        int res=0;
        Arrays.sort(nums);
        double [] temp=new double[n];
        for(int i=0;i<n;i++){
            temp[i]=(double)nums[i];
        }
        for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++) {
               if (temp[i] >= temp[j] * 0.9) {
                   res++;
               } else break;
           }
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
