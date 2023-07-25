class PenghianAng_Lab2:
    def main(self):
        # Ask user if they want to encrypt or decrypt
        while True:
            try:
                user_input = int(input("Do you want to encrypt or decrypt?\n1. Encrypt\n2. Decrypt\nEnter (1/2): "))
                if user_input in [1, 2]:
                    if user_input == 1:
                        print("\nYou chose Encrypt\n")
                        break
                    else:
                        print("\nYou chose Decrypt\n")
                        break
                else:
                    print("\nInvalid input. Please enter (1/2).")
            except ValueError:
                print("\nInvalid input. Please enter (1/2).")

        # Validate user input if it's a string with 4 characters
        number = ""
        valid = False

        # Input validation
        while not valid:
            number = input("Enter a 4-digit number: ")
            if len(number) == 4 and number.isdigit():
                valid = True
            else:
                print("\nInvalid input. Please enter a 4-digit number.")
                
        number = int(number)

        # Encryption
        if user_input == 1:
            # Step (a): Add 7 to each digit and modulus by 10
            digit1 = ((number // 1000) + 7) % 10
            digit2 = (((number // 100) % 10) + 7) % 10
            digit3 = (((number // 10) % 10) + 7) % 10
            digit4 = ((number % 10) + 7) % 10

            # Step (b): Swap the first digit
            digit1, digit3 = digit3, digit1
            digit2, digit4 = digit4, digit2

            encrypted_number = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4
            print(f"Encrypted integer is {encrypted_number:04d}\n")

        # Decryption
        if user_input == 2:
            # Step (a): Add 3 to each digit and modulus by 10
            digit1 = ((number // 1000) + 3) % 10
            digit2 = (((number // 100) % 10) + 3) % 10
            digit3 = (((number // 10) % 10) + 3) % 10
            digit4 = ((number % 10) + 3) % 10
            
            # Step (b): Swap the first digit
            digit1, digit3 = digit3, digit1
            digit2, digit4 = digit4, digit2

            encrypted_number = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4
            print(f"Decrypted integer is {encrypted_number:04d}\n")

lab2 = PenghianAng_Lab2()
lab2.main()