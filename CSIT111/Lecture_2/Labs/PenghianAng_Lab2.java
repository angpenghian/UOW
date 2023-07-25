// Name: PengHian Ang
// Tutorial: T02P
// Java version: 17.0.7, 64 bit
//
// Objective: Write a Java program to implement the encryption and the decryption
// Name of the program: Penghian_Ang_Lab2.java
// Declaration: This is my own program

import java.util.Scanner;
import static java.lang.System.out;

public class PenghianAng_Lab2 {
    public static void main(String[] args) {
        // Declare and initialise variables
        Scanner scanner = new Scanner(System.in);
        String CipherService = "";

        // Ask user if they want to encrypt or decrypt
        while (true) {
            out.print("Do you want to encrypt or decrypt?\n1. Encrypt\n2. Decrypt\nEnter (1/2): ");
            String userInput_EncryptOrDecrypt = scanner.nextLine();

            if (userInput_EncryptOrDecrypt.equals("1") || userInput_EncryptOrDecrypt.equals("2")) {
                if (userInput_EncryptOrDecrypt.equals("1")) {
                    out.println("\nYou choosen Encrypt\n");
                    CipherService = userInput_EncryptOrDecrypt;
                } else {
                    out.println("\nYou choosen Decrypt\n");
                    CipherService = userInput_EncryptOrDecrypt;
                }
                break;
            } else {
                out.println("\nInvalid input. Please enter (1/2).");
            }
        }

        // Validate user input if it's an integer or not and also if it's between 1000 and 9999
        int number = 0;
        boolean valid = false;

        // Input validation
        while (!valid) {
            out.print("Enter a 4-digit integer to be encrypted: ");

            String userInput = scanner.nextLine();

            if (userInput.matches("\\d{4}")) {
                number = Integer.parseInt(userInput);
                valid = true;
            } else {
                out.println("Invalid input. Please enter a 4-digit integer.\n");
            }
        }


        // Encryption
        if (CipherService.equals("1")){
            // Step (a): Add 7 to each digit and modulus by 10
            int digit1 = ((number / 1000) + 7) % 10;
            int digit2 = ((number / 100) % 10 + 7) % 10;
            int digit3 = ((number / 10) % 10 + 7) % 10;
            int digit4 = (number % 10 + 7) % 10;

            // Step (b): Swap the digits
            int temp = digit1;
            digit1 = digit3;
            digit3 = temp;

            temp = digit2;
            digit2 = digit4;
            digit4 = temp;

            // Step (c): Form the new integer
            int encryptedNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;

            out.printf("Encrypted interger is %04d%n",encryptedNumber);
        }

        // Decryption
        if (CipherService.equals("2")){
            // Step (a): Add 3 to each digit and modulus by 10
            int digit1 = ((number / 1000) + 3) % 10;
            int digit2 = ((number / 100) % 10 + 3) % 10;
            int digit3 = ((number / 10) % 10 + 3) % 10;
            int digit4 = (number % 10 + 3) % 10;

            // Step (b): Swap the digits
            int temp = digit1;
            digit1 = digit3;
            digit3 = temp;

            temp = digit2;
            digit2 = digit4;
            digit4 = temp;

            // Step (c): Form the new integer
            int encryptedNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;

            out.printf("Decrypted interger is %04d%n",encryptedNumber);
        }
        scanner.close();
    }
}