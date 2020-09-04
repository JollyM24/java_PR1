package com.company;

import java.util.Random;
import static java.lang.Math.pow;

public class PR1 {
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
        
    }
}
