package com.tencent2;

import java.util.Arrays;
import java.util.Scanner;

public class tt3 {
    public static void deal(int []nums){
        int len=nums.length;
        Arrays.sort(nums);
        int sum1=0,sum2=0;
        for(int i=0;i<len;i++){
            if(i%2==0) {
                sum1 += nums[i];
            }
            else {
                sum2+=nums[i];
            }
        }

        System.out.print(sum1+" ");
        System.out.print(sum2);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            int []nums=new int[m];
            for(int p=0;p<m;p++){
                nums[p]=sc.nextInt();
            }
            deal(nums);
        }
    }
}
