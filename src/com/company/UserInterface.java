package com.company;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

    public void menuText() {
        System.out.println();
        System.out.print("""
                1) ArrayList exercise
                2) Bog exercise
                3) Hvor tit skal græsset slås exercise
                4) Kvadrat exercise
                5) Proper case exercise
                6) Sortering exercise
                7) Søgning exercise
                0) Exit program
                
                Type in a number:\040""");
    }

    public void invalidInput() {
        System.out.println("Invalid input...");
    }

    public void printlnOutput(String text) {
        System.out.println(text);
    }

    public void printOutput(String text) {
        System.out.print(text);
    }

    public void jumpLine() {
        System.out.println();
    }

    public String stringInput() {
        return scanner.nextLine();
    }

    public int intInput() {
        int returnValue = scanner.nextInt();
        scanner.nextLine();
        return returnValue;
    }

    public double doubleInput() {
        double returnValue = scanner.nextDouble();
        scanner.nextLine();
        return returnValue;
    }




}
