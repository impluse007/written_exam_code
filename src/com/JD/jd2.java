package com.JD;

import java.util.Scanner;

public class jd2 {
    public static void dealrela(int [][]rela,int []record,int n,int m){
        int res=0;
        for(int i=0;i<m;i++){
            if(record[i]>0){
                res++;
            }
        }
        System.out.println(res);
        for(int i=0;i<m;i++){
            if(record[i]>0){
                System.out.print(i+1);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] rela=new int[m][2];
        int [] record=new int[2*m];
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                rela[i][j]=sc.nextInt();
                record[rela[i][j]-1]++;
            }
        }
        dealrela(rela,record,n,m);
    }
}
