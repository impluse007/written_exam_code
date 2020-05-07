package com.pdd_test;
import java.util.Arrays;
import java.util.Scanner;

public class t3 {
    public static double calcres(int n,int[] nums){
        long all=1;
        int max=0;
        for(int i=0;i<n;i++){
            all*=nums[i];
            max=Math.max(max,nums[i]);
        }
        double res=0;
        Arrays.sort(nums);
        for(int i=1;i<=max;i++){
            int temp=1;

            for(int j=0;j<n;j++){
                if(nums[j]<=i){
                    temp*=nums[j];
                }
                else{
                    temp*=(n-1-j);
                   break;
                }
                temp--;
                temp=temp*i;
            }
            double t=(double)temp/all;
            res+=t;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(String.format("%.2f",calcres(n,nums)));
    }
}
