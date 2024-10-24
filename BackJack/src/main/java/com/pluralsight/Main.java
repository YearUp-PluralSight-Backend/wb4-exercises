package com.pluralsight;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int nextInt = random.nextInt(1, 27);

        System.out.println(nextInt);
    }
}