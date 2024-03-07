/*EXP-8 Write a java program to accept a string from user and display number of vowels, 
consonants, digits and special characters present in each of the words of the 
given text */

import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        analyzeString(input);

        scanner.close();
    }

    private static void analyzeString(String input) {
        String[] words = input.split("\\s+");

        for (String word : words) {
            int vowels = 0, consonants = 0, digits = 0, specials = 0;

            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    ch = Character.toLowerCase(ch);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else {
                    specials++;
                }
            }

            System.out.println("Word: " + word);
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Special Characters: " + specials);
            System.out.println();
        }
    }
}
