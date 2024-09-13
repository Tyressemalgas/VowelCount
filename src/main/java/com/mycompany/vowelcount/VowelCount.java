/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;

/**
 *
 * @author User
 */


import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a sentence
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Call the function to count vowels and display the result
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }
    
    // Function to count the number of vowels in a given string
    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase
        sentence = sentence.toLowerCase();
        
        // String containing all vowels for easy comparison
        String vowels = "aeiou";
        
        int count = 0;
        
        // Iterate through the sentence character by character
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            // Check if the current character is a vowel using indexOf()
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
        }
        
        return count;
    }
}
