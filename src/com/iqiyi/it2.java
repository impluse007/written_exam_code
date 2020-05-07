package com.iqiyi;

import java.util.Scanner;

public class it2 {
    public static void winrate(int red,int blue){
        int all=red+blue;
        double winrate=(double)red/(double)all;
        while(all>3){
            all=all-3;

        }
        System.out.println(String.format("%.5f",winrate));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int red=sc.nextInt();
        int blue=sc.nextInt();
        winrate(red,blue);

    }
}
