package com.xiaomi;

import java.util.*;

public class t2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solution(int[] prices, int budget) {
            Arrays.sort(prices);
            int[][] res = new int[prices.length + 1][budget + 1];
            int len=prices.length;
            for(int i = 0; i <= len; i++)
                res[i][0] = 0;
            for(int i = 0; i <= budget; i++)
            {
                res[0][i] = Integer.MAX_VALUE;
            }
            for(int i = 1; i <=budget; i++)
            {
                for(int j = 1; j <= len; j++)
                {
                    if(i < prices[j-1])
                    {
                        res[j][i] = res[j - 1][i];
                        continue;
                    }
                    if(res[j - 1][i] < (res[j][i - prices[j-1]] + 1))
                        res[j][i] = res[j - 1][i];
                    else
                        res[j][i] = res[j][i - prices[j-1]] +1;
                }
            }
            return res[len][budget]<0?-1:res[len][budget];



    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _prices_size = 0;
        _prices_size = Integer.parseInt(in.nextLine().trim());
        int[] _prices = new int[_prices_size];
        int _prices_item;
        for(int _prices_i = 0; _prices_i < _prices_size; _prices_i++) {
            _prices_item = Integer.parseInt(in.nextLine().trim());
            _prices[_prices_i] = _prices_item;
        }

        int _budget;
        _budget = Integer.parseInt(in.nextLine().trim());

        res = solution(_prices, _budget);
        System.out.println(String.valueOf(res));

    }
}
