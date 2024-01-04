package org.example;

/*Napisz program, który pobiera hasło od użytkownika.
        Program powinien zapytać użytkownika o wprowadzenie poprawnego hasła.
        W przypadku gdy wprowadzone hasło będzie poprawne,
        program powinien wydrukować na ekranie tekst "Poprawne hasło",
        w przeciwnym wypadku, wprowadzone hasło powinno zostać wyświetlone na ekranie,
        a użytkownik powinien mieć możliwość ponownie wprowadzić hasło.*/

import java.util.Scanner;

public class Zad11_PsswordCheck {

    public void passwordCheck () {
        Scanner scanner = new Scanner(System.in);
        String password;
        String correctPassword = "secretpassword";

        while (true) {
            System.out.println("Podaj hasło:");
            password = scanner.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Poprawne hasło");
                break;
            } else {
                System.out.println(password);
                System.out.println("Niepoprawne hasło!");
            }

        }

    }

}
