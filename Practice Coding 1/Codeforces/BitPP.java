// https://codeforces.com/problemset/problem/282/A

package Codeforces;

import java.util.*;

public class BitPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        int n = sc.nextInt();
        int x = 0;

        while(n-->0){
            String str = sc.next();
            if(str.equals("++X") || str.equals("X++")) x++;
            else x--;
        }
        System.out.println(x);
    }
}
