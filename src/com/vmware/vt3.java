package com.vmware;

import java.util.Scanner;

public class vt3 {
    public static int  dealnums(int a,int b,int k){
        if(k==1) return b-a+1;
        if(k==2){
            int tres=0;
            for(int t=a;t<=b;t++){
                if(t%2==0)
                    tres++;
            }
            return tres;
        }
        if(isprime(k)==false)
            return 0;
        int st=a/k;
        int end=b/k;
        int res=0;
        for(int i=st;i<=end;i++){
            if(isprime(i)&&i>=k){
                if(i*k>=a||i*k<=b)
                    res++;
            }
        }
        return res;

    }
    public static boolean isprime(int x){
        boolean flag=true;
        for(int i=2;i<=x/2;i++){
            if(x%i==0)
                return false;
        }
        return flag;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(dealnums(a,b,k));
    }
}
