// https://www.hackerrank.com/challenges/missing-numbers/problem

package Hackerrank;

import java.util.*;
import java.io.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int a = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        while(a-->0) arr.add(sc.nextInt());
        int b = sc.nextInt();
        List<Integer> brr = new ArrayList<>();
        while(b-->0) brr.add(sc.nextInt());
        System.out.println(missingNumbers(arr, brr));
    }

    static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr){
        int min = Collections.min(brr), max = Collections.max(brr);
        int[] frq = new int[max-min+1];
        for(int i : brr) frq[i-min]++;
        for(int i : arr) frq[i-min]--;

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<frq.length; i++) if(frq[i] != 0) res.add(i+min);
        return res;
    }
}