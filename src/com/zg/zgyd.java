package com.zg;

import java.util.Scanner;

public class zgyd {
    public static int profit(int num){
        double res=0;
        if(num<=100000)
             res=num*0.1;
        else if(num<=200000)
             res=10000+(num-100000)*0.075;
        else if(num<=400000)
             res=17500+(num-200000)*0.05;
        else if(num<=600000)
             res=20000+(num-400000)*0.03;
        else if(num<=1000000)
             res=30000+(num-600000)*0.015;
        else
             res=50000+(num-1000000)*0.01;
        return (new Double(res).intValue());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(profit(a));
    }
}
