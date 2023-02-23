/*

package com.delaneym.colorseason;

/**
 *
 * @author delan
 */

import java.util.Scanner;
public class ColorSeason {

    public static void main(String[] args) {
      


    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Color Season Analysis!");
    System.out.println("Answer the following questions to determine your color season.");
    System.out.println();
    
    // First question
    System.out.print("1) Do you have a warm or cool skin tone? (Enter warm or cool): ");
    String skinTone = input.nextLine();
    System.out.println();
    
    // Second question
    System.out.print("2) Do you have a light or dark hair color? (Enter light or dark): ");
    String hairColor = input.nextLine();
    System.out.println();
    
    // Third question
    System.out.print("3) Do your eyes look better in gold or silver jewelry? This is not your personal preference, but rather what compliments your eye color the best. (Enter gold or silver): ");
    String eyeColor = input.nextLine();
    System.out.println();
    
    // Determine the color season
    String colorSeason = "";
    if (skinTone.equals("warm") && hairColor.equals("light") && eyeColor.equals("gold")) {
      colorSeason = "Spring";
    } else if (skinTone.equals("warm") && hairColor.equals("dark") && eyeColor.equals("gold")) {
      colorSeason = "Autumn";
    } else if (skinTone.equals("cool") && hairColor.equals("light") && eyeColor.equals("silver")) {
      colorSeason = "Winter";
    } else if (skinTone.equals("cool") && hairColor.equals("dark") && eyeColor.equals("silver")) {
      colorSeason = "Summer";
    } else {
      colorSeason = "Invalid Input. Please enter either 'warm' or 'cool' for skin tone, 'light' or 'dark' for hair color, and 'gold' or 'silver' for eye color.";
    }
    
   
    // Output the result
System.out.println("Based on your answers, your color season is: " + colorSeason);

}}
