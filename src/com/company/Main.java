package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] k = new int[Integer.MAX_VALUE];
        for(int i =0; i < n;i++){
            k[in.nextInt()]++;
        }
        int max = -1;
        for(int i = 0; i < Integer.MAX_VALUE;i++){
            if(max < k[i]) max = k[i];
        }
        System.out.println(max);
    }
}
