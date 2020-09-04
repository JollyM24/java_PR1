package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[7];
        int s=0;
        Random random = new Random();
        for (int i = 0; i < 7; i++){
            a[i] = random.nextInt(20);
            System.out.println("a[" + i +"] = " + a[i]);
            s+=a[i];
        };
        System.out.println("s = " + s);
    }
}
