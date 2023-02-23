package com.delaneym.kibbebody;



import java.util.Scanner;


public class KibbeBody {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to the Kibbe Body Type Test!");
    System.out.println("Answer the following questions to determine your body type:");

    System.out.print("Do you have a prominent jawline and cheekbones? (y/n): ");
    
    
    String prominentFace = scan.nextLine();

    System.out.print("Are your bones delicate and fine? (y/n): ");
    String delicateBones = scan.nextLine();

    System.out.print("Is your hair fine and soft? (y/n): ");
    String fineHair = scan.nextLine();

    System.out.print("Do you have a rounded and fleshy physique? (y/n): ");
    String roundedPhysique = scan.nextLine();

    System.out.print("Do you have a delicate and soft overall appearance? (y/n): ");
    String delicateAppearance = scan.nextLine();

    if (prominentFace.equals("y") && delicateBones.equals("y") && fineHair.equals("y") && roundedPhysique.equals("y") && delicateAppearance.equals("y")) {
      System.out.println("You have a Soft Classic Body Type.");
    } else if (prominentFace.equals("n") && delicateBones.equals("y") && fineHair.equals("y") && roundedPhysique.equals("y") && delicateAppearance.equals("y")) {
      System.out.println("You have a Soft Romantic Body Type.");
    } else if (prominentFace.equals("y") && delicateBones.equals("y") && fineHair.equals("n") && roundedPhysique.equals("n") && delicateAppearance.equals("n")) {
      System.out.println("You have a Classic Body Type.");
    } else if (prominentFace.equals("n") && delicateBones.equals("n") && fineHair.equals("n") && roundedPhysique.equals("n") && delicateAppearance.equals("n")) {
      System.out.println("You have a Dramatic Body Type.");
    } else if (prominentFace.equals("n") && delicateBones.equals("n") && fineHair.equals("y") && roundedPhysique.equals("y") && delicateAppearance.equals("y")) {
      System.out.println("You have a Natural Body Type.");
    } else if (prominentFace.equals("y") && delicateBones.equals("n") && fineHair.equals("n") && roundedPhysique.equals("y") && delicateAppearance.equals("y")) {
      System.out.println("You have a Gamine Body Type.");
    } else {
      System.out.println("Could not determine your body type. Please try again.");
    }
  }
}
