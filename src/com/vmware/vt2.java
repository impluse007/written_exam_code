package com.vmware;

import java.util.*;

public class vt2 {
    public static void calcmin(int[][] data){
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int sum=0,index=0;
       for(int i=data.length-1;i>=0;i--){
           sum+=data[i][0];
           if(sum>=i)
           {
               index=i;
               break;
           }
       }
       int res=0;
       for(int i=data.length-1;i>=index;i--){
           res+=data[i][1];
       }
       System.out.print(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        calcmin(data);
    }
}
