# A program that converts miles into kilometres
# input: distance in miles > output: distance in kilometres
class Converter:
    # --- fields ---
    disInmiles = 0.0
    disInKilometers = 0.0
    COEFFICIENT = 1.60935
    # --- definition of the method main() ---
    def main(self):
        # Create a scanner that can numbers, or words
        disInMiles = float(input("Enter the distance in miles: ")) # input a number typed by a user
        # calculate the distance
        disInKilometers = disInMiles * self.COEFFICIENT
        # output the result
        print(str(disInMiles) + " miles is " + str(disInKilometers) + " kilometres")

converter = Converter()
converter.main()