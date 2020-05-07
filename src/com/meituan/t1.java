package com.meituan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class t1 {
    public static int calcScore(int[][] score,int n,int m){
        Set<Integer> index=new HashSet<>();
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(score[j][i],max);
            }
            for(int j=0;j<n;j++){
                if(score[j][i]==max){
                    index.add(j);
                }
            }
        }
        return index.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] score=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               score[i][j]=sc.nextInt();
            }
        }
        int res=calcScore(score,n,m);
        System.out.println(res);

    }
}
