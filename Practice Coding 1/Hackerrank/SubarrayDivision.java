// https://www.hackerrank.com/challenges/the-birthday-bar

package Hackerrank;

import java.util.*;
import java.io.*;

public class SubarrayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();
        while(n-->0) s.add(sc.nextInt());
        int d = sc.nextInt(), m = sc.nextInt();
        System.out.println(birthday(s, d, m));
    }

    static int birthday(List<Integer> s, int d, int m){
        int cnt = 0, sum = 0;
        for(int i = 0; i<m; i++) sum += s.get(i);
        if(sum == d) cnt++;
        for(int i = m; i<s.size(); i++){
            sum += s.get(i) - s.get(i-m);
            if(sum == d) cnt++;
        }
        return cnt;
    }
}