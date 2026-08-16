// https://codeforces.com/problemset/problem/381/A

package Codeforces;

import java.util.*;
import java.io.*;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0, d = 0;
        boolean turn = true;

        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        int l = 0, r = n-1;
        while(l<=r){
            if(turn){
                if(arr[l] >= arr[r]) s += arr[l++];
                else s += arr[r--];
            } else{
                if(arr[l] >= arr[r]) d += arr[l++];
                else d += arr[r--];
            }
            turn = !turn;
        }
        System.out.println(s + " " + d);
    }
}