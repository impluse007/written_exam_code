package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class wy1 {
    public static double[] calc(int len,int []nums){
        double []res=new double[len];
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(nums[i]>nums[j])
                    count++;
            }
            res[i] =(double)count*100/(double)len;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int len= in.nextInt();
        int[] nums=new int[len];
        for(int i=0;i<len;i++) {
            nums[i] = in.nextInt();
        }
        double[] res=calc(len,nums);
        int time=in.nextInt();
        int []t=new int[time];
        for(int i=0;i<time;i++){
            t[i]=in.nextInt()-1;
        }
        for(int i=0;i<time;i++){
            System.out.println(String.format("%.6f",res[t[i]]));
        }

    }
}
