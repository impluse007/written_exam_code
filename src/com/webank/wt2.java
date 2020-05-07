package com.webank;

import java.math.BigInteger;
import java.util.*;

public class wt2 {
    public static void calc(int n){
       int temp=1;
       for(int i=n;i>0;i--){
           temp=temp*i;
           temp=temp%1000003;
       }
       System.out.println(temp);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calc(n);
    }
}
