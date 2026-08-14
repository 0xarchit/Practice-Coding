// https://codeforces.com/problemset/problem/977/A

package Codeforces;
import java.util.*;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        int n = sc.nextInt(), k = sc.nextInt();
        while(k-->0){
            if(n%10 != 0) n--;
            else n /= 10;
        }
        System.out.println(n);
    }
}
