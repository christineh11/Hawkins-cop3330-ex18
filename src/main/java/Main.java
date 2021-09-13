/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        String choice = input.next();

        System.out.println("Your choice: "+choice );

        System.out.println("Please enter the temperature in Fahrenheit: ");
        double temp = input.nextDouble();

        if(choice.equalsIgnoreCase("c"))
        {
            double celsius = (temp-32) * 5 / 9;
            System.out.println("The temperature in Celsius is: "+celsius);
        }

        if(choice.equalsIgnoreCase("f"))
        {
            double fahrenheit=(temp* 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is: "+fahrenheit);

        }
    }
}

