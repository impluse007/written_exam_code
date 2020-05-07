package com.netease1;

import java.util.Scanner;


public class n1 {
    public static String calc(int num){
        int temp=num;
        if(temp<10) return num+"";
        String res="";
        while(temp>9){
            res=res+"9";
            temp=temp-9;

        }
        return temp+""+res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int []nums=new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            System.out.println(calc(nums[i]));
        }

    }
}
