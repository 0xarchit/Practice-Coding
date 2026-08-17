// https://codeforces.com/problemset/problem/1430/C

package Codeforces;

import java.util.*;
import java.io.*;

public class NumbersOnWhiteboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int cur = n;
        System.out.println(2);
        for (int i = n - 1; i >= 1; i--) {
            System.out.println(cur + " " + i);
            cur = (cur + i + 1) / 2;
        }
    }
}