package com.train;

public class mergeSort {
    public static int [] mergesort(int []nums){
        if(nums.length<2) return nums;
        divide(0,nums.length-1,nums);
        return nums;

    }
    public static void divide(int st,int end,int[] nums){
        if(st>=end) return;
        int mid=(st+end)/2;
        divide(st,mid,nums);
        divide(mid+1,end,nums);
        merge(st,mid,end,nums);

    }
    public static void merge(int st,int mid,int end,int[] nums){
        int [] temp=new int[end-st+1];
        int i=st,j=mid+1;
        int t=0;
        while(i<=mid&&j<=end){
            temp[t++]= nums[i]<nums[j]?nums[i++]:nums[j++];
        }
        while(i<=mid)
            temp[t++]=nums[i++];
        while(j<=end)
            temp[t++]=nums[j++];
        for(int n=st;n<=end;n++){
            nums[n]=temp[n-st];
        }
    }

    public static void main(String[] args){
        int[] nums={1,3,4,2,32,11,9};
        int[] res = mergesort(nums);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
}
