package com.mihayo_1;

import java.util.Scanner;

public class t1 {
    public static int Calc(int[][] gap,int n){
        if(n<1) return 0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,gap[i][0]);
            max=Math.max(max,gap[i][1]);
        }
        int[] count=new int[max-min];
        for(int i = min;i<max;i++){
            for(int j=0;j<n;j++){
                if(i>=gap[j][0]&&i<gap[j][1])
                {
                    count[i-min]++;
                }
            }
        }
        int res=0;
        for(int i=0;i<max-min;i++){
            res=Math.max(res,count[i]);
        }

        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]gap=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
               gap[i][j]=sc.nextInt();
            }
        }
        System.out.println(Calc(gap,n));
    }
}
