// https://codeforces.com/problemset/problem/546/A

package Codeforces;

import java.util.*;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();
        int cost = k * w*(w+1)/2;
        System.out.println(Math.max(0, cost-n));
    }
}
