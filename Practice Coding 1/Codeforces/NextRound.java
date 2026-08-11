// https://codeforces.com/problemset/problem/158/A

package Codeforces;

import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
        int target = arr[k-1];

        int cnt = 0;
        for(int i : arr){
            if(i>=target && i>0) cnt++;
            else break;
        }

        System.out.println(cnt);
    }
}
