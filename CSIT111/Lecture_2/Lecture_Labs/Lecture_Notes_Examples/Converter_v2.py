class Converter_v2:
    def main():
        COEFFICIENT = 1.60935 # local variables
        distInMiles = float(input("Enter distance in miles: ")) # input the typed number
        
        distInKm = distInMiles * COEFFICIENT
        print("Distance in km is", distInKm)
        
converter_2 = Converter_v2
converter_2.main()