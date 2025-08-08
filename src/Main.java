/*
       THIS IS FIRST MINI PRACTICE MINI PROJECT
       THIS GAME IS CALLED MAD LIBS
       AND I MADE IT TO PRACTICE USER INPUTS
       STORY VERSION 2: THE MYSTERIOUS FOREST
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Colours
        final String YELLOW = "\u001B[33m";
        final String RESET = "\u001B[0m";

        // Variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // User Inputs
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal / person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter one more adjective (description): ");
        adjective3 = scanner.nextLine();

        // Story

        System.out.println("\nLast night, I wandered into a " + adjective1 + " forest.");
        System.out.println("Suddenly, a " + noun1 + " appeared out of nowhere!");
        System.out.println("It looked " + adjective2 + " and was " + verb1 + " through the trees.");
        System.out.println("I felt so " + adjective3 + ", I ran all the way home!");

        // Credit in yellow
        System.out.println("\n" + YELLOW + "Made by CodingNORVIN" + RESET);

        scanner.close();
    }
}
/*
       THIS IS FIRST MINI PRACTICE MINI PROJECT
       THIS GAME IS CALLED MAD LIBS
       AND I MADE IT TO PRACTICE USER INPUTS
       STORY VERSION 2: THE MYSTERIOUS FOREST
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Colours
        final String YELLOW = "\u001B[33m";
        final String RESET = "\u001B[0m";

        // Variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // User Inputs
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (animal / person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter another adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter one more adjective (description): ");
        adjective3 = scanner.nextLine();

        // Story

        System.out.println("\nLast night, I wandered into a " + adjective1 + " forest.");
        System.out.println("Suddenly, a " + noun1 + " appeared out of nowhere!");
        System.out.println("It looked " + adjective2 + " and was " + verb1 + " through the trees.");
        System.out.println("I felt so " + adjective3 + ", I ran all the way home!");

        // Credit in yellow
        System.out.println("\n" + YELLOW + "Made by CodingNORVIN" + RESET);

        scanner.close();
    }
}
