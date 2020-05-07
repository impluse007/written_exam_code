package com.kuaishou;

import java.util.*;

public class kt2 {
    public static final String[] key={"","abc","def","ghl","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> deal(String nb){
        List<String> res=new ArrayList<String>();
        if(nb==null||nb.length()==0)
            return res;
        comb("",nb,0,res);
        return res;

    }
    public static void comb(String now,String nb,int len,List<String> res){
        if(len>=nb.length()){
            res.add(now);
            return;
        }
        String nowl=key[nb.charAt(len)-'0'-1];
        for(int i=0;i<nowl.length();i++){
            comb(now+nowl.charAt(i),nb,len+1,res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<String> res=deal(n);
        System.out.print("[");
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
            if(i!=res.size()-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }

}
