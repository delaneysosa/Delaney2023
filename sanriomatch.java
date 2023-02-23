import java.util.Scanner;

public class SanrioMatch {
    public static void SanrioMatch(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sanrio Character Matcher!");
        System.out.println("Please answer the following questions to determine your Sanrio character match.");

        System.out.println("Are you a cheerful and optimistic person? (yes or no)");
        String answer1 = input.nextLine();

        System.out.println("Do you enjoy spending time with friends and family? (yes or no)");
        String answer2 = input.nextLine();

        System.out.println("Do you have a love for fashion and beauty? (yes or no)");
        String answer3 = input.nextLine();

        System.out.println("Are you confident and independent? (yes or no)");
        String answer4 = input.nextLine();

        System.out.println("Do you have a love for adventure and excitement? (yes or no)");
        String answer5 = input.nextLine();

        System.out.println("Do you have a mischievous side? (yes or no)");
        String answer6 = input.nextLine();

        if (answer1.equalsIgnoreCase("yes") && answer2.equalsIgnoreCase("yes")) {
            System.out.println("Your Sanrio character match is Hello Kitty!");
        } else if (answer3.equalsIgnoreCase("yes") && answer4.equalsIgnoreCase("yes")) {
            System.out.println("Your Sanrio character match is Little Twin Stars!");
        } else if (answer4.equalsIgnoreCase("yes") && answer5.equalsIgnoreCase("yes")) {
            System.out.println("Your Sanrio character match is My Melody!");
        } else if (answer6.equalsIgnoreCase("yes")) {
            System.out.println("Your Sanrio character match is Kuromi!");
        } else {
            System.out.println("Your Sanrio character match is Cinnamoroll!");
        }
    }
}
