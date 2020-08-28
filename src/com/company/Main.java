package com.company;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {


        ArrayList<String> jokes = new ArrayList<>();
        jokes.add("Laissez fair");
        jokes.add("Konstitutionelt monarki");
        jokes.add("Absolut monarki");
        jokes.add("Hvad er sjovere end 24? 25");

        Scanner scan = new Scanner(System.in);
        System.out.println("Press enter to get a joke");
        String input = scan.nextLine();

        while(input.equals("")){

            double j = jokes.size() * Math.random();
            int jok = (int)j;

            System.out.println(jokes.get(jok));
            System.out.println("Press enter again to get a new joke");
            input = scan.nextLine();
        }

    }
}