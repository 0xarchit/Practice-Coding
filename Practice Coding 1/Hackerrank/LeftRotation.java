package Hackerrank;

import java.util.*;
import java.io.*;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt(), d = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        while(n-->0){
            lst.add(sc.nextInt());
        }
        System.out.println(rotateLeft(d, lst));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> lst = new ArrayList<>();
        int n = arr.size();
        lst.addAll(arr.subList(d, n));
        lst.addAll(arr.subList(0, d));
        return lst;
    }
}