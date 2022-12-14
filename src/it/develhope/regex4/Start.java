package it.develhope.regex4;

public class Start {

    public static void main(String[] args) {

        String z = "x3z ? xYz ! R1 && __";

        String n = z.replaceAll("[0-9,a-z]", "*");

        System.out.println(n);
    }
}
