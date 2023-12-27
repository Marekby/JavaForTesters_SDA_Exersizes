package org.example;

import java.util.Scanner;

public class Zad7_JohnWick {
    public void welcomeName () {
        String rightName = "John Wick";
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String yourName = scanner.nextLine();
        System.out.println("Your name is " + yourName);
        if (yourName.equals(rightName)) {
            System.out.println("I see that you are working again John");
        } else {
            System.out.println("Nice to meet you " + yourName);
        }


    }
}
