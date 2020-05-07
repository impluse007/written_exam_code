package com.webank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class wt1 {
    public static void calc(int n){
        BigInteger temp=new BigInteger("1");
        for(int i=n;i>=2;i--){
                temp=temp.multiply(new BigInteger(i+""));
            }

        String s = temp.toString();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='0'){
                System.out.println(s.charAt(i));
                return;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calc(n);
    }
}
