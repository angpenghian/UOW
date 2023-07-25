import math

class Circle_5:
    def main(self):
        
        # Read a real number and assign to radius
        radius = int(input("Enter the radius of the circle: "))
        
        # Compuet the area and its perimeter
        area = math.pi * radius * radius
        perimeter = 2.0 * math.pi * radius
        
		# Display the results
		# Using the +, known as concatenation i.e joining them together
		# More decoration of output, \n means leave a blank line
		#                                             \t means have a tab key before printing
        print("\nCircle information")
        print("\tGiven radius = ", radius)
        print("\tArea = ", area)
        print("\tPerimeter = ", perimeter)
        
circle_5 = Circle_5()
circle_5.main()