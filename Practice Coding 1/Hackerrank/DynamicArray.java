// https://www.hackerrank.com/challenges/dynamic-array/problem

package Hackerrank;

import java.util.*;
import java.io.*;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt(), q = sc.nextInt();
        List<List<Integer>> queries = new ArrayList<>();

        while(q-->0){
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0; i<3; i++) tmp.add(sc.nextInt());
            queries.add(tmp);
        }

        System.out.println(dynamicArray(n, queries));
    }
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries){
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i<n; i++) arr.add(new ArrayList<>());

        int lastAns = 0;
        List<Integer> res = new ArrayList<>();

        for(List<Integer> query : queries){
            int type = query.get(0), x = query.get(1), y = query.get(2);
            int idx = (x^lastAns)%n;

            if(type == 1) arr.get(idx).add(y);
            else{
                lastAns = arr.get(idx).get(y% arr.get(idx).size());
                res.add(lastAns);
            }
        }
        return res;
    }
}