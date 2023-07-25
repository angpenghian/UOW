import math

class Circle_3:
    def main(self):
        
        # Assign a value to radius
        radius = 123.4567
        
        # Compute its area and its periemter
        area = math.pi * radius * radius
        perimeter = 2.0 * math.pi * radius
        
        # Display the results
        print("Given radius = ", radius)
        print("Area = ", area)
        print("Perimeter = ", perimeter)

circle_3 = Circle_3()
circle_3.main()