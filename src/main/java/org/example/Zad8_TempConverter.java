package org.example;

import java.util.Scanner;

public class Zad8_TempConverter {

    Scanner scanner = new Scanner(System.in);

    public static double intTemp () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the temperature");
        double temp = scanner.nextDouble();
        return temp;
    }
    public void fromCtoF() {
        double tempF = 1.8 * intTemp() + 32;
        System.out.println("C to F is " + tempF + " F");
    }

    public void fromFtoC() {
        double tempC = (intTemp() - 32)/1.8;
        System.out.println(" C to F is " + tempC + " F");
    }

}
