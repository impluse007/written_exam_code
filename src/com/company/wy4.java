package com.company;

import java.util.Scanner;

public class wy4 {
    public static int [] calc(int[] nums,int len1,int []caoz,int len2){
        int []count=new int[len2];
        for(int i=0;i<len2;i++){
            for(int j=0;j<len1;j++){
                if(nums[j]>=caoz[i]){
                    nums[j]--;
                    count[i]++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int len= in.nextInt();
        int clen=in.nextInt();
        int[] nums=new int[len];
        int[] caoz=new int[clen];
        for(int i=0;i<len;i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0;i<clen;i++)
        {
            caoz[i]= in.nextInt();
        }
        int []res=calc(nums,len,caoz,clen);
        for(int i=0;i<clen;i++){
            System.out.println(res[i]);
        }
    }
}
