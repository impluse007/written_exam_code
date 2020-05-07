package com.gaotong;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class gt1 {
    public static void calc(int[] nums,int [][] deal){
        int len=deal.length;
        Integer[] temp=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i];
        }

        for(int i=0;i<len;i++){
            if(deal[i][0]==1){
                Arrays.sort(temp,0,deal[i][1]);
            }
            else{
                Arrays.sort(temp, 0, deal[i][1], new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return -1 ;
                    }
                });
            }
        }
        for (int i = 0; i <nums.length; i++) {
            System.out.print(temp[i]);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int d=sc.nextInt();
        int []nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int [][]deal=new int[d][2];
        for(int i=0;i<d;i++){
            for(int j=0;j<2;j++){
                deal[i][j]=sc.nextInt();
            }
        }
        calc(nums,deal);
    }
}
