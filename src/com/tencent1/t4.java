package com.tencent1;

import java.util.Scanner;
import java.util.*;
public class t4 {
    public static int calcnum(int[] point,int n){
       Map<Integer,Integer> temp=new TreeMap<>();
       for(int i=0;i<n;i++){
           temp.put(point[i],i);
       }
       int max=0;
       for(Map.Entry<Integer,Integer> e:temp.entrySet()){
           int st=0,end=n-1;
           for(int i=e.getValue();i>=0;i--){
               if(point[i]<e.getKey()){
                   st=i+1;
                   break;
               }

           }
           for(int i=e.getValue();i<=n-1;i++){
               if(point[i]<e.getKey()){
                   end=i-1;
                   break;
               }

           }
           int t=calc(point,st,end);
           if(t>=max)
               max=t;
           else break;
       }
       return max;
    }
    public static int calc(int[] nums,int i,int j){
        int sum=0,min=Integer.MAX_VALUE;
        for(int p=i;p<=j;p++){
            sum+=nums[p];
            min=Math.min(min,nums[p]);
        }
        return sum*min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] point=new int[n];
        for(int i=0;i<n;i++){
           point[i]=in.nextInt();

        }
        System.out.println(calcnum(point,n));
    }
}
