# A simple program that calculates the average
class DataProcessor:
    def main(self):
        number1 = 3.2 # Assign values to number1
        number2 = 6.8 # Assign values to number2
        average = (number1 + number2) / 2 # Calculate the average
        print("The average = " + str(average)) # Display the average

processor = DataProcessor()
processor.main()