// https://www.hackerrank.com/challenges/arrays-ds/problem

package Hackerrank;

import java.util.*;
public class ArraysDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
    static void solve(Scanner sc){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
    }
}
/* Hackerrank solution

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    int i = 0, j = a.size()-1;
    while(i<j){
        int tmp = a.get(i);
        a.set(i++, a.get(j));
        a.set(j--, tmp);
    }
    return a;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

 */