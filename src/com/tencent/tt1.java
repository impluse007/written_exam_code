package com.tencent;

import java.util.Scanner;
public class tt1 {

    private static String Strcore(String s) {
        if (s == null || s.length() == 0) return "";
        int index=s.indexOf((int) '[');

        while (index!=-1) {
            int gap = s.indexOf((int) '|');
            int times = Integer.valueOf(s.substring(index + 1, gap));
            int len = 1;
            for (int i = index + 1; i < s.length(); i++) {
                if (s.charAt(i) =='[') len++;
                if (s.charAt(i) ==']') {
                    len--;
                    if (len == 0) {
                        String subs = s.substring(gap + 1, i);
                        StringBuilder temp = new StringBuilder();
                        for (int j = 0; j < times; j++) temp.append(subs);
                        s = s.substring(0, index) + temp.toString() + s.substring(i + 1);
                        break;
                    } } }
            index=s.indexOf((int) '[');
        }

        return s;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String res=Strcore(str);
        System.out.println(res);
    }
}
