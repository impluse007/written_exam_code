package com.company;

import java.util.Arrays;

public class maopao {
    public static void mpsort(int[] nums){
        if(nums==null||nums.length<2) return;
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(nums[j]>nums[j+1]){//比较相邻的元素，如果前者比后者大，就交换
                    swap(nums,j,j+1);
                }
            }
        }
    }
    public static void selectsort(int[] nums){
        if(nums==null||nums.length<2) return;
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            int min=nums[i];
            int index=i;
            for(int j=i+1;j<len;j++){
                if(nums[j]<min) {
                    min = nums[j];
                    index=j;
                }
            }
            swap(nums,i,index);
        }
    }
    public static void insertsort(int[] nums){
        if(nums==null||nums.length<2) return;
        int len=nums.length;
        for(int i=1;i<len;i++){
            for(int j=i-1;j>=0&&nums[j]>nums[j+1];j--){
                swap(nums,j,j+1);
            }
        }
    }
    public static void mergesort(int[] nums,int st,int end){//先拆分
        if(nums==null||nums.length<2||st>=end) return;
        int mid=(st+end)/2;
        mergesort(nums,st,mid);
        mergesort(nums,mid+1,end);
        merge(nums,st,mid,end);
    }
    public static void merge(int[] nums,int st,int mid,int end)//然后进行有序的合并
    {
        int[] temp=new int[end-st+1];
        int i=st;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=end){
            temp[k++]=nums[i]<nums[j]?nums[i++]:nums[j++];
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=end)
        {
            temp[k++]=nums[j++];
        }
        for(int p=st;p<=end;p++){
            nums[p]=temp[p-st];
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args){
        int[] a={5,3,2,9,4,11,6,7,8};
        //mpsort(a);
        //selectsort(a);
        insertsort(a);
        int len=a.length;
        //mergesort(a,0,len-1);
        System.out.println(Arrays.toString(a));
    }
}
