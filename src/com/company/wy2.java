package com.company;

import java.util.Arrays;
import java.util.Scanner;



public class wy2 {
    public static int deal(int []nums,int len){
        Arrays.sort(nums);
        int flag=1;
        for(int i=0;i<len-2;i++){
            if(len==3)
            {
                if (nums[i] + nums[i + 1] <= nums[i+2])
                    return 0;
            }
            else{
                if (nums[i] + nums[i + 1] <nums[i+2])
                    return 0;
            }
        }

    return 1;
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int time= in.nextInt();
        int []res=new int[time];
        for(int t=0;t<time;t++) {
            int len=in.nextInt();
            int[] nums = new int[len];
            for (int i = 0; i < len; i++) {
                nums[i] = in.nextInt();
            }
            res[t]=deal(nums,len);
        }
        for(int t=0;t<time;t++){
            if(res[t]==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
