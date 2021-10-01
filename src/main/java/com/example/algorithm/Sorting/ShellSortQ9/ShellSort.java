package com.example.algorithm.Sorting.ShellSortQ9;

public class ShellSort {
    static int cnt;

    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                    System.out.println("요소수 이동 횟수 : " + ++cnt);
                }
                a[j + h] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] x = {8, 1, 4, 2, 7, 6, 3, 5};

        System.out.println("----- 정렬 전-----");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        shellSort(x, x.length);
        System.out.println("----- 정렬 후 -----");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

    }
}
