// A program that converts miles into kilometres
// input: distance in miles > output: distance in kilometres
import java.util.Scanner;
public class Converter {
    // --- fields ---
    private static double disInMiles;
    private static double disInKilometers;
    private static final double COEFFICIENT = 1.60935;
    // --- definition of the method main() ---
    public static void main(String[] args) {
        // Create a scanner that can numbers, or words
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the distance in miles: ");
        disInMiles = keyboard.nextDouble(); // input a number typed by a user
        // calculate the distance
        disInKilometers = disInMiles * COEFFICIENT;
        // output the result
        System.out.println(disInMiles + " miles is " + disInKilometers + " kilometres");
        keyboard.close();
    }
}
