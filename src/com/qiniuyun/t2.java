package com.qiniuyun;

import java.util.*;

public class t2 {
    public static int kuohao(String s){
        char[] temp=s.toCharArray();
        Stack<Character> t=new Stack<>();
        int i=0;
        while(i<temp.length){
            if(temp[i]=='('||temp[i]=='['||temp[i]=='<'||temp[i]=='{')
                t.push(temp[i]);
            else if ((t.peek() == '(' && temp[i] == ')') || (t.peek() == '[' && temp[i] == ']') || (t.peek() == '<' && temp[i] == '>') || (t.peek() == '{' && temp[i] == '}')) {
                    t.pop();
                }
            else{
                t.push(temp[i]);
            }
            i++;
        }
        return t.isEmpty()?1:0;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(kuohao(s));

    }
}
