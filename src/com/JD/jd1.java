package com.JD;

import java.util.Arrays;
import java.util.Scanner;

public class jd1 {
    public static int calc1(int[] nums,int n){

        return n;
    }


    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] build=new int[n];
        for(int i=0;i<n;i++){
            build[i]=sc.nextInt();
        }
        int res=calc1(build,n);

        System.out.println(res);

    }
}
