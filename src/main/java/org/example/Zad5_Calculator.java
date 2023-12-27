package org.example;

import java.util.Scanner;

public class Zad5_Calculator {
    public void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the 1st number?");
        int a = scanner.nextInt();
        System.out.println("What is the 2nd number?");
        int b = scanner.nextInt();

        int sum = a+b;
        int dif = a-b;
        int dev = a/b;
        int mn = a*b;
        int pot = (int) Math.pow(a,b);
        System.out.println("Wynik dodawania a + b to: " + sum);
        System.out.println("Wynik a - b to: " + dif);
        System.out.println("Wynik a / b to: " + dev);
        System.out.println("Wynik a * b to: " + mn);
        System.out.println("Wynik a ^ b to: " + pot);

    }
}
