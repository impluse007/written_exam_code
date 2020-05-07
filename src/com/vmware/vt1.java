package com.vmware;

import java.util.Scanner;

public class vt1 {
    public static void dealback(int [][]data){
        int len=data.length;
        for(int i=0;i<len;i++){
            int n=data[i][0];
            int k=data[i][1];
            long half=0;
            if(n==1){
                half=k-1;
            }
            if(n==2){
                half=k;
            }
            if(n>2){
                int temp=1;
                for(int t=0;t<(n-1)/2;t++){
                    temp=temp*10;
                }
                half=k+temp-1;
            }
            if(n>=2&&n%2==0){
                long d=half;
                while(d!=0){
                    long zz=d%10;
                    half=half*10+zz;
                    d=d/10;
                }

            }
            if(n>2&&n%2==1){
                long d=half/10;
                while(d!=0){
                    long zz=d%10;
                    half=half*10+zz;
                    d=d/10;
                }
            }
            System.out.println(half);
        }

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] data=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                data[i][j]=sc.nextInt();
            }
        }
        dealback(data);
    }
}
