package com.xiaomi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class t1 {


    public static class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static void solution(String input) {
        TreeNode tree=makeTree(input);
        bianli(tree);
    }


    private static TreeNode makeTree(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }


        TreeNode treeNode = new TreeNode(string.charAt(0) - '0');
    if (string.length() == 1 || string.charAt(1) == ',') {
        return treeNode;
    } else {
        int[] levels = new int[string.length()];
        Arrays.fill(levels, -1);

        int mid = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ',') {
                continue;
            }
            levels[i] = 0;
            for (int j = 0; j < i; j++) {
                if (string.charAt(j) == '(') {
                    levels[i]++;
                } else if (string.charAt(j) == ')') {
                    levels[i]--;
                }
            }

            if (levels[i] == 1) {
                mid = i;
                break;
            }
        }


        treeNode.left = makeTree(string.substring(2, mid));
        treeNode.right = makeTree(string.substring(mid + 1, string.length() - 1));
    }

    return treeNode;
}
    static void bianli(TreeNode tree){
        if(tree==null) return;
        bianli(tree.left);
        System.out.print(tree.val);
        bianli(tree.right);

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }

        solution(_input);
    }
}
