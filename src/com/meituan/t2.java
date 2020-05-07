package com.meituan;

import java.util.Scanner;

public class t2 {
    public static int lenof(int a,int b,int m,int x){
        int i=0;
        int []nums=new int[m+1];
        while(i<=m){
            nums[i]=x;
            x=(a*x+b)%m;
            i++;
        }
        for(int j=1;j<=m;j++){
            if(nums[j]==nums[0])
                return j;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int res= lenof(a,b,m,x);
        System.out.println(res);

    }
}
