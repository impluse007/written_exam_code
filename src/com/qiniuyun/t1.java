package com.qiniuyun;

import java.util.*;
import java.util.Scanner;

public class t1 {
    public static int[] twosum(int []nums,int target){
        Map<Integer,Integer> temp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            temp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(temp.get(target-nums[i])!=null){
                return new int[]{i,temp.get(target-nums[i])};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int []nums=new int[l];
        for(int i=0;i<l;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int[] res=twosum(nums,target);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
    }
}
