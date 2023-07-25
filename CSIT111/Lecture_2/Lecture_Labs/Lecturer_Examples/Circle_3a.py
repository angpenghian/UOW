import math
import random

class Circle_3a:
    def main(self):
        
        # Generate a random value and assign to radius
        radius = random.random()
        
        # Compute its area and its perimeter
        area = math.pi * radius * radius
        perimeter = 2.0 * math.pi * radius
        
        # Display the results
        print("The area is", area)
        print("Area = ", area)
        print("Perimeter = ", perimeter)
        
circle_3a = Circle_3a()
circle_3a.main()