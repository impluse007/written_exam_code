package com.tencent2;

import java.util.Scanner;

public class tt1 {
    public static String calc(String s,int len){
        if(len<11) return "NO";
        char[] temp=s.toCharArray();
        for(int i=len-1;i>=0;i--){
            if(temp[i]=='8'&&i<=len-11){
                return "YES";
            }
        }
        return "NO";

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=Integer.valueOf(sc.nextLine());
        int[] len1=new int[m];
        String[] s=new String[m];
        for(int i=0;i<m;i++){
            len1[i]=Integer.valueOf(sc.nextLine());
            s[i]=sc.nextLine();
        }
        for(int i=0;i<m;i++){
            System.out.println(calc(s[i],len1[i]));
        }
    }
}
