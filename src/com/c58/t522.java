package com.c58;


import java.util.Scanner;

public class t522 {
    private static int allocate(int []nums){
        if (nums == null || nums.length == 0) return -1;
        int[] candy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            candy[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && candy[i] <= candy[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]&& candy[i] <= candy[i + 1]) {
                candy[i] = candy[i + 1] + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < candy.length; i++) {
            sum += candy[i];
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int []candie=new int[m];
        for (int i = 0; i <m ; i++) {
            candie[i]=sc.nextInt();

        }
        System.out.println(allocate(candie));
    }
}
