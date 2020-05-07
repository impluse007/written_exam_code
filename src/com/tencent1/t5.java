package com.tencent1;
import java.util.Scanner;
public class t5 {
    public static int calcnum(int[] point,int n){
     return 1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] point=new int[n];
        for(int i=0;i<n;i++){
            point[i]=in.nextInt();

        }
        System.out.println(calcnum(point,n));
    }
}
