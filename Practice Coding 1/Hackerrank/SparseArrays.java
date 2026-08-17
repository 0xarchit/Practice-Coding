// https://www.hackerrank.com/challenges/sparse-arrays/problem

package Hackerrank;

import java.util.*;
import java.io.*;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<String> stringList = new ArrayList<>();
        while(n-->0) stringList.add(sc.next());
        n = sc.nextInt();
        List<String> queries = new ArrayList<>();
        while(n-->0) queries.add(sc.next());
        System.out.println(sparseArrays(stringList, queries));
    }
    static List<Integer> sparseArrays(List<String> stringList, List<String> queries){
        List<Integer> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : stringList) map.put(str, map.getOrDefault(str, 0)+1);
        for(String str : queries) res.add(map.getOrDefault(str, 0));
        return res;
    }
}