package com.beike;

import java.util.Arrays;
import java.util.Scanner;

public class t4 {
    public static int deal(int[] nums, int n) {
      if(n==1) return 0;
      if(n==2) return nums[0]==nums[1]?1:0;
      int res=0;
      for(int i=1;i<n-1;i++){
          if(nums[i]<=nums[i-1]&&nums[i]<=nums[i+1])
               res+=dealcore(nums,n,i);
      }
        for(int i=1;i<n-1;i++){
            if(nums[i]<=nums[i-1]&&nums[i]<=nums[i+1])
                res+=dealcore(nums,n,i);
        }
      return res;
    }
    public static int dealcore(int[] nums,int n,int index){
        int temp=Math.max(nums[index-1],nums[index+1])+1;
        int res=temp-nums[index];
        nums[index]=temp;
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
