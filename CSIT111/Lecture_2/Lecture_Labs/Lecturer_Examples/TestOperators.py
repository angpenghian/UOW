class TestOperators:
    def main(self):
        
        m = 1234
        
        # How to get the last digit of m?
        lastDigit = m % 10
        print("The last digit of ",m," is ",lastDigit)
        
        # What about the last 2 digits of m?
        last2Digits = m % 100
        print("The last 2 digits of ",m," is ",last2Digits)
        
        # How to remove the last digit of m?
        print("After removing the last digit of ", m)
        m = m // 10			# Integer division
        print(", the new inter is ", m)
        
testoperators = TestOperators()
testoperators.main()