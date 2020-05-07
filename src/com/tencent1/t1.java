package com.tencent1;
import java.util.*;

public class t1 {
    public static int calcnum(int[] b,int[] k,int n,int m)
    {
        int bo=0,be=0,ko=0,ke=0;
        for(int i=0;i<n;i++){
            if(b[i]%2==0){
                bo++;
            }
            else{
                be++;
            }
        }
        for(int i=0;i<m;i++){
            if(k[i]%2==0){
                ko++;
            }
            else{
                ke++;
            }
        }
        return Math.min(bo,ke)+Math.min(be,ko);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] b=new int[n];
        int[] k=new int[m];
        for(int i=0;i<n;i++){
            b[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            k[i]=in.nextInt();
        }
        System.out.println(calcnum(b,k,n,m));
    }
}
