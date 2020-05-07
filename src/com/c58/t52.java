package com.c58;

import java.util.Scanner;



public class t52 {
    public static int calc(int [][]nums,int m,int n){
        int[][] dp=new int[m][n];
        int temp1=0,temp2=0;
        for(int i=0;i<m;i++){
            temp1+=nums[i][0];
            dp[i][0]=temp1;
        }
        for(int j=0;j<n;j++){
            temp2+=nums[0][j];
            dp[0][j]=temp2;
        }
        for (int i = 1; i <m; i++) {
            for (int j = 1; j <n; j++) {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+nums[i][j];

            }

        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]nums=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                nums[i][j]=sc.nextInt();
            }
        }
        System.out.println(calc(nums,m,n));
    }
}