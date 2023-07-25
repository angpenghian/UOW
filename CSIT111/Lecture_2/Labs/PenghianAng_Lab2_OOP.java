import static java.lang.System.out;
import java.util.Scanner;

public class PenghianAng_Lab2_OOP {
    public static void main(String[] args) {
        CipherService cipherService = new CipherService();
        String result = cipherService.startQuestion();
        int number = cipherService.integerValidation();

        if (result.equals("encrypt")) {
            Cipher cipher = new Cipher();
            out.printf("Encrypted interger is %04d%n" ,(cipher.encrypt(number)));
        } else {
            Cipher cipher = new Cipher();
            out.printf("Decrypted interger is %04d%n", (cipher.decrypt(number)));
        }

        // Close the Scanner object after using it
        cipherService.closeScanner();
    }
}

class CipherService {
    private Scanner scanner;

    public CipherService() {
        this.scanner = new Scanner(System.in);
    }

    public String startQuestion() {
        String cipherService = "";

        while (true) {
            out.print("Do you want to encrypt or decrypt?\n1. Encrypt\n2. Decrypt\nEnter (1/2): ");
            String userInput_EncryptOrDecrypt = scanner.nextLine();

            if (userInput_EncryptOrDecrypt.equals("1")) {
                out.println("\nYou chose Encrypt\n");
                cipherService = "encrypt";
                break;
            } else if (userInput_EncryptOrDecrypt.equals("2")) {
                out.println("\nYou chose Decrypt\n");
                cipherService = "decrypt";
                break;
            } else {
                out.println("\nInvalid input. Please enter (1/2).");
            }
        }
        return cipherService;
    }

    public int integerValidation() {
        int number = 0;
        boolean valid = false;

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
        return number;
    }

    public void closeScanner() {
        scanner.close();
    }
}

class Cipher {
    public int encrypt(int number) {
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

        // Step (c): Print the encrypted integer
        int encryptedNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        return encryptedNumber;
    }

    public int decrypt(int number) {
        // Step (a): Swap the digits
        int digit1 = ((number / 1000) + 3) % 10;
        int digit2 = ((number / 100) % 10 + 3) % 10;
        int digit3 = ((number / 10) % 10 + 3) % 10;
        int digit4 = (number % 10 + 3) % 10;

        // Step (b): Add 7 to each digit and modulus by 10
        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        // Step (c): Print the decrypted integer
        int decryptedNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        return decryptedNumber;
    }
}
