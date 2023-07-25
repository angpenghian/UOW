class TestSwap_2:
    def main(self):
        
        m = 123
        n = 456
        
        print("Before the swaps")
        print("\nm = ", m)
        print("\nn = ", n)
        
        # How to swap? We need to use some temporary location(s)
        # to store the information
        temp = m
        m = n
        n = temp
        
        print("\nAfter the swaps")
        print("\nm = ", m)
        print("\nn = ", n)
        
testswap_2 = TestSwap_2()
testswap_2.main()