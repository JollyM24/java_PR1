package com.company;

import java.util.Random;
import static java.lang.Math.pow;

public class PR1 {
    public static void selSort(int[] ar){
        for (int i=0; i < ar.length-1; i++){
            int min = i;
            for (int j = i+1; j<ar.length;j++) {
                if (ar[j] < ar[min]) min = j; };
                if (i!=min) {
                    int t = ar[i];
                    ar[i] = ar[min];
                    ar[min] = t;
                };
            }
        }

    public static int fac(int n) {
        int res = 1;
        for (int i=1; i<=n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        
       ///////////////// task 1 //////////////////
        System.out.println("  Задание 1");
        int[] a = new int[7];
        int s = 0;
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            a[i] = random.nextInt(20);
            System.out.println("a[" + i + "] = " + a[i]);
            s += a[i];
        }
        System.out.println("s = " + s);

        ///////////////// task 2 //////////////////
        System.out.println("  Задание 2");
        for (String str : args) System.out.println(str);

        ///////////////// task 3 //////////////////
        System.out.println("  Задание 3");
        int k = 11, p = 2;
        double[] array = new double[k];
        for (int i = 1; i < k; i++) {
            array[i] = 1 / (pow(i, p));
            System.out.printf("%.3f", array[i]);
            System.out.print("  ");
        }

        ///////////////// task 4 //////////////////
        System.out.println("\n  Задание 4");
        Random random2 = new Random();
        int[] array2 = new int[10];
        System.out.println("Массив целых чисел, сгенерируемый случайным образом:");
        for (int ab=0; ab<array2.length; ab++) {
            array2[ab] = random.nextInt(20);
            System.out.print("  " + array2[ab]);
        }
        selSort(array2);
        System.out.println("\nОтсортированный массив:");
        for (int ab=0; ab<array2.length; ab++) {
            System.out.print("  " + array2[ab]);
        }

        ///////////////// task 5 //////////////////
        System.out.println("\n  Задание 5");
        int n = random.nextInt(10);
        System.out.println("Факториал числа " + n + "! = " + fac(n));
    }
}
