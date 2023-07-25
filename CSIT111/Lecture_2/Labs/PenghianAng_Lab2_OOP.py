class PenghianAng_Lab2_OOP:
    def main(self):
        
        cipherservice = CipherService()
        cipher = Cipher()
        cryption = cipherservice.startQuestion()
        number = cipherservice.integerValidation()

        if cryption == "Encrypt":
            cipher.encrypt(int(number))
        else:
            cipher.decrypt(int(number))


class CipherService:
    def startQuestion(self):
        cipherService = ""
        while True:
            try:
                userInput_EncryptOrDecrypt = int(input("Do you want to encrypt or decrypt?\n1. Encrypt\n2. Decrypt\nEnter (1/2): "))
                if userInput_EncryptOrDecrypt in [1, 2]:
                    if userInput_EncryptOrDecrypt == 1:
                        print("\nYou chose Encrypt\n")
                        cipherService = "Encrypt"
                        break
                    else:
                        print("\nYou chose Decrypt\n")
                        cipherService = "Decrypt"
                        break
                else:
                    print("\nInvalid input. Please enter (1/2).")
                    continue
            except ValueError:
                print("\nInvalid input. Please enter (1/2).")
                continue
        return cipherService

    def integerValidation(self):
        number = 0
        valid = False

        while not valid:
            try:
                userInput = int(input("Enter a 4-digit integer to be encrypted: "))
                valid = True
                if len(str(userInput)) == 4:
                    number += userInput
                    break
                else:
                    print("Invalid input. Please enter a 4-digit integer.\n")
                    valid = False
                    continue

            except ValueError:
                print("Invalid input. Please enter an integer.\n")
                continue
        return number


class Cipher:
    def encrypt(self, number):
        # Step (a): Add 7 to each digit and modulus by 10
        digit1 = ((number // 1000) + 7) % 10
        digit2 = ((number // 100) % 10 + 7) % 10
        digit3 = ((number // 10) % 10 + 7) % 10
        digit4 = (number % 10 + 7) % 10

        # Step (b): Swap the digits
        temp = digit1
        digit1 = digit3
        digit3 = temp

        temp = digit2
        digit2 = digit4
        digit4 = temp

        # Step (c): Print the encrypted integer
        encryptedNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4
        print(f"Encrypted integer is {encryptedNumber:04d}\n")

    def decrypt(self, number):
        # Step (a): Swap the digits
        digit1 = ((number // 1000) + 3) % 10
        digit2 = ((number // 100) % 10 + 3) % 10
        digit3 = ((number // 10) % 10 + 3) % 10
        digit4 = (number % 10 + 3) % 10

        # Step (b): Add 7 to each digit and modulus by 10
        temp = digit1
        digit1 = digit3
        digit3 = temp

        temp = digit2
        digit2 = digit4
        digit4 = temp

        # Step (c): Print the decrypted integer
        decryptedNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4
        print(f"Decrypted integer is {decryptedNumber:04d}\n")


lab2 = PenghianAng_Lab2_OOP()
lab2.main()
