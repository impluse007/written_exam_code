package com.c58;

import java.util.*;
import java.util.Scanner;

public class t51 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String temp=sc.next();
        String[] ori=temp.split(",");
        Set<String> t=new HashSet<>();
        for(String s:ori){
            t.add(s);
        }
        System.out.println(t.size());
    }
}
