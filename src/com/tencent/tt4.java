package com.tencent;

import java.util.Arrays;
import java.util.Scanner;

public class tt4 {
    public static int []seebuilding(int[] nums,int n){
        int []res=new int[n];
        int []prev=new int[n];
        int []next=new int[n];
        Arrays.fill(prev,1);
        Arrays.fill(next,1);
        for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               if(nums[j]>nums[i])
                   res[i]++;
           }
        }
        return res;
    }


    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] build=new int[n];
        for(int i=0;i<n;i++){
            build[i]=sc.nextInt();
        }
        int []res=seebuilding(build,n);
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
    }
}
