package com.meituan;

import java.util.Scanner;

public class mt4 {
    public static int dealmid(int[] nums,int k){
        int l=0,s=0;
        for(int num:nums){
            if(num>k)
                l++;
            if(num<k)
                s++;
        }
        int min=Math.min(l,s);
        int max=Math.max(l,s);
        return max-min-1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int res=dealmid(nums,k);
        System.out.println(res);

    }
}
