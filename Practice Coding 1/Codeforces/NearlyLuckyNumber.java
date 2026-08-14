// https://codeforces.com/problemset/problem/110/A

package Codeforces;

import java.util.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        long n = sc.nextLong();
        int cnt = 0;
        while(n>0){
            long dig = n%10;
            if(dig == 7 || dig == 4) cnt++;
            n /= 10;
        }
        System.out.println(cnt == 4 || cnt == 7 ? "YES" : "NO");
    }
}