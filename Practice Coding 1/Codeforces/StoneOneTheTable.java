// https://codeforces.com/problemset/problem/266/A

package Codeforces;

import java.util.*;

public class StoneOneTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc){
        int n = sc.nextInt(), pick = 0;
        String str = sc.next();

        for(int i = 1; i<n; i++){
            char prv = str.charAt(i-1);
            if(str.charAt(i) == prv) pick++;
        }
        System.out.println(pick);
    }
}
