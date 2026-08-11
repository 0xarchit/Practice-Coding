// https://codeforces.com/problemset/problem/791/A

package Codeforces;
import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        long a = sc.nextLong(), b = sc.nextLong();
        int year = 0;
        while(a<=b){
            a*=3;
            b*=2;
            year++;
        }
        System.out.println(year == 0 ? 1 : year);
    }
}
