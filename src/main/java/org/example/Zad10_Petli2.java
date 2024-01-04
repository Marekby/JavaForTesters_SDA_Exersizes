package org.example;

/*Zmodyfikuj kod z poprzedniego zadania,
        w taki sposób, aby użytkownik samodzielnie podawał ilość wyświetlonych komunikatów.*/

import java.util.Scanner;

public class Zad10_Petli2 {
    public void loop () {
        System.out.println("Ile komunikatów wyświetlić?");
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();

        for (int i = 0; i < times ; i++) {
            System.out.println("To jest " + i + " komunikat w petli");

        }

    }
}
