package extra;

import java.util.*;

public class MaxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            } else if (arr[i]>secMax) {
                secMax = arr[i];
            }
        }
        System.out.printf("Max value is %d and min is %d", max, secMax);
    }
}
