package com.netease1;

import java.util.Scanner;


public class n2 {
    public static int deal(int a,int b,int p,int q){
        if(a+p>=b) return 1;
        int temp=0;
        long bigp=p;
        if(q>=2){
            while(a+bigp<b){
                bigp=bigp*q;
                temp++;
            }
            temp++;
        }
        else{
            while(a+p<b){
                a=a+p;
            }

        }
        return temp;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int [][] nums=new int[m][4];
        for(int i=0;i<m;i++){
            for(int j=0;j<4;j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <m ; i++) {
            System.out.println(deal(nums[i][0],nums[i][1],nums[i][2],nums[i][3]));
        }

    }

}
