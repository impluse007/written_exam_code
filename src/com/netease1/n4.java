package com.netease1;

import java.util.Scanner;

public class n4 {
    public static int deal(int[] nums,int n){
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j])
                    res+=(j-i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] nums = new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(deal(nums,m));
    }}

