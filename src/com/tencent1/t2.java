package com.tencent1;
import java.util.*;

public class t2 {
    static int result = Integer.MAX_VALUE;

    private static void compute(List<Integer> rt, int[] a, int[] b) {
        int ntotal = 0;
        int n = rt.size();
        for (int i = 0; i < n; i++) {
            ntotal += i * a[rt.get(i)] + (n - i - 1) * b[rt.get(i)];
        }
        result = Math.min(result, ntotal);
    }

    private static void DFS(List<Integer> temp, int n, boolean[] visited, int[] a, int[] b) {
        if (temp.size() == n) {
            compute(temp, a, b);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            temp.add(i);
            DFS(temp, n, visited, a, b);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n], b = new  int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        boolean[] visited = new boolean[n];
        DFS(new ArrayList<>(n), n, visited, a, b);

        System.out.println(result);


    }
}