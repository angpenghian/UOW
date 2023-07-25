class Circle_2a:
    def main(self):
        
        # Declare a constant pi
        PI = 3.14159256
        
        # Assign a value to radius
        radius = 123.4567
        
        # Compute its area and its perimeter
        area = PI * radius * radius
        perimeter = 2.0 * PI * radius
        
        # Display the results
        print("Given radius = " + str(radius))
        print("Area is " + str(area))
        print("Perimeter is " + str(perimeter))
        
circle_2a = Circle_2a
circle_2a().main()