package org.example;

/*
Napisz program, który dokona konwersji temperatury wprowadzonej przez użytkownika:

        ze skali Celsjusza na skalę Fahrenheit'a (stopnie w F = 1.8 * stopnie w C + 32)
        ze skali Fahrenheit'a na skalę Celsjusza (stopnie w C = (stopnie w F - 32 / 1.8))
        ze skali Celsjusza na skalę Kelvin'a (stopnie w K = stopnie w C + 273.15)
        ze skali Kelvin'a na skalę Celsjusza (stopnie w C = stopnie w K - 273.15)
        ze skali Kelvin'a na skalę Fahrenheit'a (stopnie w F = (stopnie w K - 273.15) * 1.8 + 32)
        ze skali Fahrenheit'a na skalę Kelvin'a (stopnie w K = ((stopnie w F - 32/1.8) + 273.15)
        Każdą z operacji konwersji temperatury, napisz w osobnej metodzie, którą następnie wywołasz w metodzie main.
*/

import java.util.Scanner;

public class Zad8_TempConverter {

    public void intTemp () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the temperature");
        double temp = scanner.nextDouble();

        double fromCtoF = 1.8 * temp + 32;
        System.out.println("C to F is " + fromCtoF + " F");

        double fromFtoC = (temp - 32)/1.8;
        System.out.println("F to C is " + fromFtoC + " F");

        double fromCtoK = temp + 273.15;
        System.out.println("C to K is " + fromCtoK + " K");

        double fromKtoC = temp - 273.15;
        System.out.println("K to C is " + fromKtoC + " C");

        double fromKtoF = 1.8 * (temp - 273.15) + 32;
        System.out.println("K to F is " + fromKtoF + " F");

        double fromFtoK = (temp - 32/1.8) + 273.15;
        System.out.println("F to K is " + fromFtoK + " K");

    }



}
