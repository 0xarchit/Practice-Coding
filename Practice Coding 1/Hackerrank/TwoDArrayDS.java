// https://www.hackerrank.com/challenges/2d-array/problem

package Hackerrank;
import java.util.*;

public class TwoDArrayDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        List<List<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int n = sc.nextInt();
                tmp.add(n);
            }
            lst.add(tmp);
        }
        System.out.println(hourglassSum(lst));
    }
    public static int hourglassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<=3; i++){
            for(int j = 0; j<=3; j++){
                sum = arr.get(i).get(j) + arr.get(i).get(j+1)+ arr.get(i).get(j+2)+
                        arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j)+ arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                max = Math.max(max, sum);
            }
        }
        return max;
    }
}


