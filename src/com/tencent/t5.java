package com.tencent;

import java.util.Scanner;

public class t5 {
    public static int workandfit(int[] work,int[] fit,int day){
        int[] dp=new int[day];
        dp[0]=(fit[0]+work[0])>0?0:1;
        for(int i=1;i<day;i++){
            if(dp[i-1]==0)
                dp[i]=(fit[0]+work[0])>0?0:1;
            else{

            }
        }
        return dp[day-1];
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int[] work=new int[day];
        int[] fit=new int[day];
        int res=workandfit(work,fit,day);
        System.out.println(res);

    }
}
