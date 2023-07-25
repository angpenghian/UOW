import static java.lang.System.*; // import all members of the class System
import java.util.Scanner; // import the class Scanner

public class Converter_v2 {
    public static void main(String[] args) {
        double distInMiles, disInKilometres; // local variables
        final double COEFFICIENT = 1.60935; // a local constant

        Scanner input = new Scanner(in);
        out.print("Enter the distance in miles: ");
        distInMiles = input.nextDouble(); // input the typed number

        disInKilometres = distInMiles * COEFFICIENT;
        // formatted output
        out.printf("%.1f miles is %.1f kilometres\n", distInMiles, disInKilometres);
        input.close();
    }
}
