import math
import random

class Circle_3c:
    def main(self):
        
		# Generate a random value and assign to radius
		# This value is between 0 and 10
        radius = random.random() * 10
        
        # Compute its area and its perimeter
        area = math.pi * radius * radius
        perimeter = 2.0 * math.pi * radius
        
        # Display the results
        print("The area is", area)
        print("Area = ", area)
        print("Perimeter = ", perimeter)
        
circle_3c = Circle_3c()
circle_3c.main()