PI = 3.14159256

class Circle_2b:
    
    def main(self):
        
        # Assign a value to radius
        radius = 123.4567
        
        # Compute its area and its perimeter
        area = PI * radius * radius
        perimeter = 2.0 * PI * radius
        
        # Display the results
        print("Given radius = ", radius)
        print("Area = ", area)
        print("Perimeter = ", perimeter)
        
circle_2b = Circle_2b()
circle_2b.main()