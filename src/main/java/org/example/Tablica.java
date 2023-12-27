package org.example;

public class Tablica {


    public void example() {
        String[] planety = new String[8];

        planety[0] = "Merkury";
        planety[1] = "Saturn";

        String planeta1 = planety[0];
        System.out.println(planety[0]);
        System.out.println(planeta1);

        for (String p : planety
             ) {
            if (p != null) System.out.println(p);
        }
    }






}
