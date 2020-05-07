package com.mihayo_1;

import java.util.Scanner;

public class t2 {
    public static String FindMaxString(String s){
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '-') {
                int st = s.charAt(i - 1);
                int end = s.charAt(i + 1);
                String temps = "";
                for (int p = st; p < end; p++) {
                    if (p > 'Z' && p < 'a') continue;
                    temps += (char) p;
                }
                s=s.substring(0,i-1)+temps+s.substring(i+1,s.length());
            }
        }
        //System.out.println(s);
        char[] temp=s.toCharArray();
        int n=temp.length;
        String res="";
        int[] gap=new int[n];
        for(int i=0;i<n;i++){
            if(temp[i]<='9'&&temp[i]>'0')
                gap[i]=1;

        }
        for(int i=1;i<n;i++){
            if(gap[i]==1){
                int index=i-1;
               while(index>0&&gap[index-1]!=1)
               {
                   index--;
               }
               int t=temp[i]-'0';
               for(int m=0;m<t;m++){
                   res+=s.substring(index,i);
               }
            }
        }
        int[] count=new int[130];
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)>=97)
            {
                count[res.charAt(i)]++;
            }
            else{
                count[res.charAt(i)+32]++;
            }
        }
        int max=0,index=0;
        for(int p=97;p<130;p++){
            if(count[p]>max){
                max=count[p];
                index=p;
            }
        }

        return ((char)index)+""+count[index];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(FindMaxString(s));
    }
}
