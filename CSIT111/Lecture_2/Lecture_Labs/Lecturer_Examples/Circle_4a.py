import math
import random

class Circle_4a:
    def main(self):
        
		# Generate a random value and assign to radius
		# This value is between 0 and 100
        radius = random.random() * 100
        
        # Compuete its area and its perimeter
        area = math.pi * radius * radius
        perimeter = 2.0 * math.pi * radius
        
        # Display the results
        print("Given radius = ", radius)
        print("Area = ", area)
        print("Perimeter = ", perimeter)
        
circle_4a = Circle_4a()
circle_4a.main()