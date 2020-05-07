package com.company;

import java.util.Arrays;

public class findmid {
    public static int Findmid(int[] nums){
        int len=nums.length-1;
        int t=len/2;
        int index=partition(nums,0,len);
        while(index!=t)
        {
            System.out.println(index);
            if(index>t)
                index=partition(nums,0,index-1);
            else{
                index=partition(nums,index,len);
            }
        }
        return nums[index];
    }
    public static int partition(int[] nums,int st,int end){
        int privot=nums[st];
        int index=st;
        for(int i=st;i<=end;i++){
            if(nums[i]<privot)
                swap(nums,++index,i);
        }
        swap(nums,st,index);
        return index;
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void main(String[] args){
        int[] ori={54,1,2,3,4,122,3,1,35,11,44,22,67,88};
        int res=Findmid(ori);
        Arrays.sort(ori);
        int res1=ori[ori.length/2];
        System.out.println(res);
        System.out.println(res1);

    }
}
