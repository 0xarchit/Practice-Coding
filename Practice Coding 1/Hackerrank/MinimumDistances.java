// https://www.hackerrank.com/challenges/minimum-distances/problem

package Hackerrank;

import java.util.*;
import java.io.*;

public class MinimumDistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        while(n-->0) a.add(sc.nextInt());
        System.out.println(minimumDistances(a));
    }

    static int minimumDistances(List<Integer> a){
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<a.size(); i++){
            if(map.containsKey(a.get(i))) min = Math.min(min, i - map.get(a.get(i)));
            map.put(a.get(i), i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}