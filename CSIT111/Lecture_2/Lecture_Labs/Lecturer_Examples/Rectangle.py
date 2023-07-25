class Rectangle:
    def main(self):
        
        # Prompt user to enter the length and the width
        length = int(input("Enter the length of the rectangle: "))
        width = int(input("Enter the width of the rectangle: "))
        
        # Compute the area and the perimeter
        area = length * width
        perimeter = 2 * (length + width)
        
        # Display the info
        print("\nRectangle information")
        print("\tLength = ", length)
        print("\tWidth = ", width)
        print("\tArea = ", area)
        print("\tPerimeter = ", perimeter)
        
rectangle = Rectangle()
rectangle.main()
