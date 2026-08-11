// https://codeforces.com/problemset/problem/263/A

package Codeforces;


import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc){
        int[][] mat = new int[5][5];
        int x = 0, y = 0;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(Math.abs(2-x) + Math.abs(2-y));
    }
}
