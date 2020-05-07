package com.tencent1;

import java.util.Scanner;

public class t3 {
    public static int calcnum(int n,int m,int[] box){
        int all=0;
        for(int i=0;i<n;i++){
            all+=box[i];
        }
        if(m>=all) return n+1;
        int time=1;
        int now=0;
        int res=0;
        for(int i=0;i<n;i++){
            box[i]=box[i]<=res?0:box[i]-res;
            now+=box[i];
            int over=now%m;
            if(over==0){
                time+=now/m;
            }
            else{
                time+=now/m;
                time+=1;
                res=m-now%m;
            }
        }
        return time;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] box=new int[n];
        for(int i=0;i<n;i++){
            box[i]=sc.nextInt();
        }
        System.out.println(calcnum(n,m,box));
    }
}
