package org.example;

import java.util.Scanner;

public class Zad6_Password {
    public void yourPassword () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the password, please!");
        String yourPassword = scanner.nextLine();
        System.out.println("Your password is: " + yourPassword);
        String password = "secret";

        if (yourPassword.equals(password))  {
            System.out.println("Welcome to the new place!");
        } else {
            System.out.println("Password is incorrect!");
        };
    }
}
