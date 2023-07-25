class Circle_2:
    def main(self):
        # Declare a constant pi
        PI = 3.14159
        
        # Assign a value to radius
        radius = 123.4567
        
        # Compute its area and its perimeter
        area = PI * radius * radius
        perimeter = 2.0 * PI * radius
        
        print("Given radius = " + str(radius))
        print("Area = " + str(area))
        print("Perimeter = " + str(perimeter))
        
circle_2 = Circle_2()
circle_2.main()