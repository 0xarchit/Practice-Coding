package extra;

/*
input: 4 6
2 4 7 9
output: 0 1 <- indexes
 */

import java.util.*;

public class TargetSumSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        int n = sc.nextInt(), target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        int l = 0, r = n-1;
        boolean found = false;
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum > target) r--;
            else if(sum == target){
                found = true;
                break;
            }
            else l++;
        }
        if(found) System.out.print(l + " " + r);
        else System.out.println("-1, -1");
    }
}
